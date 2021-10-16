package com.highschool;

public class CollegeStudent extends Student{
    private int myYear;
    private String myMajorSubject;

    public CollegeStudent(int year, String majorSubject, String studentID, int gpa, int age, int idNumber, String name, String gender){
        super(name, age ,gender, studentID, gpa, idNumber);
    }

    public int getMyYear() {
        return myYear;
    }

    public String getMyMajorSubject() {
        return myMajorSubject;
    }

    public void setMyYear(int myYear) {
        this.myYear = myYear;
    }

    public void setMyMajorSubject(String myMajorSubject) {
        this.myMajorSubject = myMajorSubject;
    }
}
