package com.sriharish.pg.clientaccommodation.domain;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;
import java.util.UUID;

@Data
@Document
public class Block {

    private UUID uuid;
    @Id
    private String id;
    private String blockName;
    private String blockNumber;
    private int totalFloors;
    private boolean isSecurityAvailable;
    private boolean isParkingAvailable;
    private List<Floor> floors;
}
