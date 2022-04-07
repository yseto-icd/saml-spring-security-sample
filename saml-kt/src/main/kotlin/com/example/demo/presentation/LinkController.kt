package com.example.demo.presentation;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LinkController {
    @GetMapping("/link")
    fun showUsers(model:Model): String {
        return "link"
    }
}
