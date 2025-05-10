package br.com.cod3r.exerciciossb.controllers;

import org.springframework.web.bind.annotation.*;

@RestController
public class PrimeiroController {

    //@RequestMapping(method = RequestMethod.GET, path = "/ola")
    @GetMapping(path = {"/ola", "/saudacao"}) //é um path param
    public String ola(){
        return "Ola Spring Boot! -> (GET)";
    }

// simulando erros:
//    @PostMapping(path = {"/saudacao"})
//    public String oiii(){
//        return "Oiii Spring Boot! -> (POST)";
//    }


}
