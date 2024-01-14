package org.example.buoi3.inputs;



public class StudentDataInput {

    private String name;

    private Integer age;

    private String address;

    private String classStudent;

    private String school;

    public StudentDataInput() {
    }

    public StudentDataInput(String name, Integer age, String address, String classStudent, String school) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.classStudent = classStudent;
        this.school = school;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getClassStudent() {
        return classStudent;
    }

    public void setClassStudent(String classStudent) {
        this.classStudent = classStudent;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }
}
