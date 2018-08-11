package com.sriharish.pg.clientaccommodation.domain;

import com.sriharish.pg.clientaccommodation.constants.RoleType;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.UUID;

@Data
@Document
public class Staff {
    private UUID uuid;
    @Id
    private String id;
    private String name;
    private RoleType role;
    private String mobileNumber;
    private String adhaarNumber;
    private Address address;
    private String identity;
    private String email;
    private double salary;
}
