package io.github.touhidion.protizogita.controller;

import io.github.touhidion.protizogita.constant.TLPages;
import io.github.touhidion.protizogita.constant.UIPaths;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(UIPaths.HOME)
public class HomeController {

    @GetMapping
    public String showHome(){
        return TLPages.HOME;
    }
}
