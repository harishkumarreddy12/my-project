package com.sriharish.pg.clientaccommodation.repository.block;

import com.sriharish.pg.clientaccommodation.domain.Block;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public interface BlockRepository extends MongoRepository<Block,String> {

}
