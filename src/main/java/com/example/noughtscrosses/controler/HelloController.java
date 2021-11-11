package com.example.noughtscrosses.controler;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

@Controller
public class HelloController {
    @GetMapping("/game")
    public String printHello(ModelMap model) {
        return "123";
    }
}
