
package com.mohit;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;



// Here annotation @Entity is used for to show this class is for datatable and its data will be stored into table
@Entity
//@Table(name="DataAlien")
public class Alien 
{
    @Id   // This shows that int aid is a primary key
    private int aid;
    //@Transient           // This annotation is used to store temporery data means get data only but donot store in database
    private AlienName alienname;
    @Column(name="alien_color") // Use This annotation if you are using create (Creating a new table into database) keyword in hibernate.cfg.xml file
    private String color;

    public int getAid() {
        return aid;
    }

    public void setAid(int aid) {
        this.aid = aid;
    }

    public AlienName getAlienname() {
        return alienname;
    }

    public void setAlienname(AlienName alienname) {
        this.alienname = alienname;
    }

   
	// @Column(name = "commission_fee_info", columnDefinition = "LONGVARBINARY")
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Alien{" + "aid=" + aid + ", alienname=" + alienname + ", color=" + color + '}';
    }

    
    
    
    
}
