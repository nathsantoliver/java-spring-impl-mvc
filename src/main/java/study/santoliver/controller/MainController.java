package study.santoliver.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.ui.Model;

// This annotation marks this class as Spring MVC controller
// and adds a bean of this type to the Spring context
@Controller
public class MainController {
    // we assign th controller's action to an HTTP request path
    @RequestMapping("/home")
    public String home(Model page) {    // the action method defines a parameter of type Model that
                                        // stores the data the controller sends to the view
        page.addAttribute("username", "Katy");  // we add the data we want the
        page.addAttribute("color", "red");      // controller to send to the view

        return "home.html"; // the controller's action returns the view to be rendered into the HTTP response
    }

}
