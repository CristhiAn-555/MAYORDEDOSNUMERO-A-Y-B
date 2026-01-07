/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package ec.edu.espoch.mayordedosnumeroa;

import java.util.Scanner;



/**
 *
 * @author PERSONAL
 */
public class MayorDeDosNumeroA {

    public static int algoritmoA(int n1, int n2) {
        return (n1 > n2) ? n1 : n2;
    }

    // Algoritmo B: restas sucesivas
    public static int algoritmoB(int n1, int n2) {
        int a = n1;
        int b = n2;
        while (a > 0 && b > 0) {
            a--;
            b--;
        }
        return (a == 0) ? n2 : n1; // devuelve el mayor
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Números estáticos
        int n1 = 15;
        int n2 = 25;

        int resultado;
        int veces;

        // Preguntar al usuario cuántas veces quiere ejecutar
        System.out.println("Seleccione cuántas veces ejecutar los algoritmos: ");
        System.out.println("Opciones: 10, 20, 30, 40");
        System.out.print("Ingrese su opción: ");
        veces = sc.nextInt();

        // Validar opción
        if (veces != 10 && veces != 20 && veces != 30 && veces != 40) {
            System.out.println("Opción no válida. Se usará 10 ejecuciones por defecto.");
            veces = 10;
        }

        // --- Algoritmo A ---
        long inicioA = System.nanoTime();
        System.out.println("\n--- Algoritmo A (" + veces + " veces) ---");
        for (int i = 1; i <= veces; i++) {
            resultado = algoritmoA(n1, n2);
            System.out.println("Ejecución " + i + ": Mayor = " + resultado);
        }
        long finA = System.nanoTime();
        System.out.println("Tiempo total Algoritmo A: " + (finA - inicioA) + " ns");

        // --- Algoritmo B ---
        long inicioB = System.nanoTime();
        System.out.println("\n--- Algoritmo B (" + veces + " veces) ---");
        for (int i = 1; i <= veces; i++) {
            resultado = algoritmoB(n1, n2);
            System.out.println("Ejecución " + i + ": Mayor = " + resultado);
        }
        long finB = System.nanoTime();
        System.out.println("Tiempo total Algoritmo B: " + (finB - inicioB) + " ns");

        sc.close();
    }
      
}
