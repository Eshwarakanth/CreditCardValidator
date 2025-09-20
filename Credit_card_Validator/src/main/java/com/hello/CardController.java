package com.hello;

import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/cards")
public class CardController {

	@RequestMapping("/form")
    public String showForm(Model model) {
        model.addAttribute("cardRequest", new CardRequest());
        return "cardForm"; // resolves to /WEB-INF/jsp/cardForm.jsp
    }

	@RequestMapping("/submit")
    public String validateCard(@Valid @ModelAttribute("cardRequest") CardRequest cardRequest,
                               BindingResult result,
                               Model model) {
        if (result.hasErrors()) {
            return "cardForm"; // show validation errors
        }
        model.addAttribute("message", "Card is valid!");
        return "success"; // JSP page
    }
}
