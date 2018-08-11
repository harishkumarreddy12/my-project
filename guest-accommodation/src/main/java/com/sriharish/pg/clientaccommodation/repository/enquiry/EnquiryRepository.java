package com.sriharish.pg.clientaccommodation.repository.enquiry;

import com.sriharish.pg.clientaccommodation.domain.Enquiry;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public interface EnquiryRepository extends MongoRepository<Enquiry,String> {

}
