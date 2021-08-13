package com.shantalia.Project1;

public class Teacher<subject> extends Person implements Displayable {// this extends Person

    private Object subject;


    public Teacher(String firstname, String lastname, String subject) {
        super(firstname, lastname); //super call= subject will be stored separately inside of teacher.
        this.setSubject(subject); // assigns string subject to parameter string subject

    }

    public Object getSubject() {
        return subject;

    }

    public void setSubject(String subject) {
        this.subject = subject;
    }


    public String display() {
        return this.getFullName() + "teaches" + this.getSubject();

    }
}

