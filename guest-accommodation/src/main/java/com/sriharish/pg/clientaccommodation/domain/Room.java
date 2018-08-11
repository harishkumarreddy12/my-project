package com.sriharish.pg.clientaccommodation.domain;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;
import java.util.UUID;

@Data
@Document
public class Room {
    private UUID uuid;
    @Id
    private String id;
    private int totalBeds;
    private String roomNo;
    private boolean isWardboardAvailable;
    private  String bedNameStatrsWith;
    private boolean isFanAvailable;
    private boolean isLightAvailable;
    private boolean isWIfiAvailable;
    private boolean isTVAvailable;
    private boolean isAttachedBathroomAvailable;
    private boolean isGeyserAvailable;
    private boolean isShowerAvailable;
    private boolean isBasinAvailable;
    private boolean isBucketAvailable;
    private boolean isMugAvailable;
    private boolean isBathRoomLightAvailablel;
    private boolean isBedLightAvailable;
    private boolean isCurtainsAvailable;
    private boolean isBalconyAvailable;
    private boolean isTVRemoteAvailable;
    private boolean isACRemoteAvailable;
    private boolean isReadingTableAvailable;
    private boolean isRefrigeratorAvailable;
    private boolean isSoapStandAvailable;
    private int totalKeys;
    private boolean isDoorMatAvailable;
    private boolean isBedCoversAvailable;
    private boolean isCallingBellAvailable;
    private  boolean isHangersAvailable;
    private int totalHangers;
    private boolean isACAvailable;
    private boolean isDTHAvailable;
    private boolean isRoomClean;
    private List<Guest> guests;
    private boolean isToiletAvailable;
    private boolean isWashingMachineAvailable;
}
