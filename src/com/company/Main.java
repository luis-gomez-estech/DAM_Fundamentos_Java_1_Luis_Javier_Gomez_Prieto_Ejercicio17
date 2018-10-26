package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        Scanner escaner = new Scanner(System.in);
        System.out.println("Introduzce el día del 1 al 30: ");
        int dia = escaner.nextInt();
        System.out.println("Introduzce el mes del a al 12: ");
        int mes = escaner.nextInt();
        System.out.println("Introduzce el año: ");
        int año = escaner.nextInt();

        //Para hacer este ejercicio he partido del ejercicio 15 y he añadido esta nueva variable

        int dia_incrementado = dia+1; // Nueva variable añadida para despues al imprimir en vez de poner
        // dia + mes + año, pongo entonces dia_incrementado + mes + año

        //Por el enunciado entiendo que se refiere a que:
        // A la hora de preguntarnos el dia, si ponemos un numero mayor de 30 o menor de 1, nos tendria que decir que es errónea
        //ya que suponemos meses de 30 dias.
        // A la hora de preguntarnos por el mes, si ponemos un numero mayor de 12 o menor de 1, nos tendria que decir que es errónea
        // A la hora de preguntarnos por el año, no he puesto ningun rango, entiendo que puede ser cualquiera, es decir, si es un numero negativo serian años A.D.

        // Ahora uso un if dentro de otro de forma condicional, es decir
        // Si el dia introducido esta dentro del rango permitido (del 1 al 30), y si ademas
        // el mes introducido esta dentro del rango 1-12, entonces la fecha es correcta y la muestro en pantalla además

        if (dia >= 1 && dia <=30)
            if (mes >= 1 && mes <= 12) {

                System.out.println ("El dia siguiente a la fecha introducida es " + dia_incrementado + "/" + mes + "/" + año);

                // Ahora cierro el if del mes diciendole con else que si el mes no esta en el rnago 1-12 muestre que la fecha es erronea.

            } else {

                System.out.println("La fecha " + dia + "/" + mes + "/" + año + " es errónea.");

                // Ahora cierro el if del dia diciendole con else que si el dia no esta en el rango 1-30 muestre que la fecha es erronea.
            } else  {

            System.out.println("La fecha " + dia + "/" + mes + "/" + año + " es errónea.");
        }

        // ESTE EJERCICIO CREO QUE SE PUEDE HACER DE OTRA MANERA MAS RESUMIDA PERO NO LO CONSIGO, AUN ASI SIGO PROBANDO.
    }
}





