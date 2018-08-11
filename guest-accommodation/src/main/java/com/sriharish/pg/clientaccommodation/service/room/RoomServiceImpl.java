package com.sriharish.pg.clientaccommodation.service.room;

import com.sriharish.pg.clientaccommodation.domain.Room;
import com.sriharish.pg.clientaccommodation.repository.room.RoomRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class RoomServiceImpl implements RoomService{
    @Autowired
    RoomRepository roomRepository;

    @Override
    public Room createRoom(Room room) {
        room.setUuid(UUID.randomUUID());
        return roomRepository.save(room);
    }

    @Override
    public void deleteRoom(String id) {
        roomRepository.deleteById(id);
    }

    @Override
    public Room updateRoom(Room room) {
        return roomRepository.save(room);
    }

    @Override
    public Optional<Room> getRoom(String id) {
        return roomRepository.findById(id);
    }

    @Override
    public List<Room> getAllRoom() {
        return roomRepository.findAll();
    }
}
