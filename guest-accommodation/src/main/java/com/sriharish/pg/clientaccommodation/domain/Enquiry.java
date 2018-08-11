package com.sriharish.pg.clientaccommodation.domain;

import com.sriharish.pg.clientaccommodation.constants.BloodGroup;
import com.sriharish.pg.clientaccommodation.constants.FoodType;
import com.sriharish.pg.clientaccommodation.constants.StayType;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;
import java.util.UUID;

@Data
@Document
public class Enquiry {
    private UUID uuid;
    @Id
    private String id;
    private String name;
    private String number;
    private String enquiryDate;
    private Date bookingDate;
    private StayType stayType;
    private FoodType foodType;
    private String email;
    private Address permanentAddress;
    private double advance;
}
