package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("¡Hola, mundo!");

        String[] peliculas = new String[10];
        int[] copias = new int[10];
        int totalDePeliculas = 0;

        Scanner leerTeclado = new Scanner(System.in);

        while (true) {
            // Menú
            System.out.println("\n--- Bienvenido al videoclub Pelisflix ---");
            System.out.println("1. Ingresar película");
            System.out.println("2. Buscar película");
            System.out.println("3. Mostrar película con más copias");
            System.out.println("4. Mostrar películas con menos de 2 copias");
            System.out.println("5. Salir");
            System.out.print("Elija una opción: ");

            int opcion = leerTeclado.nextInt();
            leerTeclado.nextLine(); 

            if (opcion == 1) {

                if (totalDePeliculas < 10) {
                    System.out.print("Ingrese el título de la película: ");
                    peliculas[totalDePeliculas] = leerTeclado.nextLine();
                    System.out.print("Ingrese el número de copias: ");
                    copias[totalDePeliculas] = leerTeclado.nextInt();
                    totalDePeliculas++;
                    System.out.println("Película agregada.");
                } else {
                    System.out.println("No se pueden agregar más películas.");
                }
            } else if (opcion == 2) {

                System.out.print("Ingrese el título de la película que quiere buscar: ");
                String tituloBuscar = leerTeclado.nextLine();
                boolean encontrada = false;

                for (int i = 0; i < totalDePeliculas; i++) {
                    if (peliculas[i].equalsIgnoreCase(tituloBuscar)) {
                        System.out.println("Película: " + peliculas[i]);
                        System.out.println("Copias disponibles: " + copias[i]);
                        encontrada = true;
                        break;
                    }
                }
                if (!encontrada) {
                    System.out.println("Película no encontrada.");
                }
            } else if (opcion == 3) {

                if (totalDePeliculas == 0) {
                    System.out.println("No hay películas registradas.");
                } else {
                    int maxCopiasIndex = 0;
                    for (int i = 1; i < totalDePeliculas; i++) {
                        if (copias[i] > copias[maxCopiasIndex]) {
                            maxCopiasIndex = i;
                        }
                    }
                    System.out.println("Película con más copias:");
                    System.out.println("Título: " + peliculas[maxCopiasIndex]);
                    System.out.println("Copias: " + copias[maxCopiasIndex]);
                }
            } else if (opcion == 4) {

                System.out.println("Películas con menos de 2 copias:");
                boolean hayPocasCopias = false;

                for (int i = 0; i < totalDePeliculas; i++) {
                    if (copias[i] < 2) {
                        System.out.println("Título: " + peliculas[i] + " - Copias: " + copias[i]);
                        hayPocasCopias = true;
                    }
                }
                if (!hayPocasCopias) {
                    System.out.println("Todas las películas tienen 2 o más copias.");
                }
            } else if (opcion == 5) {

                System.out.println("Gracias por preferirnos, vuelva pronto a Pelisflix.");
                break;
            } else {
                System.out.println("Opción inválida, intente de nuevo.");
            }
        }

        leerTeclado.close();
    }
}