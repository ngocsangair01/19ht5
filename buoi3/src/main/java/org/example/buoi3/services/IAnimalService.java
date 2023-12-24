package org.example.buoi3.services;

import org.example.buoi3.models.Animal;
import org.example.buoi3.models.Result;

public interface IAnimalService {
    Result defineTypeAndSound(Animal animal);
}
