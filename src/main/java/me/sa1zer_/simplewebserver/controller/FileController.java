package me.sa1zer_.simplewebserver.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/filemanager")
public class FileController {

    @GetMapping("/")
    public String onMain() {
        return "main";
    }
}
