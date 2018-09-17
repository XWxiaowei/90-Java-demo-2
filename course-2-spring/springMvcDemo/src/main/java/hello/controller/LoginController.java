package hello.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import hello.service.MessageService;

import javax.servlet.http.HttpServletRequest;

@Controller
public class LoginController {

    //从容器中自动注入bean
    @Autowired
    private MessageService messageService;

    @RequestMapping("/login")
    public String login(HttpServletRequest req) {

        String mess = messageService.getMessage();
        System.out.println(mess);

        //把值传到页面中
        req.setAttribute("data", "this is data");
        return "login";
    }

    //
    @RequestMapping("/registSuccess")
    public String registSuccess(String username, HttpServletRequest req) {

        System.out.println(username);
        System.out.println(req.getParameter("password"));

        req.setAttribute("username", username);
        req.setAttribute("password", req.getParameter("password"));

        return "login";
    }
}
