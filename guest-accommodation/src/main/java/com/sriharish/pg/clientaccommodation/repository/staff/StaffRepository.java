package com.sriharish.pg.clientaccommodation.repository.staff;

import com.sriharish.pg.clientaccommodation.domain.Staff;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public interface StaffRepository extends MongoRepository<Staff,String> {

}
