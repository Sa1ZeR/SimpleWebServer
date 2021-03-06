package me.sa1zer_.simplewebserver.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/")
public class MainController {

    @GetMapping("/")
    public String main(@RequestParam(name="name", required = false, defaultValue = "User") String name, Model model) {
        model.addAttribute("name",name);
        return "mainpage";
    }
}
