package com.sriharish.pg.clientaccommodation.repository.floor;

import com.sriharish.pg.clientaccommodation.domain.Floor;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public interface FloorRepository extends MongoRepository<Floor,String> {

}
