
package com.OneToOne;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity           // This says that this class is a table
public class Student 
{   
    @Id            // Primary key
    private String sid;
    private String sname;
    private float marks;
    @OneToOne               // This annotation is used to define that one student can have one laptop entity
    private Laptop laptop;

    public String getSid() {
        return sid;
    }

    public void setSid(String sid) {
        this.sid = sid;
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

    public Laptop getLaptop() {
        return laptop;
    }

    public void setLaptop(Laptop laptop) {
        this.laptop = laptop;
    }

    @Override
    public String toString() {
        return "Student{" + "sid=" + sid + ", sname=" + sname + ", marks=" + marks + ", laptop=" + laptop + '}';
    }

    
    
}
