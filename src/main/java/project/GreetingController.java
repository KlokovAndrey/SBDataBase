package project;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

@Controller
public class GreetingController {

    @GetMapping("/greeting")
    public String greetingForm(@ModelAttribute Person person, Model model) {
        return "greeting";
    }
}
