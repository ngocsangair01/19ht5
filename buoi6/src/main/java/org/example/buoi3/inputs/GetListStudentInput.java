package org.example.buoi3.inputs;


public class GetListStudentInput {
    private Integer page;
    private Integer size;
    private String name;
    private Integer age;
    private String address;
    private String school;
    private String classStudent;

    public GetListStudentInput() {
    }

    public GetListStudentInput(Integer page, Integer size, String name, Integer age, String address, String school, String classStudent) {
        this.page = page;
        this.size = size;
        this.name = name;
        this.age = age;
        this.address = address;
        this.school = school;
        this.classStudent = classStudent;
    }

    public Integer getPage() {
        return page;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
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

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public String getClassStudent() {
        return classStudent;
    }

    public void setClassStudent(String classStudent) {
        this.classStudent = classStudent;
    }
}
