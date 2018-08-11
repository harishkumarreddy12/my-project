package com.sriharish.pg.clientaccommodation.controller;

import com.sriharish.pg.clientaccommodation.domain.Block;
import com.sriharish.pg.clientaccommodation.service.block.BlockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/v1/block")
public class BlockController {

    @Autowired
    BlockService blockService;

    @RequestMapping(path = "/create",method = RequestMethod.POST,consumes = MediaType.APPLICATION_JSON_VALUE,produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity createBlock(@RequestBody Block block){
        block = blockService.createBlock(block);
    return new ResponseEntity(block,HttpStatus.CREATED);
    }

    @RequestMapping(path = "/delete",method = RequestMethod.DELETE,consumes = MediaType.APPLICATION_JSON_VALUE,produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity deleteBlock(@RequestBody Block block){
        blockService.deleteBlock(block.getId());
    return new ResponseEntity(block,HttpStatus.OK);
    }

    @RequestMapping(path = "/update",method = RequestMethod.POST,consumes = MediaType.APPLICATION_JSON_VALUE,produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity updateBlock(@RequestBody Block block){
        blockService.updateBlock(block);
    return new ResponseEntity(block,HttpStatus.OK);
    }

    @RequestMapping(path = "/get/{blockId}",method = RequestMethod.GET,consumes = MediaType.APPLICATION_JSON_VALUE,produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity getBlock(@PathVariable String blockId){
        Optional<Block> block = blockService.getBlock(blockId);
    return new ResponseEntity(block,HttpStatus.OK);
    }

    @RequestMapping(path = "/get",method = RequestMethod.GET,consumes = MediaType.APPLICATION_JSON_VALUE,produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity getBlock(){
        List<Block> blocks = blockService.getAllBlocks();
    return new ResponseEntity(blocks,HttpStatus.OK);
    }

}
