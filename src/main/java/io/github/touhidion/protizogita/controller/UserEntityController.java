package io.github.touhidion.protizogita.controller;

import io.github.touhidion.protizogita.dto.request.UserSignupRequest;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserEntityController {

    @PostMapping("/go")
    public String signupUser(@Valid @RequestBody UserSignupRequest userSignupRequest) {
        return "hello";
    }

    @GetMapping("/god")
    public String signupUser2() {
        return "hello 2";
    }

    @PostMapping("/a")
    public String signupUser3() {
        return "hello 3";
    }
}
