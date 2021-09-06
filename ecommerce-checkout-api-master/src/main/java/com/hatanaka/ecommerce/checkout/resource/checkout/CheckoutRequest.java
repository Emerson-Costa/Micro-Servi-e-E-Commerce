package com.hatanaka.ecommerce.checkout.resource.checkout;

import lombok.Data;

@Data // Getters, Setters e Construtores
public class CheckoutRequest {

    private String firstName;
    private String lastName;
    private String enail;
    private String address;
    private String complement;
    private String country;
    private String state;
    private String cep;
    private Boolean saveAddress;
    private Boolean saveInfo;
    private String paymentMethod;
    private String cardName;
    private String cardNumber;
    private String cadDate;
    private String cardCvv;


}
