package com.isai.demo_crud_backend_proyect.controllers;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class HolaMundo {

    @GetMapping("/hola-mundo")
    public String getHolaMundo() {
        return new String("<h1>Hola Mundo</h1>");
    }

      @GetMapping("/hola-mundos")
    public String getsHolaMundo() {
        return new String("<h1>Hola Mundo</h1>");
    }

}
