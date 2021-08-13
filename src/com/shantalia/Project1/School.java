package com.shantalia.Project1;

public class School {
    public static void main (String[]args){
    try {
        PrintReport pr = new PrintReport();
       pr.report(pr.enterClassroom());
    }
    catch (Exception e) {
        System.out.println(e.toString());
    }
    }
    }

