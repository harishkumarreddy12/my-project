package com.sriharish.pg.clientaccommodation.repository.guest;

import com.sriharish.pg.clientaccommodation.domain.Guest;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public interface GuestRepository extends MongoRepository<Guest,String> {

}
