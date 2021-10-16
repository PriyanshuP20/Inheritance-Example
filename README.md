# Inheritance-Example
 A HighSchool application has two classes: the Person superclass and the Student subclass. Using inheritance, you will create two new classes, Teacher and CollegeStudent. A Teacher will be like Person but will have additional properties such as salary (the amount the teacher earns) and subject (e.g. “Computer Science”, “Chemistry”,  “English”, “Other”). The CollegeStudent class will extend the Student class by adding a year (current level in college) and major (e.g. “Electrical Engineering”, “Communications”, “Undeclared”).

Write a Teacher class that extends the parent class Person.

Write a CollegeStudent subclass that extends the Student class

Write a testing class with a main() that constructs all of the classes (Person, Student, Teacher, and CollegeStudent) and calls their toString() method. Sample usage would 
be:
Person bob = new Person("Coach Bob", 27, "M");
System.out.println(bob);

Student lynne = new Student("Lynne Brooke", 16, "F", "HS95129", 3.5);
System.out.println(lynne);

A sample run of the program would give:
Coach Bob, age: 27, gender: M

