package com.sriharish.pg.clientaccommodation.repository.pg;

import com.sriharish.pg.clientaccommodation.domain.PG;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public interface PGRepository extends MongoRepository<PG,String> {

}
