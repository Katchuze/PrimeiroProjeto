package com.example.exercicio2.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RomanoController {
    //atividade2
    @GetMapping("romToDec/{romano}")
    public String converteRomanoParaDecimal(@PathVariable String romano) {
        int valorDecimal = 0;
        for (int i = 0; i < romano.length(); i++) {
            switch (romano.charAt(i)) {
                case 'I':
                    valorDecimal += 1;
                    break;
                case 'V':
                    valorDecimal += 5;
                    break;
                case 'X':
                    valorDecimal += 10;
                    break;
            }
        }
        return valorDecimal+"";
    }
}