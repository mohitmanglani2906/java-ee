
package com.OneToMany;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;


@Entity
public class Laptop1
{
    @Id
    private String lid;
    private String lname;

    @ManyToOne                         // This says that Many laptop can have only one Student and that's why we are using manytoone
    private Student1 student;         // Here Student object is for ManyToOne annotation
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

    public Student1 getStudent() {
        return student;
    }

    public void setStudent(Student1 student) {
        this.student = student;
    }

    @Override
    public String toString() {
        return "Laptop1{" + "lid=" + lid + ", lname=" + lname + ", student=" + student + '}';
    }
    
    
}
