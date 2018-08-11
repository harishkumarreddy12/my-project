package com.sriharish.pg.clientaccommodation.controller;

import com.sriharish.pg.clientaccommodation.domain.Staff;
import com.sriharish.pg.clientaccommodation.service.staff.StaffService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/v1/staff")
public class StaffController {

    @Autowired
    StaffService staffService;

    @RequestMapping(path = "/create",method = RequestMethod.POST,consumes = MediaType.APPLICATION_JSON_VALUE,produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity createStaff(@RequestBody Staff staff){
        staff = staffService.createStaff(staff);
    return new ResponseEntity(staff,HttpStatus.CREATED);
    }

    @RequestMapping(path = "/delete",method = RequestMethod.DELETE,consumes = MediaType.APPLICATION_JSON_VALUE,produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity deleteStaff(@RequestBody Staff staff){
        staffService.deleteStaff(staff.getId());
    return new ResponseEntity(staff,HttpStatus.OK);
    }

    @RequestMapping(path = "/update",method = RequestMethod.POST,consumes = MediaType.APPLICATION_JSON_VALUE,produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity updateStaff(@RequestBody Staff staff){
        staffService.updateStaff(staff);
    return new ResponseEntity(staff,HttpStatus.OK);
    }

    @RequestMapping(path = "/get/{staffId}",method = RequestMethod.GET,consumes = MediaType.APPLICATION_JSON_VALUE,produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity getStaff(@PathVariable String staffId){
        Optional<Staff> staff = staffService.getStaff(staffId);
    return new ResponseEntity(staff,HttpStatus.OK);
    }

    @RequestMapping(path = "/get",method = RequestMethod.GET,consumes = MediaType.APPLICATION_JSON_VALUE,produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity getStaff(){
        List<Staff> staffs = staffService.getAllStaffs();
    return new ResponseEntity(staffs,HttpStatus.OK);
    }

}
