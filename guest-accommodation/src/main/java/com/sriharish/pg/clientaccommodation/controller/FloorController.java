package com.sriharish.pg.clientaccommodation.controller;

import com.sriharish.pg.clientaccommodation.domain.Floor;
import com.sriharish.pg.clientaccommodation.service.floor.FloorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/v1/floor")
public class FloorController {

    @Autowired
    FloorService floorService;

    @RequestMapping(path = "/create",method = RequestMethod.POST,consumes = MediaType.APPLICATION_JSON_VALUE,produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity createFloor(@RequestBody Floor floor){
        floor = floorService.createFloor(floor);
    return new ResponseEntity(floor,HttpStatus.CREATED);
    }

    @RequestMapping(path = "/delete",method = RequestMethod.DELETE,consumes = MediaType.APPLICATION_JSON_VALUE,produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity deleteFloor(@RequestBody Floor floor){
        floorService.deleteFloor(floor.getId());
    return new ResponseEntity(floor,HttpStatus.OK);
    }

    @RequestMapping(path = "/update",method = RequestMethod.POST,consumes = MediaType.APPLICATION_JSON_VALUE,produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity updateFloor(@RequestBody Floor floor){
        floorService.updateFloor(floor);
    return new ResponseEntity(floor,HttpStatus.OK);
    }

    @RequestMapping(path = "/get/{floorId}",method = RequestMethod.GET,consumes = MediaType.APPLICATION_JSON_VALUE,produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity getFloor(@PathVariable String floorId){
        Optional<Floor> floor = floorService.getFloor(floorId);
    return new ResponseEntity(floor,HttpStatus.OK);
    }

    @RequestMapping(path = "/get",method = RequestMethod.GET,consumes = MediaType.APPLICATION_JSON_VALUE,produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity getFloor(){
        List<Floor> floors = floorService.getAllFloors();
    return new ResponseEntity(floors,HttpStatus.OK);
    }

}
