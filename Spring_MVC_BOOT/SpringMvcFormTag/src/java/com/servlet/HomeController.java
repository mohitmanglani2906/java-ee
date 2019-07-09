
package com.servlet;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/reservation")     // Here we have given url pattern to move to bookingForm page or reservation-page
public class HomeController 
{
    @RequestMapping("/bookingForm")     // TO go to BookingForm 
    public String bookingForm(Model model)
    {
        Reservation res  =  new Reservation();
        model.addAttribute("reservation",res);
        return "reservation-page";
    }
    
    @RequestMapping("/submitForm")  // To go to submitForm
    public String submitForm(@ModelAttribute("reservation") Reservation res) // Here we can use this annotation to use object of Reservation 
    {
        return "confirmation-page";
    }
}
