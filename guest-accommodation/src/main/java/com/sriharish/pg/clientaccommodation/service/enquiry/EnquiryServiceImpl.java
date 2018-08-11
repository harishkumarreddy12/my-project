package com.sriharish.pg.clientaccommodation.service.enquiry;

import com.sriharish.pg.clientaccommodation.domain.Enquiry;
import com.sriharish.pg.clientaccommodation.domain.Floor;
import com.sriharish.pg.clientaccommodation.repository.enquiry.EnquiryRepository;
import com.sriharish.pg.clientaccommodation.repository.floor.FloorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class EnquiryServiceImpl implements EnquiryService {
    @Autowired
    EnquiryRepository enquiryRepository;

    @Override
    public Enquiry createEnquiry(Enquiry enquiry) {
        enquiry.setUuid(UUID.randomUUID());
        return (Enquiry) enquiryRepository.save(enquiry);
    }

    @Override
    public void deleteEnquiry(String id) {
        enquiryRepository.deleteById(id);
    }

    @Override
    public Enquiry updateEnquiry(Enquiry floor) {
        return (Enquiry) enquiryRepository.save(floor);
    }

    @Override
    public Optional<Enquiry> getEnquiry(String id) {
        return enquiryRepository.findById(id);
    }

    @Override
    public List<Enquiry> getAllEnquiries() {
        return enquiryRepository.findAll();
    }
}
