package com.github.jsalonen.springdemo.repository;

import com.github.jsalonen.springdemo.entity.Zone;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ZoneRepository extends MongoRepository<Zone, String> {
    Zone findByName(String name);
}
