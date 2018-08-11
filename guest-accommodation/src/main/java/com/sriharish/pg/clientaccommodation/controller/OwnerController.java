package com.sriharish.pg.clientaccommodation.controller;

import com.sriharish.pg.clientaccommodation.domain.Owner;
import com.sriharish.pg.clientaccommodation.service.owner.OwnerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/v1/owner")
public class OwnerController {

    @Autowired
    OwnerService ownerService;

    @RequestMapping(path = "/create",method = RequestMethod.POST,consumes = MediaType.APPLICATION_JSON_VALUE,produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity createOwner(@RequestBody Owner owner){
        owner = ownerService.createOwner(owner);
        return new ResponseEntity(owner,HttpStatus.CREATED);
    }

    @RequestMapping(path = "/delete",method = RequestMethod.DELETE,consumes = MediaType.APPLICATION_JSON_VALUE,produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity deleteOwner(@RequestBody Owner owner){
        ownerService.deleteOwner(owner.getId());
        return new ResponseEntity(owner,HttpStatus.OK);
    }

    @RequestMapping(path = "/update",method = RequestMethod.POST,consumes = MediaType.APPLICATION_JSON_VALUE,produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity updateOwner(@RequestBody Owner owner){
        owner = ownerService.updateOwner(owner);
        return new ResponseEntity(owner,HttpStatus.OK);
    }

    @RequestMapping(path = "/get/{ownerId}",method = RequestMethod.GET,consumes = MediaType.APPLICATION_JSON_VALUE,produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity getOwner(@PathVariable String ownerId){
        Optional<Owner> owner = ownerService.getOwner(ownerId);
        return new ResponseEntity(owner,HttpStatus.OK);
    }
    @RequestMapping(path = "/get",method = RequestMethod.GET,consumes = MediaType.APPLICATION_JSON_VALUE,produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity getRooms(){
        List<Owner> owners = ownerService.getAllOwner();
        return new ResponseEntity(owners,HttpStatus.OK);
    }
}
