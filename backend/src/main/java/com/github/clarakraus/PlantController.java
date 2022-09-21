package com.github.clarakraus;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/plant")
@CrossOrigin
public class PlantController {
    private final PlantService plantService;


    @PostMapping("/new")
    public void saveNewPlant(@RequestBody Plant plant){
        plantService.savePlant(plant);
    }

}
