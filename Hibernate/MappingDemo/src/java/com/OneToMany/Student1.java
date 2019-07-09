
package com.OneToMany;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;


@Entity
public class Student1
{
    @Id
    private String sid;
    private String sname;
    private float marks;
    
    @OneToMany(mappedBy = "student",fetch = FetchType.EAGER)      // This says that one student can have more than one Laptops // Here (mappedBy="student" will reduce one table)
                                                                  // Here I have used a fetch=FetchType.EAGER that means using a single query we will able to get the data of laotop Class
    private List<Laptop1> laptop = new ArrayList<Laptop1>();    // Here there are many laptops that's why we are using List of Laptop class

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

    public List<Laptop1> getLaptop() {
        return laptop;
    }

    public void setLaptop(List<Laptop1> laptop) {
        this.laptop = laptop;
    }

    @Override
    public String toString() {
        return "Student1{" + "sid=" + sid + ", sname=" + sname + ", marks=" + marks + ", laptop=" + laptop + '}';
    }
    
    
    

}
