package com.wu.brwallet.customer.profile.util;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.ObjectNode;
import lombok.experimental.UtilityClass;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;
import java.util.Map;

@UtilityClass
public class Utility {

    public static JsonNode maskPayload(JsonNode request, Map<String, String> maskingFields) {
        if (request == null || request.isEmpty() || maskingFields == null || maskingFields.isEmpty()) {
            return request;
        }
        if (request.isObject()) {
            request.fields().forEachRemaining(
                    element -> {
                        String fieldName = element.getKey();
                        JsonNode childNode = element.getValue();

                        if ((childNode.isTextual() || childNode.isNumber()) && maskingFields.containsKey(fieldName)) {
                            ((ObjectNode) request).put(fieldName, maskField(childNode.asText(), maskingFields.get(fieldName)));
                        } else {
                            maskPayload(childNode, maskingFields);
                        }
                    });
        } else if (request.isArray()) {
            for (JsonNode node : request) {
                maskPayload(node, maskingFields);
            }
        }
        return request;
    }

    /**
     * Masks sensitive fields in XML payload
     * @param xmlPayload XML string to be masked
     * @param maskingFields Map of field names to masking properties
     * @return Masked XML string
     */
    public static String maskPayload(String xmlPayload, Map<String, String> maskingFields) {
        if (xmlPayload == null || xmlPayload.isEmpty() || maskingFields == null || maskingFields.isEmpty()) {
            return xmlPayload;
        }

        try {
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();
            Document document = builder.parse(new InputSource(new StringReader(xmlPayload)));

            processNode(document.getDocumentElement(), maskingFields);

            TransformerFactory transformerFactory = TransformerFactory.newInstance();
            Transformer transformer = transformerFactory.newTransformer();
            StringWriter writer = new StringWriter();
            transformer.transform(new DOMSource(document), new StreamResult(writer));

            return writer.toString();
        } catch (ParserConfigurationException | SAXException | IOException | TransformerException e) {
            System.err.println("Error masking XML payload: " + e.getMessage());
            return xmlPayload;
        }
    }

    /**
     * Recursively processes XML nodes to apply masking
     * @param node Current node to process
     * @param maskingFields Map of field names to masking properties
     */
    private static void processNode(Node node, Map<String, String> maskingFields) {
        if (node.getNodeType() == Node.ELEMENT_NODE) {
            String nodeName = node.getNodeName();
            if (nodeName.contains(":")) {
                nodeName = nodeName.substring(nodeName.indexOf(":") + 1);
            }

            if (maskingFields.containsKey(nodeName) && node.getTextContent() != null && !node.getTextContent().isEmpty()) {
                node.setTextContent(maskField(node.getTextContent(), maskingFields.get(nodeName)));
            }

            if (node.hasAttributes()) {
                for (int i = 0; i < node.getAttributes().getLength(); i++) {
                    Node attr = node.getAttributes().item(i);
                    String attrName = attr.getNodeName();
                    if (maskingFields.containsKey(attrName)) {
                        attr.setNodeValue(maskField(attr.getNodeValue(), maskingFields.get(attrName)));
                    }
                }
            }
        }

        NodeList children = node.getChildNodes();
        for (int i = 0; i < children.getLength(); i++) {
            processNode(children.item(i), maskingFields);
        }
    }

    private String maskField(String valueToBeMasked, String maskingProperties) {
        if (valueToBeMasked == null || valueToBeMasked.isEmpty()) {
            return valueToBeMasked;
        } else {
            StringBuilder maskedValue = new StringBuilder(valueToBeMasked);
            if (maskingProperties == null) {
                for (int i = 0; i < valueToBeMasked.length() && i < 5; i++) {
                    maskedValue.setCharAt(i, '*');
                }
            } else {
                String[] properties = maskingProperties.split("\\|");

                int startPosition = Integer.parseInt(properties[0]);
                int endPosition = Integer.parseInt(properties[1]);
                char maskingType = properties[2].charAt(0);
                if (maskingType == 'S') {
                    for (int i = 0; i < valueToBeMasked.length() && i < startPosition; i++) {
                        maskedValue.setCharAt(i, '*');
                    }

                    for (int i = valueToBeMasked.length() - endPosition; i < valueToBeMasked.length(); i++) {
                        if (i >= 0)
                            maskedValue.setCharAt(i, '*');
                    }
                } else if (maskingType == 'M') {
                    for (int i = startPosition; i < valueToBeMasked.length() - endPosition; i++) {
                        if (i >= 0)
                            maskedValue.setCharAt(i, '*');
                    }
                }
            }
            return maskedValue.toString();
        }
    }
}
