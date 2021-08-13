package com.shantalia.Project1;

public class Student extends Person implements Displayable {//this extends person
    private int studentId;
    private int finalGrade;

    public Student(String firstname, String lastname, int studentId, int finalGrade) {
        super(firstname, lastname);// super uses the parent class (person)

    }

    public int getStudentId() {//name of method
        return studentId;

    }

    public int getFinalGrade() {
        return finalGrade;
    }

    public void setStudentId(int id) {
        this.studentId = id;
    }

    public void setFinalGrade(int grade) {
        this.finalGrade = grade;

    }

    public String display() {
        return "Student Id: " + String.valueOf(this.studentId)
                + "Student FinalGrade: " + String.valueOf(this.finalGrade);

    }
}
