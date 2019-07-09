
package com.mohit;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;





@Entity                    // This says this is class of which table will be created
@Table(name = "userdata")  // GIve name of a table
public class UserData implements Serializable
{
   private String name;
   
   @Id                     // Primary key is email id
   private String email;
   private String choice;
   private String link;
   private String message;
   private String rating;
   
   

    public UserData()
    {
        
    }

    public UserData(String name, String email, String choice, String link, String message, String rating) {
        this.name = name;
        this.email = email;
        this.choice = choice;
        this.link = link;
        this.message = message;
        this.rating = rating;
    }
   
   

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getChoice() {
        return choice;
    }

    public void setChoice(String choice) {
        this.choice = choice;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    @Override
    public String toString() {
        return "UserData{" + "name=" + name + ", email=" + email + ", choice=" + choice + ", link=" + link + ", message=" + message + ", rating=" + rating + '}';
    }
   
   
}
