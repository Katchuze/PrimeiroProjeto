package com.example.exercicio2.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BinarioController {
    //atividade1
    @GetMapping("binToDec/{binario}")
    public String converteBinarioParaDecimal(@PathVariable String binario) {
        int valorDecimal = 0;
        for (int i = binario.length() - 1; i >= 0; i--) {
            if (binario.charAt(i) == '1') {
                valorDecimal += Math.pow(2, i);
            }
        }
        return valorDecimal + "";
    }
}