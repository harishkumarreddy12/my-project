package com.sriharish.pg.clientaccommodation.service.staff;

import com.sriharish.pg.clientaccommodation.domain.Staff;

import java.util.List;
import java.util.Optional;

public interface StaffService {
    Staff createStaff(Staff staff);
    void deleteStaff(String id);
    Staff updateStaff(Staff staff);
    Optional<Staff> getStaff(String id);
    List<Staff> getAllStaffs();
}
