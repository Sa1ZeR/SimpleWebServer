package me.sa1zer_.simplewebserver.controller;

import me.sa1zer_.simplewebserver.models.requests.AuthRequest;
import me.sa1zer_.simplewebserver.models.requests.RegistrationRequest;
import me.sa1zer_.simplewebserver.models.responses.RegistrationResponse;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/api")
public class APIController {

    @GetMapping("/auth")
    public String auth(@RequestParam("user") String userName, @RequestParam("password") String password, Model model) {
        AuthRequest authRequest = new AuthRequest(userName, password);

        model.addAttribute(authRequest.requestDo());
        return "jsonTemplate";
    }

    @GetMapping("/register")
    public String register(@RequestParam("user") String userName, @RequestParam("password") String password,
            @RequestParam("email") String email, @RequestParam("sex") boolean sex, long regDate, Model model) {
        RegistrationRequest request = new RegistrationRequest(userName, password, email, sex, regDate);

        model.addAttribute(request.requestDo());
        return "jsonTemplate";
    }
}
