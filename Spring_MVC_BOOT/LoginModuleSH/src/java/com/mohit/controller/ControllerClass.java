
package com.mohit.controller;

import com.mohit.dao.StudentProfile;
import com.mohit.hibe.CreateSession;
import com.mohit.hibe.UpdateUserData;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class ControllerClass 
{
    @Autowired
    HttpSession httpsession;
    
    @Autowired
    HttpServletRequest httprequest;
   
    @Autowired
    CreateSession cs;
    
    
    @Autowired
    StudentProfile sp;
    
    @RequestMapping("/index.htm")
    public String getIndex()
    {
        return "index";
    }
    
    @RequestMapping(value="/save")
    public ModelAndView saveuser(@ModelAttribute StudentProfile sp) 
    {
        
        ModelAndView  mv =  new ModelAndView();
        Session session  = cs.getSession();
        Transaction tx = session.beginTransaction();
        session.save(sp);
        tx.commit();
        session.close();
        
        httpsession = httprequest.getSession();
        httpsession.invalidate();
        mv.setViewName("loginsuccess");
        System.out.println("Hey server");
        return mv;
    }
    
    @RequestMapping(value="/loginuser")
    public ModelAndView logInUser(@RequestParam("email") String email)
    {
        ModelAndView mv =  new ModelAndView();
        mv.setViewName("welcome");
        
        return mv;
    }
    
    @RequestMapping("/logout.htm")
    public String logout()
    {
        httpsession = httprequest.getSession();
        httpsession.removeAttribute("email");
        httpsession.invalidate();
        System.out.println("In Logout Controller!!!");
        return "index";
    }
    
    @RequestMapping("/update.htm")
    public String updateCall()
    {
        return "updateData";
    }
    
    @RequestMapping("/update")
    public String updateUser(@RequestParam("fname") String fname,@RequestParam("lname") String lname,@RequestParam("email") String email,@RequestParam("phone_no") String phone_no,@RequestParam("address") String address,@RequestParam("gender") String gender,@RequestParam("password") String password)
    {
        try
        {
            System.out.println("Update");
            httpsession = httprequest.getSession();
            System.out.println(httpsession.getAttribute("email").toString());
            UpdateUserData uud = new UpdateUserData(email,fname,lname,phone_no,address,gender,password);
            System.out.println("After contructor : ");
            if(uud.updateUserByEmail((String)httpsession.getAttribute("email"))) 
            {
                System.out.println("In If Condition!!!");
                return "updatesuccess";
            }
           
//            System.out.println(httpsession.getAttribute("email"));
//            Session session = cs.getSession();
//            Transaction tx = session.beginTransaction();
//            System.out.println(email + " Email id :  " );
//            sp.setFname(fname);
//            sp.setLname(lname);
//            sp.setEmail(email);
//            sp.setPhone_no(phone_no);
//            sp.setAddress(address);
//            sp.setPassword(password);
//            sp.setGender(gender);
//            session.update(sp);
//            tx.commit();
//            session.close();
        }
        
        catch(HibernateException e)
        {
            System.out.println(e.getMessage());
        }
            
            return "index";
        
    }
    
    @RequestMapping("/delete.htm")
    public String deleteAccount()
    {
        System.out.println("In Delete controller");
        Session session = cs.getSession();
        Transaction tx = session.beginTransaction();
        httpsession = httprequest.getSession();
        sp.setEmail((String)httpsession.getAttribute("email"));
        session.delete(sp);
        tx.commit();
        session.close();
        return "deletesuccess";
    }
    
    

}
