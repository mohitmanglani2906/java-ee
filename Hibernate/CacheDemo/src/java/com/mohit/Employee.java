
package com.mohit;

import java.io.Serializable;
import javax.persistence.Cacheable;
import javax.persistence.Entity;
import javax.persistence.Id;
import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;


@Entity
@Cacheable     // This says that this is a Cacheable table
@Cache(usage=CacheConcurrencyStrategy.READ_WRITE)  // GIve permission like write read etc .......
public class Employee implements Serializable
{
    @Id
    private int e_id;
    private String ename;
    private float salary;

    public int getE_id() {
        return e_id;
    }

    public void setE_id(int e_id) {
        this.e_id = e_id;
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    @Override
    public String toString() 
    {
        return "Employee{" + "e_id=" + e_id + ", ename=" + ename + ", salary=" + salary + '}';
    }
    
    
}
