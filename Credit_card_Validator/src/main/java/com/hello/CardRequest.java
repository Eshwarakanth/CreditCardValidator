package com.hello;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public class CardRequest {

    @NotBlank(message = "cardNumber is required")
    @CreditCard
    private String cardNumber;

    @NotBlank(message = "expiry is required")
    @Size(min = 5, max = 5, message = "expiry should be MM/YY")
    private String expiry;

   @NotBlank(message = "cvv is required")
    @Size(min = 3, max = 4)
    private String cvv;

    // getters & setters
    public String getCardNumber()
    { return cardNumber; }
    public void setCardNumber(String cardNumber) 
    { this.cardNumber = cardNumber; }
    public String getExpiry() 
    { return expiry; }
    public void setExpiry(String expiry) 
    { this.expiry = expiry; }
    public String getCvv()
    { return cvv; }
    public void setCvv(String cvv)
    { this.cvv = cvv; }
}
