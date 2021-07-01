package br.com.mercadolivre.calculadora_idade.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Calendar;


@RestController
public class CalcIdadeController {

    private final int anoAtual = Calendar.getInstance().get(Calendar.YEAR);


    @GetMapping("/{anoNascimento}")
    public int calculaIdade(@PathVariable int anoNascimento){
        return anoAtual - anoNascimento;
    }
}
