package org.example.buoi3.controllers;

import org.example.buoi3.models.Animal;
import org.example.buoi3.models.Result;
import org.example.buoi3.services.IAnimalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class AnimalController {


    private final IAnimalService iAnimalService;

    public AnimalController(IAnimalService iAnimalService) {
        this.iAnimalService = iAnimalService;
    }

    @PostMapping
    public ResponseEntity<?> createAnimals(@RequestBody Animal animal) {
        // kiem tra thong tin
        // neu dung thi them thong tin vao database
        // neu khong dung thi thoi khong them
        return ResponseEntity.ok(animal);
    }

//    @PostMapping("/param")
//    public ResponseEntity<?> createAnimals1(@RequestParam("id_animal") Long id, @RequestParam("name_animal") String name, @RequestParam("type_animal") String type, @RequestParam("sound_animal") String sound) {
//        Animal animal = new Animal(id,name);
//        // kiem tra thong tin
//        // neu dung thi them thong tin vao database
//        // neu khong dung thi thoi khong them
//        return ResponseEntity.ok(animal);
//    }

    @PostMapping("/param")
    public ResponseEntity<?> createAnimals1(Animal animal) {
//        Animal animal = new Animal(id,name,type,sound);
        // kiem tra thong tin
        // neu dung thi them thong tin vao database
        // neu khong dung thi thoi khong them
        return ResponseEntity.ok(animal);
    }

    @PostMapping("/animal")
    public ResponseEntity<?> checkAnimal(Animal animal){
        Result result = iAnimalService.defineTypeAndSound(animal);
        return ResponseEntity.ok(result);
    }

}
