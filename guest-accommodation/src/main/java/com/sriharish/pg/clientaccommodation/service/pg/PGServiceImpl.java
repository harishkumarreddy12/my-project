package com.sriharish.pg.clientaccommodation.service.pg;

import com.sriharish.pg.clientaccommodation.domain.PG;
import com.sriharish.pg.clientaccommodation.repository.pg.PGRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class PGServiceImpl implements PGService{

    @Autowired
    PGRepository pGRepository;

    @Override
    public PG createPG(PG pg) {
        pg.setUuid(UUID.randomUUID());
        return pGRepository.save(pg);
    }

    @Override
    public void deletePG(String id) {
        pGRepository.deleteById(id);
    }

    @Override
    public PG updatePG(PG pg) {
        return pGRepository.save(pg);
    }

    @Override
    public Optional<PG> getPG(String id) {
        return pGRepository.findById(id);
    }

    @Override
    public List<PG> getAllPG() {
        return pGRepository.findAll();
    }
}
