package com.slav.site;

import com.slav.site.entity.User;
import com.slav.site.form.LoginForm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.View;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.Map;

@Controller
public class LoginController {

    private UserService userService;

    @Autowired
    public LoginController(UserService userService) {
        this.userService = userService;
    }

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public ModelAndView login(Map<String, Object> model, HttpSession session) {

        System.out.println("User is requested to login");
        model.put("loginForm", new LoginForm());

        return new ModelAndView("login");
    }

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public ModelAndView login(Map<String, Object> model, HttpSession session,
                      HttpServletRequest request, LoginForm form) {

        ModelAndView modelAndView = new ModelAndView();

        User loginAttemptUser = new User(form.getUsername(), form.getPassword());

        if(userService.authenticateUser(loginAttemptUser)) {
            modelAndView.setViewName("redirect:/projects");
            System.out.println("Great Success!");
        } else {
            modelAndView.setViewName("login");
            System.out.println("Great FAILURE!");
        }


        /*if(form.getPassword().equals("pass")) {
            System.out.println("Great Success");

            modelAndView.setViewName("redirect:/projects");
        } else {
            modelAndView.setViewName("login");
        }*/

        modelAndView.addObject("loginForm", form);

        return modelAndView;
    }
}
