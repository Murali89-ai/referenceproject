
package com.wu.brwallet.customer.profile.model.common.gateway.xrsi;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for security_question_answers complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="security_question_answers">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="question_answer" type="{http://www.westernunion.com/schema/xrsi}security_question_answer" maxOccurs="4" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "security_question_answers", propOrder = {
    "questionAnswer"
})
public class SecurityQuestionAnswers {

    @XmlElement(name = "question_answer")
    protected List<SecurityQuestionAnswer> questionAnswer;

    /**
     * Gets the value of the questionAnswer property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the questionAnswer property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getQuestionAnswer().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SecurityQuestionAnswer }
     * 
     * 
     * @return
     *     The value of the questionAnswer property.
     */
    public List<SecurityQuestionAnswer> getQuestionAnswer() {
        if (questionAnswer == null) {
            questionAnswer = new ArrayList<>();
        }
        return this.questionAnswer;
    }

}
