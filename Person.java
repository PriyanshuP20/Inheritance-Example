package com.highschool;

public class Person {
    private String myName;
    private String myGender;
    private int myAge;
    private int myIdNumber;

    public Person(String name, String gender, int age, int idNum) {
        myAge = age;
        myGender = gender;
        myName = name;
        myIdNumber = idNum;
    }

    public int getMyAge() {
        return myAge;
    }

    public int getMyIdNumber() {
        return myIdNumber;
    }

    public String getMyGender() {
        return myGender;
    }

    public String getMyName() {
        return myName;
    }

    public void setMyAge(int myAge) {
        this.myAge = myAge;
    }

    public void setMyGender(String myGender) {
        this.myGender = myGender;
    }

    public void setMyIdNumber(int myIdNumber) {
        this.myIdNumber = myIdNumber;
    }

    public void setMyName(String myName) {
        this.myName = myName;
    }
    public String toString(){
        return myName + ", age: " + myAge + ", gender: " + myGender+ ", ID Number :"  + myIdNumber;
    }

}
class Student extends Person {
    private String myStudentID;
    private double myGPA;

    public Student(String name, int age, String gender,String studentID, double gpa, int idNumber ) {
        super(name, gender, age, idNumber);
        myStudentID = studentID;
        myGPA = gpa;
    }

    public String getMyStudentID() {
        return myStudentID;
    }

    public double getMyGPA() {
        return myGPA;
    }

    public void setMyStudentID(String myStudentID) {
        this.myStudentID = myStudentID;
    }

    public void setMyGPA(int myGPA) {
        this.myGPA = myGPA;
    }
    public String toString(){
        return super.toString() + ", student id: " + myStudentID + ", gpa: " + myGPA;
    }
}


