package com.sriharish.pg.clientaccommodation.controller;

import com.sriharish.pg.clientaccommodation.domain.*;
import com.sriharish.pg.clientaccommodation.service.guest.GuestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/v1/guest")
public class GuestController {
    @Autowired
    GuestService guestService;

    @RequestMapping(path = "/create",method = RequestMethod.POST,consumes = MediaType.APPLICATION_JSON_VALUE,produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity createRoom(@RequestBody Guest guest){
        guest = guestService.createGuest(guest);
        return new ResponseEntity(guest,HttpStatus.CREATED);
    }

    @RequestMapping(path = "/delete",method = RequestMethod.DELETE,consumes = MediaType.APPLICATION_JSON_VALUE,produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity deleteRoom(@RequestBody Guest guest){
        guestService.deleteGuest(guest.getId());
        return new ResponseEntity(guest,HttpStatus.OK);
    }

    @RequestMapping(path = "/update",method = RequestMethod.POST,consumes = MediaType.APPLICATION_JSON_VALUE,produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity updateRoom(@RequestBody Guest guest){
        guestService.updateGuest(guest);
        return new ResponseEntity(guest,HttpStatus.OK);
    }

    @RequestMapping(path = "/get/{guestId}",method = RequestMethod.GET,consumes = MediaType.APPLICATION_JSON_VALUE,produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity getRoom(@PathVariable String guestId){
        Optional<Guest> guest = guestService.getGuest(guestId);
        return new ResponseEntity(guest,HttpStatus.OK);
    }

    @RequestMapping(path = "/get",method = RequestMethod.GET,consumes = MediaType.APPLICATION_JSON_VALUE,produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity getRooms(){
        List<Guest> guests = guestService.getAllGuest();
        return new ResponseEntity(guests,HttpStatus.OK);
    }

}
