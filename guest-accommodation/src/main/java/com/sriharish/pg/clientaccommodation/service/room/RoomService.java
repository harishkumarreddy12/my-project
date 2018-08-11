package com.sriharish.pg.clientaccommodation.service.room;

import com.sriharish.pg.clientaccommodation.domain.Floor;
import com.sriharish.pg.clientaccommodation.domain.Room;

import java.util.List;
import java.util.Optional;

public interface RoomService {
    Room createRoom(Room pg);
    void deleteRoom(String id);
    Room updateRoom(Room pg);
    Optional<Room> getRoom(String id);
    List<Room> getAllRoom();
}

