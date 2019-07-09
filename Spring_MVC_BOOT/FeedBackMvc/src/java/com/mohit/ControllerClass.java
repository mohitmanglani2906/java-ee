
package com.mohit;

import com.dao.AddDataFromFeedback;
import com.dao.QuestionsDao;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ControllerClass 
{
    @Autowired              // Here this annotation will create object of class AddDataFromFeedback
    AddDataFromFeedback addDataFromFeedback;
    
    @Autowired
    QuestionsDao questionsDao;        
    
    UserData userData;
    @RequestMapping(value = "/add",method = RequestMethod.GET) // index.jsp will redirect us to display.jsp where feddback form is there
    public String addtion()
    {
        return "display";
    }
    
    @RequestMapping(value="/addData",method = RequestMethod.GET)
    public ModelAndView addFeed(@RequestParam("uname") String name,@RequestParam("email") String email,@RequestParam("choice") String choice,@RequestParam("code") String code,@RequestParam("msg") String msg,@RequestParam("rating") String rating)
    {
        ModelAndView mv = new ModelAndView();
        userData=  new UserData(name,email,choice,code,msg,rating);  // Take Data From Form and pass it to the constructor of UserData class
        System.out.println(userData);
        if(addDataFromFeedback.addUser(userData))
        {
            mv.setViewName("sucess");
            return mv;
        }
        else
        {  
            mv.setViewName("error");
            return mv;
        }  
    }
    
    @RequestMapping(value = "/getfeedbacks.htm")
    public ModelAndView showFeedbacks()
    {
      ModelAndView mv = new ModelAndView();
      mv.setViewName("feedbacks");
      mv.addObject("FeedBackList",addDataFromFeedback.getAllFeedBack());
      return mv;
    }
    
    @RequestMapping("/addquestions.htm")
    public String addQuestionPage()
    {
        return "addquestions";
    }
    
    @RequestMapping("/saveQuestions.htm")
    public ModelAndView saveQuestions(@ModelAttribute Questions questions)
    {
        
        ModelAndView mv = new ModelAndView("printQuestions");
        questionsDao.saveQuestions(questions);
        return mv;
    }
    
   @RequestMapping("/getquestions.htm")
   public ModelAndView getQuestions()
   {
        ModelAndView mv = new ModelAndView();
        List<Questions> questions = questionsDao.getQuestions();
        mv.addObject("questions",questions);
        mv.setViewName("Showallquestions");
			
        System.out.println(questions);
			
        return mv;
    }
   
   
        @RequestMapping("/test.htm")
        public ModelAndView getTestQuestions()
        {
             ModelAndView mv = new ModelAndView();
             List<Questions> questions = questionsDao.gettestQuestions();
             mv.addObject("testquestions",questions);
             mv.setViewName("GiveTest");

             System.out.println(questions.toString());

             return mv;
         }
        
        
        @RequestMapping("/getQuestions") // TO get the Data into Json Format For that you will have to add jar files named 
        @ResponseBody                    // jackson-annotation , jackson-core , jackson-asl  , jackson-databind , jackson-mapper-asl   
        public List<Questions> getjson()
        {
            List<Questions> questions = questionsDao.gettestQuestions();
            System.out.println(questions);
            return questions;
        }
        
                @RequestMapping("/verify.htm")
		public ModelAndView verify(@RequestParam("qid1") int qid1)
		{
			ModelAndView mv = new ModelAndView("result.jsp");
			System.out.println(qid1);
			return mv;
		}
        
    
}
