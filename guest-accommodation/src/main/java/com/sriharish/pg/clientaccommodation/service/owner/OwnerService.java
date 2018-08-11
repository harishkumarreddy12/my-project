package com.sriharish.pg.clientaccommodation.service.owner;

import com.sriharish.pg.clientaccommodation.domain.Owner;

import java.util.List;
import java.util.Optional;

public interface OwnerService {
    Owner createOwner(Owner owner);
    void deleteOwner(String id);
    Owner updateOwner(Owner owner);
    Optional<Owner> getOwner(String id);
    List<Owner> getAllOwner();
}
