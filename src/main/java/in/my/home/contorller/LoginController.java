package in.my.home.contorller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller

public class LoginController {

    @GetMapping(value = "/login")
    public String login(){

        return "/login/login";
    }

    @GetMapping(value = "/signup")
    public String login1(){

        return "login/signup";
    }
}
