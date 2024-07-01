package likelionjpa.jpasession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
@Controller

public class ViewController {
    @GetMapping("Niicka")
    public String View(Model model){
        model.addAttribute("Niicka","Niick");
        return "Niicka";
    }
}
