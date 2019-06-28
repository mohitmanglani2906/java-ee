
package com.mohit;


public class Student 
{
    public int rollno;
    public  String name;

    public Student(int rollno, String name) {
        this.rollno = rollno;
        this.name = name;
    }
    public int getRollno() {
        return rollno;
    }

    public String getName() {
        return name;
    }

    public void setRollno(int rollno) {
        this.rollno = rollno;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" + "rollno=" + rollno + ", name=" + name + '}';
    }
   
   
  
}
