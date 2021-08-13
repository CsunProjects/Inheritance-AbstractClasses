package com.shantalia.Project1;
//+=public
//-=private

public class Person {
    private String firstName;//variables
    private String lastName;//variables

    public Person(String fname, String lname) {//this is the constructor
        this.firstName = fname;//gives/calls firstname a value
        this.lastName = lname;//gives/calls lastname a value

    }

    public Person() {
    }


    public String getFirstName() {//getter function

        return firstName;
    }

    public void setFirstName(String fname) { //requires for parameters
        this.firstName = fname;

    }

    public String getLastName() {
        return lastName;

    }

    public void setLastName(String lname) {
        this.lastName = lname;
    }

    public String getFullName() {
        String FullName = firstName + " " + lastName;
        return FullName;

    }
}
