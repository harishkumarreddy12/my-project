package com.sriharish.pg.clientaccommodation.controller;

import com.sriharish.pg.clientaccommodation.domain.Room;
import com.sriharish.pg.clientaccommodation.service.room.RoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/v1/room")
public class RoomController {

    @Autowired
    RoomService roomService;

    @RequestMapping(path = "/create",method = RequestMethod.POST,consumes = MediaType.APPLICATION_JSON_VALUE,produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity createRoom(@RequestBody Room room){
        room = roomService.createRoom(room);
        return new ResponseEntity(room,HttpStatus.CREATED);
    }

    @RequestMapping(path = "/delete",method = RequestMethod.DELETE,consumes = MediaType.APPLICATION_JSON_VALUE,produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity deleteRoom(@RequestBody Room room){
        roomService.deleteRoom(room.getId());
        return new ResponseEntity(room,HttpStatus.OK);
    }

    @RequestMapping(path = "/update",method = RequestMethod.POST,consumes = MediaType.APPLICATION_JSON_VALUE,produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity updateRoom(@RequestBody Room room){
        room = roomService.updateRoom(room);
        return new ResponseEntity(room,HttpStatus.OK);
    }

    @RequestMapping(path = "/get/{roomId}",method = RequestMethod.GET,consumes = MediaType.APPLICATION_JSON_VALUE,produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity getRoom(@PathVariable String roomId){
        Optional<Room> room = roomService.getRoom(roomId);
        return new ResponseEntity(room,HttpStatus.OK);
    }

    @RequestMapping(path = "/get",method = RequestMethod.GET,consumes = MediaType.APPLICATION_JSON_VALUE,produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity getRooms(){
        List<Room> rooms = roomService.getAllRoom();
        return new ResponseEntity(rooms,HttpStatus.OK);
    }
}
