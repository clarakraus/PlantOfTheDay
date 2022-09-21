package com.github.clarakraus;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PlantService {

    private final PlantRepo plantRepo;

    public void savePlant(Plant plant){
        plantRepo.save(plant);
    }


}
