package com.highschool;

public class Teacher extends Person {
    private int mySalary;
    private String mySubject;
    public Teacher(int salary, String subject,String name, String gender, int age, int idNum){
        super(name, gender, age, idNum);

    }

    public int getMySalary() {
        return mySalary;
    }

    public String getMySubject() {
        return mySubject;
    }

    public void setMySalary(int mySalary) {
        this.mySalary = mySalary;
    }

    public void setMySubject(String mySubject) {
        this.mySubject = mySubject;
    }
}
