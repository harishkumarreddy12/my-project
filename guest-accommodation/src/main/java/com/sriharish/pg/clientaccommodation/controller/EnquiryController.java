package com.sriharish.pg.clientaccommodation.controller;

import com.sriharish.pg.clientaccommodation.domain.Enquiry;
import com.sriharish.pg.clientaccommodation.service.enquiry.EnquiryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/v1/enquiry")
public class EnquiryController {

    @Autowired
    EnquiryService enquiryService;

    @RequestMapping(path = "/create",method = RequestMethod.POST,consumes = MediaType.APPLICATION_JSON_VALUE,produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity createEnquiry(@RequestBody Enquiry enquiry){
        enquiry = enquiryService.createEnquiry(enquiry);
    return new ResponseEntity(enquiry,HttpStatus.CREATED);
    }

    @RequestMapping(path = "/delete",method = RequestMethod.DELETE,consumes = MediaType.APPLICATION_JSON_VALUE,produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity deleteEnquiry(@RequestBody Enquiry enquiry){
        enquiryService.deleteEnquiry(enquiry.getId());
    return new ResponseEntity(enquiry,HttpStatus.OK);
    }

    @RequestMapping(path = "/update",method = RequestMethod.POST,consumes = MediaType.APPLICATION_JSON_VALUE,produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity updateEnquiry(@RequestBody Enquiry enquiry){
        enquiryService.updateEnquiry(enquiry);
    return new ResponseEntity(enquiry,HttpStatus.OK);
    }

    @RequestMapping(path = "/get/{floorId}",method = RequestMethod.GET,consumes = MediaType.APPLICATION_JSON_VALUE,produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity getEnquiry(@PathVariable String enquiryId){
        Optional<Enquiry> floor = enquiryService.getEnquiry(enquiryId);
    return new ResponseEntity(floor,HttpStatus.OK);
    }

    @RequestMapping(path = "/get",method = RequestMethod.GET,consumes = MediaType.APPLICATION_JSON_VALUE,produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity getEnquiry(){
        List<Enquiry> floors = enquiryService.getAllEnquiries();
    return new ResponseEntity(floors,HttpStatus.OK);
    }

}
