package com.controle.financeiro.api_fatec.controllers;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@RequestMapping("/api/exercicios")
public class Exercicios {
    
    //Exercício1
    @GetMapping("/contar-letras/{texto}")
    Integer tamanhoTexto(@PathVariable String texto) {
        return texto.length();
    }

    //Exercício2
    @GetMapping("/idade/{idade}")
    String idadePessoa(@PathVariable Integer idade) {
        if (idade >= 1 && idade <= 12) {
            return "Criança";
        } else if (idade > 12 && idade <= 18) {
            return "Adolescente";
        } else if (idade > 18 && idade < 60) {
            return "Adulto";
        } else if (idade <= 0 || idade >= 110){
            return "Idade Inválida";
        }
         else {
            return "Idoso";
        }
    }
}
