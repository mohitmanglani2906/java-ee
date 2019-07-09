
package com.mohit;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "studentData")
public class Student
{
    @Id
    private int rollno;
    
    private String sname;
    private float marks;

    public int getRollno() {
        return rollno;
    }

    public void setRollno(int rollno) {
        this.rollno = rollno;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public float getMarks() {
        return marks;
    }

    public void setMarks(float marks) {
        this.marks = marks;
    }

    @Override
    public String toString()
    {
        return "Student{" + "rollno=" + rollno + ", sname=" + sname + ", marks=" + marks + '}';
    }
    
    
    
}
