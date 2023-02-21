package be.thomas.ClassRoomV1.controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import be.thomas.ClassRoomV1.exceptions.NotFoundException;

@ControllerAdvice
public class AdvisorController {

    @ExceptionHandler({NotFoundException.class})
    public String handle(NotFoundException ex, Model model, HttpServletRequest req){
        model.addAttribute("ex", ex);
        return "errors/not-found";
    }
}
