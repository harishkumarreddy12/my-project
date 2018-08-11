package com.sriharish.pg.clientaccommodation.domain;

import com.sriharish.pg.clientaccommodation.constants.Country;
import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document
public class Address {

    private String doorNo;
    private String street;
    private String city;
    private String state;
    private Country country;
    private String landMark;
    private String latitude;
    private String longitude;
    private String pinCode;
    private String anyOther;
}
