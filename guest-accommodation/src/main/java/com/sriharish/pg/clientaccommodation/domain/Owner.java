package com.sriharish.pg.clientaccommodation.domain;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.annotation.Generated;
import java.util.UUID;

@Data
@Document
public class Owner {
    private UUID uuid;
    @Id
    private String id;
    private String name;
    private String number;
    private String email;
    private String aadharNumber;
    private Address address;
    private String panNumber;
}
