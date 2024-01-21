//package org.example.buoi3.models;
//
//import jakarta.persistence.*;
//import org.hibernate.annotations.Nationalized;
//
//@Entity
//@Table(name = "student")
//public class Student {
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Long id;
//
//    @Column(name = "name")
//    @Nationalized
//    private String name;
//
//    @Column(name = "age")
//    private Integer age;
//
//    @Column(name = "address")
//    @Nationalized
//    private String address;
//
//    @Column(name = "class_student")
//    @Nationalized
//    private String classStudent;
//
//    @Column(name = "school")
//    @Nationalized
//    private String school;
//
//    public Student() {
//    }
//
//    public Student(Long id, String name, Integer age, String address, String classStudent, String school) {
//        this.id = id;
//        this.name = name;
//        this.age = age;
//        this.address = address;
//        this.classStudent = classStudent;
//        this.school = school;
//    }
//
//    public Long getId() {
//        return id;
//    }
//
//    public void setId(Long id) {
//        this.id = id;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public Integer getAge() {
//        return age;
//    }
//
//    public void setAge(Integer age) {
//        this.age = age;
//    }
//
//    public String getAddress() {
//        return address;
//    }
//
//    public void setAddress(String address) {
//        this.address = address;
//    }
//
//    public String getClassStudent() {
//        return classStudent;
//    }
//
//    public void setClassStudent(String classStudent) {
//        this.classStudent = classStudent;
//    }
//
//    public String getSchool() {
//        return school;
//    }
//
//    public void setSchool(String school) {
//        this.school = school;
//    }
//}
