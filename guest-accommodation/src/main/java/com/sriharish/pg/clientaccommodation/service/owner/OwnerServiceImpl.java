package com.sriharish.pg.clientaccommodation.service.owner;

import com.sriharish.pg.clientaccommodation.domain.Owner;
import com.sriharish.pg.clientaccommodation.repository.owner.OwnerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.Random;
import java.util.UUID;
@Service
public class OwnerServiceImpl implements OwnerService {
    @Autowired
    OwnerRepository ownerRepository;
    @Override
    public Owner createOwner(Owner owner) {
        owner.setUuid(UUID.randomUUID());
        return ownerRepository.save(owner);
    }

    @Override
    public void deleteOwner(String id) {
        ownerRepository.deleteById(id);
    }

    @Override
    public Owner updateOwner(Owner owner) {
        return ownerRepository.save(owner);
    }

    @Override
    public Optional<Owner> getOwner(String id) {
        return ownerRepository.findById(id);
    }

    @Override
    public List<Owner> getAllOwner() {
        return ownerRepository.findAll();
    }
}
