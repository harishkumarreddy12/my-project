package com.sriharish.pg.clientaccommodation.service.block;

import com.sriharish.pg.clientaccommodation.domain.Block;
import com.sriharish.pg.clientaccommodation.repository.block.BlockRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class BlockServiceImpl implements BlockService {
    @Autowired
    BlockRepository blockRepository;

    @Override
    public Block createBlock(Block block) {
        block.setUuid(UUID.randomUUID());
        return (Block) blockRepository.save(block);
    }

    @Override
    public void deleteBlock(String id) {
        blockRepository.deleteById(id);
    }

    @Override
    public Block updateBlock(Block block) {
        return (Block) blockRepository.save(block);
    }

    @Override
    public Optional<Block> getBlock(String id) {
        return blockRepository.findById(id);
    }

    @Override
    public List<Block> getAllBlocks() {
        return blockRepository.findAll();
    }
}
