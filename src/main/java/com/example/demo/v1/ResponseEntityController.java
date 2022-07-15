package com.example.demo.v1;

import org.apache.coyote.Response;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/response")
public class ResponseEntityController {



    @GetMapping("/test")
    public ResponseEntity test() {
        return new ResponseEntity(HttpStatus.OK);
    }
}
