package be.thomas.ClassRoomV1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import be.thomas.ClassRoomV1.service.ClassroomService;

@Controller
@RequestMapping("/classroom")
public class ClassroomController {
    private final ClassroomService classroomService;


    public ClassroomController(ClassroomService classroomService) {
        this.classroomService = classroomService;
    }

    //GET - /classroom
    @GetMapping("/all")
    public String getAll(Model model){
        model.addAttribute("list", classroomService.getAll());
        return "classroom/display-all";
    }
}
