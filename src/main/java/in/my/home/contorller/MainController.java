package in.my.home.contorller;

import lombok.val;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {
   @GetMapping(value = "/")
    public String main(){

       return "main";
   }
}
