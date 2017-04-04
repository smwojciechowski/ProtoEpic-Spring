package com.slav.site;

import com.slav.site.form.LoginForm;
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

        if(form.getPassword().equals("pass")) {
            System.out.println("Great Success");

            modelAndView.setViewName("redirect:/projects");
        } else {
            modelAndView.setViewName("login");
        }
        modelAndView.addObject("loginForm", form);
        return modelAndView;
    }
}
