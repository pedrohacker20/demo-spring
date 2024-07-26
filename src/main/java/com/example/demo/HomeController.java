package com.example.demo;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v3")
public class HomeController {


    @GetMapping("/personas")
    public String index(){
        return "hola a todos";
    }

    @GetMapping("/mascotas")
    public String mascotas(){
        return "hola a todos";
    }

    @GetMapping("/productos")
    public String productos(){
        return "hola a todos";
    }
}
