package org.example.buoi3.controllers;

import org.example.buoi3.models.Classs;
import org.example.buoi3.services.IClassService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/class")
public class ClassController {
    private final IClassService classService;

    public ClassController(IClassService classService) {
        this.classService = classService;
    }

    @PostMapping
    public ResponseEntity<?> createClass(@RequestBody Classs classs){
        Classs classs1 = classService.createClass(classs);
        return ResponseEntity.ok(classs1);
    }

    @GetMapping
    public ResponseEntity<?> getAllClass(){
        List<Classs> classsList = classService.getListClass();
        return ResponseEntity.ok(classsList);
    }
}
