package com.sriharish.pg.clientaccommodation.service.pg;

import com.sriharish.pg.clientaccommodation.domain.PG;

import java.util.List;
import java.util.Optional;

public interface PGService {
    PG createPG(PG pg);
    void deletePG(String id);
    PG updatePG(PG pg);
    Optional<PG> getPG(String id);
    List<PG> getAllPG();
}
