package io.github.touhidion.protizogita.controller;

import io.github.touhidion.protizogita.dto.request.UserSignupRequest;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/user")
public class UserEntityController {

    @PostMapping("/go")
    public String signupUser(@Valid @RequestBody UserSignupRequest userSignupRequest) {
        return "hello";
    }

}
