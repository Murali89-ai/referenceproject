package com.wu.brwallet.customer.profile.model.response.biz;

import lombok.Data;

import java.util.List;

@Data
public class BizGetCardDetailsResponse {
    private List<CardContent> Content;
    private boolean FirstPage;
    private boolean LastPage;
    private boolean HasContent;
    private boolean HasNextPage;
    private boolean HasPreviousPage;
    private int Page;
    private int Elements;
    private int NextPage;
    private int PreviousPage;
    private int TotalElements;
    private int TotalPages;

    @Data
    public static class CardContent {
        private String id;
        private int issuerId;
        private String issuer;
        private int branchOfficeId;
        private String branchOffice;
        private int productId;
        private String product;
        private int affinityGroupId;
        private String affinityGroup;
        private String document;
        private String documentType;
        private int documentTypeId;
        private String accountId;
        private int accountNumber;
        private String cardId;
        private int sequenceCard;
        private int cardTypeId;
        private String cardType;
        private int plasticColourId;
        private String plasticColour;
        private String cardHolderType;
        private String cardNumberMask;
        private String cardName;
        private String expirationDate;
        private String includeDate;
        private int statusId;
        private String status;
        private int statusGroupId;
        private String statusGroup;
        private String statusDate;
        private String levelAccount;
        private String yesOrNoOverLimit;
        private int cardSequenceNumber;
        private String shippingType;
        private String embossingCompany;
        private String deliveryCompany;
        private int controlDeliveryNumber;
        private int embossingPartId;
        private int deliveryPartId;
        private String receiverName;
        private double receiverDocument;
        private String deliveryDate;
        private String photo;
        private String virtualCard;
        private boolean associated;
        private boolean additional;
        private String virtualCardType;
        private boolean allowsReprint;
        private boolean applyBlockAut;
    }
}
