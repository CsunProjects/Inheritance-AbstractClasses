package com.shantalia.Project1;

import java.util.ArrayList;
import java.util.Scanner;

public class PrintReport {

    public PrintReport() {
        ArrayList<Displayable> list = new ArrayList<>();
    }

    public ArrayList<Displayable> enterClassroom() {
        ArrayList<Displayable> list = new ArrayList<>();

        int roomNumber;// variable
        Displayable teacher;
        ArrayList<Displayable> student;
        String a = "yes";
        Scanner scan = new Scanner(System.in);

        do {
            System.out.printf("Enter number of room?");
            roomNumber = scan.nextInt();
            teacher = enterTeacher();
            student = enterStudent();
            if (roomNumber >= 1000) {
                list.add(new Classroom(roomNumber, teacher, student));

            } else {
                System.out.printf("Room number must be greater than 1000. Please Continue.");

            }
            System.out.printf("Continue classroom entries? (yes/no)");
            a = scan.next();

        } while (!a.equalsIgnoreCase("no"));
        return list;
    }


    public Displayable enterTeacher() {
        //String subject;
        String firstName;
        String lastName;
        String subject;

        Scanner scan = new Scanner(System.in);
        System.out.printf(" Please enter teachers first name: ");

        firstName = scan.next();
        System.out.printf(" Please enter teachers last name: ");
        lastName = scan.next();
        System.out.printf("Please enter teachers subject:");
        subject = scan.next();

        Teacher teacher = new Teacher(firstName, lastName, subject);
        return teacher;
    }

    public ArrayList<Displayable> enterStudent() {
        ArrayList<Displayable> list = new ArrayList<>();
        int studentId;
        int finalGrade;
        String firstName;
        String lastName;
        String a = "Yes";
        Scanner scan = new Scanner(System.in);
        do {
            System.out.printf("Enter Student ID Number: ");
            studentId = scan.nextInt();
            System.out.printf("Enter Students Final Grade: ");
            finalGrade = scan.nextInt();
            System.out.printf("Enter Students First name: ");
            firstName = scan.next();
            System.out.printf("Enter Students Last name: ");
            lastName = scan.next();
            if (studentId > 0) {

                list.add(new Student(firstName, lastName, studentId, finalGrade));

            } else {
                System.out.printf("Student ID must be greater than 0.Continue:");

            }
            System.out.printf("Do you want to continue student entries? (yes/no)");
            a = scan.next();
        } while (!a.equalsIgnoreCase("no"));

        return list;
    }






    public void report(ArrayList<Displayable> enterClassroom) {

        for (int i =0; i<enterClassroom.size(); i++) {
        }
    }

   public static void main (String[]args) {
        PrintReport printReport = new PrintReport();
       printReport.report(printReport.enterClassroom());
    }
}


