//package org.example.buoi3.services.imp;
//
//import org.example.buoi3.inputs.GetListStudentInput;
//import org.example.buoi3.inputs.StudentDataInput;
//import org.example.buoi3.mappers.StudentMapper;
//import org.example.buoi3.models.Student;
//import org.example.buoi3.outputs.StudentDataOutput;
//import org.example.buoi3.repositories.StudentRepository;
//import org.example.buoi3.services.StudentService;
//import org.springframework.data.domain.PageRequest;
//import org.springframework.stereotype.Service;
//
//import java.util.ArrayList;
//import java.util.List;
//import java.util.stream.Collectors;
//
//@Service
//public class StudentServiceImp implements StudentService {
//
//    private final StudentRepository studentRepository;
//    private final StudentMapper studentMapper;
//
//    public StudentServiceImp(StudentRepository studentRepository, StudentMapper studentMapper) {
//        this.studentRepository = studentRepository;
//        this.studentMapper = studentMapper;
//    }
//
//    @Override
//    public List<StudentDataOutput> getListStudent(GetListStudentInput input) {
//        List<StudentDataOutput> listOutput = new ArrayList<>();
//        List<Student> students = studentRepository.getListStudent(input.getName(),input.getAge(),input.getAddress(),input.getClassStudent(),input.getSchool(), PageRequest.of(input.getPage(), input.getSize()));
//        listOutput = students.stream().map(student -> new StudentDataOutput(student.getName(),student.getAge(),student.getAddress(),student.getSchool(),student.getClassStudent())).toList();
//        return listOutput;
//    }
//
//    @Override
//    public StudentDataOutput createStudent(StudentDataInput input) {
//        Student student = studentMapper.toStudent(input,null);
//        studentRepository.save(student);
//        return studentMapper.toStudentDataOutput(student);
//    }
//}
