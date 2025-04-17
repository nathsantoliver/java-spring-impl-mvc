package study.santoliver.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {

    @RequestMapping("/home")
    public String home(@RequestParam String color, Model page) {
        page.addAttribute("username", "Katy");
        page.addAttribute("color", "red");

        return "home.html";
    }

}
