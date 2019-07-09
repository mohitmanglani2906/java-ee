
package com.ManyToMany;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;


@Entity
public class Laptop2
{
    @Id
    private String lid;
    private String lname;

    @ManyToMany           // This says that Many laptop can be used by many students 
    private List<Student2> student = new ArrayList<Student2>(); // For that I have taken list of students
    public String getLid()
    {
        return lid;
    }

    public void setLid(String lid) {
        this.lid = lid;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public List<Student2> getStudent() {
        return student;
    }

    public void setStudent(List<Student2> student) {
        this.student = student;
    }

    @Override
    public String toString() {
        return "Laptop2{" + "lid=" + lid + ", lname=" + lname + ", student=" + student + '}';
    }

    
    
}
