package com.sriharish.pg.clientaccommodation.service.floor;

import com.sriharish.pg.clientaccommodation.domain.Floor;

import java.util.List;
import java.util.Optional;

public interface FloorService {
    Floor createFloor(Floor floor);
    void deleteFloor(String id);
    Floor updateFloor(Floor floor);
    Optional<Floor> getFloor(String id);
    List<Floor> getAllFloors();
}
