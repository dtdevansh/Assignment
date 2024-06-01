package com.Assignment.Dashboard.Assignment.Dashboard.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class NormalController {

    @GetMapping("/getData")
    public String getData() {
        return "Hello World";
    }
}
