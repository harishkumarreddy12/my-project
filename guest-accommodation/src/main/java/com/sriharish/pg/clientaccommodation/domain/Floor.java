package com.sriharish.pg.clientaccommodation.domain;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;
import java.util.UUID;

@Data
@Document
public class Floor {

    private UUID uuid;
    @Id
    private String id;
    private String floorName;
    private String floorNumber;
    private int totalRooms;
    private  String floorNameStatrsWith;
    private boolean isLiftAvailable;
    private boolean isLightsAvailable;
    private boolean isDustbinAvailable;
    private boolean isWashingMachineAvailable;
    private List<Room> rooms;
}
