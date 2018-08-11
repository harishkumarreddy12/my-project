package com.sriharish.pg.clientaccommodation.repository.room;

import com.sriharish.pg.clientaccommodation.domain.Room;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public interface RoomRepository extends MongoRepository<Room,String> {
}
