package com.hellofresh.data;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PaymentCard {
    private String number;
    private String expiration;
    private String cvc;

    public PaymentCard getCreditCard() {
        return new PaymentCard("111111111111","08/18", "737");
    }
}
