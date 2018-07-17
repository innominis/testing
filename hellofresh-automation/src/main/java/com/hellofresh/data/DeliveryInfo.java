package com.hellofresh.data;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class DeliveryInfo {
    private String firstName;
    private String lastName;
    private String address;
    private String city;
    private String postCode;
    private String phone;

    public DeliveryInfo getDeliveryInfo() {
        return new DeliveryInfo("Darth", "Vader", "Torstrasse 6", "Berlin", "10190", "0498787654");
    }
}
