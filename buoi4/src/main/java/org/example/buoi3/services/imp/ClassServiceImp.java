package org.example.buoi3.services.imp;

import org.example.buoi3.models.Classs;
import org.example.buoi3.repositories.ClassRepository;
import org.example.buoi3.services.IClassService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClassServiceImp implements IClassService {

    private final ClassRepository classRepository;

    public ClassServiceImp(ClassRepository classRepository) {
        this.classRepository = classRepository;
    }

    @Override
    public Classs createClass(Classs classs) {
        classRepository.save(classs);
        Classs classs1 = classRepository.findById(classs.getId()).get();
        return classs;
    }

    @Override
    public List<Classs> getListClass() {
        List<Classs> classsList = classRepository.findAll();
        return classsList;
    }
}
