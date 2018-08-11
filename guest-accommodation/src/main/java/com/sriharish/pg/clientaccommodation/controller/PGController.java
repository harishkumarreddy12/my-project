package com.sriharish.pg.clientaccommodation.controller;

import com.sriharish.pg.clientaccommodation.domain.PG;
import com.sriharish.pg.clientaccommodation.service.pg.PGService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/v1/pg")
public class PGController {
    @Autowired
    PGService pGService;

    @RequestMapping(path = "/create",method = RequestMethod.POST,consumes = MediaType.APPLICATION_JSON_VALUE,produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity createPG(@RequestBody PG pg){
        pg = pGService.createPG(pg);
        return new ResponseEntity(pg,HttpStatus.CREATED);
    }

    @RequestMapping(path = "/delete",method = RequestMethod.DELETE,consumes = MediaType.APPLICATION_JSON_VALUE,produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity deletePG(@RequestBody PG pg){
        pGService.deletePG(pg.getId());
        return new ResponseEntity(pg,HttpStatus.OK);
    }

    @RequestMapping(path = "/update",method = RequestMethod.POST,consumes = MediaType.APPLICATION_JSON_VALUE,produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity updatePG(@RequestBody PG pg){
        pg = pGService.updatePG(pg);
        return new ResponseEntity(pg,HttpStatus.OK);
    }

    @RequestMapping(path = "/get/{pGId}",method = RequestMethod.GET,consumes = MediaType.APPLICATION_JSON_VALUE,produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity getPG(@PathVariable String pGId){
        Optional<PG> pg =  pGService.getPG(pGId);
        return new ResponseEntity(pg,HttpStatus.OK);
    }

    @RequestMapping(path = "/get",method = RequestMethod.GET,consumes = MediaType.APPLICATION_JSON_VALUE,produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity getRooms(){
        List<PG> pgs = pGService.getAllPG();
        return new ResponseEntity(pgs,HttpStatus.OK);
    }
}
