package com.sriharish.pg.clientaccommodation.service.staff;

import com.sriharish.pg.clientaccommodation.domain.Staff;
import com.sriharish.pg.clientaccommodation.repository.staff.StaffRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class StaffServiceImpl implements StaffService {
    @Autowired
    StaffRepository staffRepository;

    @Override
    public Staff createStaff(Staff staff) {
        staff.setUuid(UUID.randomUUID());
        return (Staff) staffRepository.save(staff);
    }

    @Override
    public void deleteStaff(String id) {
        staffRepository.deleteById(id);
    }

    @Override
    public Staff updateStaff(Staff staff) {
        return (Staff) staffRepository.save(staff);
    }

    @Override
    public Optional<Staff> getStaff(String id) {
        return staffRepository.findById(id);
    }

    @Override
    public List<Staff> getAllStaffs() {
        return staffRepository.findAll();
    }
}
