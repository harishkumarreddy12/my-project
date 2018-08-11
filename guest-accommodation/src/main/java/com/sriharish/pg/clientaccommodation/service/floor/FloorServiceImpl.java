package com.sriharish.pg.clientaccommodation.service.floor;

import com.sriharish.pg.clientaccommodation.domain.Floor;
import com.sriharish.pg.clientaccommodation.repository.floor.FloorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class FloorServiceImpl implements FloorService{
    @Autowired
    FloorRepository floorRepository;

    @Override
    public Floor createFloor(Floor floor) {
        floor.setUuid(UUID.randomUUID());
        return (Floor) floorRepository.save(floor);
    }

    @Override
    public void deleteFloor(String id) {
        floorRepository.deleteById(id);
    }

    @Override
    public Floor updateFloor(Floor floor) {
        return (Floor) floorRepository.save(floor);
    }

    @Override
    public Optional<Floor> getFloor(String id) {
        return floorRepository.findById(id);
    }

    @Override
    public List<Floor> getAllFloors() {
        return floorRepository.findAll();
    }
}
