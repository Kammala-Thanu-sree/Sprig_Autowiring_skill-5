package com.klu;
public class Student 
{
	Course course;
	
 int studentId;
    String name;
    int year;
    String email;
     String phoneNumber;
// Constructor Injection
    public Student(int studentId, String name, int year) 
    {
        this.studentId = studentId;
        this.name = name;
        this.year = year;
    }

    public void setCourse(Course course) 
    {
        this.course = course;
    }
public void setEmail(String email) {
        this.email = email;
    }
public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void display() {
        System.out.println("Student ID      : " + studentId);
        System.out.println("Student Name    : " + name);
        System.out.println("Academic Year   : " + year);
        System.out.println("Email           : " + email);
        System.out.println("Phone Number    : " + phoneNumber);
        System.out.println("Course          : " + course);
    }
}
