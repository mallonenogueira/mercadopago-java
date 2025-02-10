package com.application.mercadopago_java.presentation;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class TestController {

    @GetMapping("/teste")
    public TestDTO getTest() {
        return new TestDTO(201, true);
    }


    public record TestDTO(int statusCode, boolean ok) {
    }
}
