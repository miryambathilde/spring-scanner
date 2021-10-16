package com.example;

import org.springframework.stereotype.Component;

// notacion para decirle que es un beans y nos lo escanne desde el beans.xml
@Component

public class Calculadora {

    public Calculadora(){
        System.out.println("Ejecutando constructor CalculatorService");
    }

    public String holaMundo(){
        return "Hola desde calculadora!";
    }
}
