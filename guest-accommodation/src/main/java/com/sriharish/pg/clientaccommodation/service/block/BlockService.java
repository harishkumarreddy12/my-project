package com.sriharish.pg.clientaccommodation.service.block;

import com.sriharish.pg.clientaccommodation.domain.Block;

import java.util.List;
import java.util.Optional;

public interface BlockService {
    Block createBlock(Block block);
    void deleteBlock(String id);
    Block updateBlock(Block block);
    Optional<Block> getBlock(String id);
    List<Block> getAllBlocks();
}
