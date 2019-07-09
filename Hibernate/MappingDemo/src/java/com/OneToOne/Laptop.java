
package com.OneToOne;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity           // This says that this class is a table
public class Laptop 
{
    @Id         // Primary key
    private String lid;
    private String lname;

    public String getLid() {
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

    @Override
    public String toString() {
        return "Laptop{" + "lid=" + lid + ", lname=" + lname + '}';
    }
    
    
    
}
