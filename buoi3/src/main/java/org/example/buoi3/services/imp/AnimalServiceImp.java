package org.example.buoi3.services.imp;

import org.example.buoi3.models.Animal;
import org.example.buoi3.models.Result;
import org.example.buoi3.services.IAnimalService;
import org.springframework.stereotype.Service;

@Service
public class AnimalServiceImp implements IAnimalService {
    @Override
    public Result defineTypeAndSound(Animal animal) {
        if (animal.getName().equals("Dog")) {
            return new Result("tren can", "gau gau");
        } else if (animal.getName().equals("Cat")) {
            return new Result("tren can", "meow meow");
        } else if (animal.getName().equals("Fish")) {
            return new Result("duoi nuoc", "");
        } else {
            return new Result();
        }
    }
}
