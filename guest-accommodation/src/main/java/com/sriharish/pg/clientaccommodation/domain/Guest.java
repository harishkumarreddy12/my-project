package com.sriharish.pg.clientaccommodation.domain;

import com.sriharish.pg.clientaccommodation.constants.BloodGroup;
import com.sriharish.pg.clientaccommodation.constants.FoodType;
import com.sriharish.pg.clientaccommodation.constants.StayType;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;
import java.util.UUID;

@Data
@Document
public class Guest {
    private UUID uuid;
    @Id
    private String id;
    private String name;
    private String number;
    private String aadharNumber;
    private Date dob;
    private String identity;
    private double advance;
    private double rent;
    private Date bookingDate;
    private Date checkInDate;
    private StayType stayType;
    private String photo;
    private Date checkOutDate;
    private FoodType foodType;
    private String email;
    private String emergencyContactName;
    private String emergencyContactNumber;
    private BloodGroup bloodGroup;
    private Address permanentAddress;
    private boolean isWorking;
    private String workingCompany;
    private ReferenceDetails referenceDetails;
}
