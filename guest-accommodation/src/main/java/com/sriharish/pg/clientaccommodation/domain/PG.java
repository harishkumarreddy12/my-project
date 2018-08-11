package com.sriharish.pg.clientaccommodation.domain;

import com.sriharish.pg.clientaccommodation.constants.TypeOfAccommodation;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;
import java.util.UUID;

@Data
@Document
public class PG {
    private UUID uuid;
    @Id
    private String id;
    private Owner owner;
    private String email;
    private String name;
    private Address address;
    private String licenseNumber;
    private String mobileNumber;
    private TypeOfAccommodation accommodation;
    private boolean isLiftAvailable;
    private int totalFloors;
    private boolean isMinaralWaterAvailable;
    private boolean isSecurityAvailable;
    private boolean isCCTVAvailable;
    private boolean isParkingAvailable;
    private boolean isDainingAvailable;
    private boolean isSofaAvailable;
    private List<Staff> cheffDetails;
}
