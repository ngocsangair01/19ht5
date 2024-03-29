package org.example.buoi3.services;

import org.example.buoi3.models.Classs;

import java.util.List;

public interface IClassService {
    Classs createClass(Classs classs);
    List<Classs> getListClass();
    Classs putMappingClass(Long id,Classs classs);
    Classs deleteClass(Long id);
    Classs patchMappingClass(Long id, Classs classs);
}
