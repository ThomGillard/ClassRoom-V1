package be.thomas.ClassRoomV1.controller;

import Template.models.form.Form;
import be.thomas.ClassRoomV1.service.Service;
import jakarta.validation.Valid;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@org.springframework.stereotype.Controller
@RequestMapping("/url")
public class Controller {

    private final Service service;

    public Controller(Service service) {
        this.service = service;
    }

    @GetMapping("/crud")
    public String crud(Model model){
        model.addAttribute("ViewObject", new Object());
        //renvoi à la vue dans "ressources/template/"
        return "item/display";
    }

    @PostMapping("/form")
    public String processInsertForm(
            Model model,
            @ModelAttribute("form") @Valid Form form,
            BindingResult bindingResult){
        if(bindingResult.hasErrors() ) {
            model.addAttribute("formInfo", form.info);
            return "item/form";
        }
        service.crud(form);
        return "redirect:/display";
    }
}
