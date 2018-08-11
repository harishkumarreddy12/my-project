package com.sriharish.pg.clientaccommodation.service.enquiry;

import com.sriharish.pg.clientaccommodation.domain.Enquiry;

import java.util.List;
import java.util.Optional;

public interface EnquiryService {
    Enquiry createEnquiry(Enquiry enquiry);
    void deleteEnquiry(String id);
    Enquiry updateEnquiry(Enquiry enquiry);
    Optional<Enquiry> getEnquiry(String id);
    List<Enquiry> getAllEnquiries();
}
