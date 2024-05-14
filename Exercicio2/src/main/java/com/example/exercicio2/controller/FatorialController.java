package com.example.exercicio2.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FatorialController {
    //atividade3
    @GetMapping("fatorial/{numero}")
    public String calcularFatorial(@PathVariable int numero) {
        if (numero < 0) {
            return "O número não é válido.";
        } else {
            int valor = 1;
            for(int i = 1; i <= numero; i++){
                valor*= i;
            }
            return "O fatorial de " +numero + " é " + valor;
        }
    }
}