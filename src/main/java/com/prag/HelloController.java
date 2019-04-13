package com.prag;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HelloController {

    @GetMapping("/springaree1")
    public String getSpringaree() {
        return "Found Springaree 1!";
    }

    @PostMapping("/springaree1")
    public String addSpringaree() {
        return "Added Springaree 1!";
    }

    @PutMapping("/springaree1")
    public String updateSpringaree() {
        return "Updated Springaree 1!";
    }

    @DeleteMapping("/springaree1")
    public String deleteSpringaree() {
        return "Deleted Springaree 1!";
    }

}
