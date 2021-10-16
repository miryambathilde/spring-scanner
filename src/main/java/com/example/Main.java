package com.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {

        // EJEMPLO 1

        // Opción 1: Como crear un objeto de forma normal
        //Calculadora service = new Calculadora();

        // Opción 2: Recibir un objeto de SPRING

        // instanciamos los contenedores de beans, si tenemos más de uno los separamos por comas
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

        // añadimos el contexto de nuestro servicio
        Calculadora calculadora = (Calculadora) context.getBean("calculadora");

        // instanciamos el metodo holaMundo en una varible String
        String texto = calculadora.holaMundo();
        System.out.println(texto);

        // CONCEPTO 2: cargar un bean dentro de otro bean
        GestorFacturas gestor = (GestorFacturas) context.getBean("gestorFacturas");
        System.out.println(gestor.calculadora.holaMundo());

        // CONCEPTO 3: SCOPE O ALCANCE
        // los beans por defecto son singleton: se crea el objeto y se reutiliza para toda la aplicación
        // podemos cambiarlo a scope= "prototype" si queremos que se cree un neuvo objeto cada vez

    }
}
