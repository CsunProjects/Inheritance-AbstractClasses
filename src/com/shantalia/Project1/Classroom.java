package com.shantalia.Project1;
import java.util.ArrayList;


public class Classroom extends Person implements Displayable {
    private int roomNumber;
    private Displayable teacher;
    private ArrayList<Displayable> students;

    Classroom(int roomNumber, Displayable teacher, ArrayList<Displayable> students) {

        this.roomNumber = roomNumber;
        this.teacher = teacher;
        this.students = students;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    public void getTeacher(Displayable teacher) {
        this.teacher = teacher;
    }

    public void setTeacher(Displayable teacher) {
        this.teacher = teacher;
    }
    public ArrayList<Displayable>getStudents(){
        return students;
    }


    public String display() {
        StringBuilder output = new StringBuilder();
        output.append(teacher.display());
for (Displayable student:students) {
    output.append(student.display());
}
        return output.append("Room Number: ") + String.valueOf(this.roomNumber) + "Name of teacher: " + this.teacher + "Student in Classroom: "
                + this.students;

    }
    }
