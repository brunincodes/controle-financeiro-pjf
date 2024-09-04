package com.controle.financeiro.api_fatec.controllers;


import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.controle.financeiro.api_fatec.entites.User;

@RestController
@RequestMapping("/api/usuario")
public class UserController {
    
    @PostMapping("/registro")
    public String createUser(@RequestBody User user) {
        return "Olá, " + user.getNome() + " você tem " + user.getIdade() + " anos";
    }
}
