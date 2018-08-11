package com.sriharish.pg.clientaccommodation.repository.owner;

import com.sriharish.pg.clientaccommodation.domain.Owner;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public interface OwnerRepository extends MongoRepository<Owner,String> {
}
