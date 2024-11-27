package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Scanner leerTeclado= new Scanner(System.in);

        //variables Estudiantes
        int aprobados=0;
        int reprobados=0;

        //ciclo //
        for (int i= 1; i <= 15; i++){
            System.out.println("Ingrese la calificacion del estuidante " + i + ":");
            int nota= leerTeclado.nextInt();

            //condicional para saber si el estudiante SI aprobo o NO aprobo (reprobo)
            if (nota >=70){
                System.out.println("Aprobado, Felicitaciones :)! ");
                aprobados=aprobados + 1;
            }else{
                System.out.println("Reprobado :( ");
                reprobados=reprobados+1;
            }

            //Resultados
            System.out.println("\nResultados: ");
            System.out.println("Estudiantes aprobados: " + aprobados);
            System.out.println("Estudiantes reprobados: "+ reprobados);
            System.out.println("************************************");

        }




    }



}