package com.github.qsrc.zsi.example.backend;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/simple")
public class SimpleController {

    @GetMapping("ok")
    public ResponseEntity<String> ok() {
        return new ResponseEntity<>("ok", HttpStatus.OK);
    }

}
