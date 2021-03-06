
package com.mohit;

import javax.persistence.Embeddable;


@Embeddable // This Annotation is used for Embed all the properties with other class means to insert a data into same table
public class AlienName
{
    private String fname;
    private String lname;
    private String mname;

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public String getMname() {
        return mname;
    }

    public void setMname(String mname) {
        this.mname = mname;
    }

    @Override
    public String toString() {
        return "AlienName{" + "fname=" + fname + ", lname=" + lname + ", mname=" + mname + '}';
    }
    
    
}
