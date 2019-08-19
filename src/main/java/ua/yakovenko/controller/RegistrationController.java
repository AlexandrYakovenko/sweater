package ua.yakovenko.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import ua.yakovenko.domain.User;
import ua.yakovenko.service.UserService;

import java.util.Map;

@Controller("/")
public class RegistrationController {
    @Autowired
    private UserService userService;

    @GetMapping("registration")
    public String registration() {
        return "registration";
    }

    @PostMapping("registration")
    public String addUser(User user, Map<String, Object> model) {
        if (!userService.addUser(user)) {
            model.put("message", "This User has already exist!");
            return "registration";
        }

        return "/login";
    }
}
