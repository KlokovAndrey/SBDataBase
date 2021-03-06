package project;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ShowResultController {

    @PostMapping("/showResult")
    public String showResultForm(@ModelAttribute Person person,@ModelAttribute Mail mail, Model model) {
        mail.setEmail(person.getEmail());
        mail.setText("");
        model.addAttribute("sendMail", mail);

        return "showResult";
    }
}
