package com.sriharish.pg.clientaccommodation.service.guest;

import com.sriharish.pg.clientaccommodation.domain.Floor;
import com.sriharish.pg.clientaccommodation.domain.Guest;

import java.util.List;
import java.util.Optional;

public interface GuestService {
    Guest createGuest(Guest guest);
    void deleteGuest(String id);
    Guest updateGuest(Guest guest);
    Optional<Guest> getGuest(String id);
    List<Guest> getAllGuest();
}
