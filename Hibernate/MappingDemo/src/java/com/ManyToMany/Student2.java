
package com.ManyToMany;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;


@Entity
public class Student2
{
    @Id
    private String sid;
    private String sname;
    private float marks;
    
    @ManyToMany(mappedBy = "student")     // This says that many student can have many laptops
    private List<Laptop2> laptop = new ArrayList<Laptop2>();     // for that we have taken List of Laptops

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

    public List<Laptop2> getLaptop() {
        return laptop;
    }

    public void setLaptop(List<Laptop2> laptop) {
        this.laptop = laptop;
    }

    @Override
    public String toString() {
        return "Student2{" + "sid=" + sid + ", sname=" + sname + ", marks=" + marks + ", laptop=" + laptop + '}';
    }
    
    

}
