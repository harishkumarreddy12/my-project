package com.sriharish.pg.clientaccommodation.service.guest;

import com.sriharish.pg.clientaccommodation.domain.Guest;
import com.sriharish.pg.clientaccommodation.repository.guest.GuestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class GuestServiceImpl implements GuestService{
    @Autowired
    GuestRepository guestRepository;
    @Override
    public Guest createGuest(Guest guest) {
        guest.setUuid(UUID.randomUUID());
        return guestRepository.save(guest);
    }

    @Override
    public void deleteGuest(String id) {
        guestRepository.deleteById(id);
    }

    @Override
    public Guest updateGuest(Guest guest) {
        return guestRepository.save(guest);
    }

    @Override
    public Optional<Guest> getGuest(String id) {
        return guestRepository.findById(id);
    }

    @Override
    public List<Guest> getAllGuest() {
        return guestRepository.findAll();
    }
}
