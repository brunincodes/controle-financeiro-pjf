package com.controle.financeiro.api_fatec.controllers;

import com.controle.financeiro.api_fatec.models.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/exercicio")
public class Exemplo1Controller {

    @GetMapping()
    public String HelloWorld(){
        return "Hello";
    }

    @GetMapping("/hello1")
    public String HelloWorld1(){
        return "Hello1";
    }

    //PathVarible = anotacão para definir que a variavel nome que é o tipo String será recebida pelo parametro (nome)
    @GetMapping("/reverter-nome/{nome}")
    String reverterNome (@PathVariable String nome){
        return new StringBuilder(nome).reverse().toString();
    }

    @PostMapping("/reverter-nome-requisicao-corpo")
    String reverterNomeRequisicaoCorpo (@RequestBody String nome){
        return new StringBuilder(nome).reverse().toString();
    }

    @GetMapping("/ar-ou-impar/{numero}")
    String verificarParImpar (@PathVariable Integer numero){
        if(numero % 2 == 0){
            return "Par";
        } else {
            return "Ímpar";
        }
    }

    @PostMapping("/create-user")
    public String createUser(@RequestBody User user) {
        return "Olá, " + user.getNome() + " você tem " + user.getIdade() + " anos";
    }
}