package com.github.clarakraus;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface PlantRepo extends MongoRepository<Plant, String> {
 Optional<Plant> findByName(String name);

}
