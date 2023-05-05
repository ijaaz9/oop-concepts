package com.ijaaz.oop.concepts.encapsulation;

public class Student {

    private String fistName;
    private String lastName;
    private Integer studentId;
    private String grade;
    private Integer age;

    public Student(String fistName, String lastName, Integer studentId, String grade, Integer age) {
        this.fistName = fistName;
        this.lastName = lastName;
        this.studentId = studentId;
        this.grade = grade;
        this.age = age;
    }

    public Student() {}

    public String getFistName() {
        return fistName;
    }

    public void setFistName(String fistName) {
        this.fistName = fistName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Integer getStudentId() {
        return studentId;
    }

    public void setStudentId(Integer studentId) {
        this.studentId = studentId;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "\nFirst name:" + getFistName() + "\n" +
                "Lastname:" + getLastName() + "\n" +
                "Age:" + getAge() + "\n" +
                "Student ID: " + getStudentId() + "\n" +
                "Grade: " + getGrade() + "\n";
    }
}
