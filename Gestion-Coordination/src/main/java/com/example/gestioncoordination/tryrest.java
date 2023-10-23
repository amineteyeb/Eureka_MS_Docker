package com.example.gestioncoordination;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class tryrest {

    @GetMapping("/display")
    public ResponseEntity<String> displayText() {
        String message = "Hello, MS Coordination !";
        return ResponseEntity.ok(message);
    }
    }

