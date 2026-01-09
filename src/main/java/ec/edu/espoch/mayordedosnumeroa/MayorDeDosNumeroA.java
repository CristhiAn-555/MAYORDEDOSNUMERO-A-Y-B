/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package ec.edu.espoch.mayordedosnumeroa;



/**
 *
 * @author PERSONAL
 */
public class MayorDeDosNumeroA {

   
    
    
    // Algoritmo A: comparación directa
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
        return (a == 0) ? n2 : n1;
    }

    public static void main(String[] args) {

        int n1 = 15;
        int n2 = 25;
        int resultado;

        int[] repeticiones = {10, 20, 30, 40};

        for (int veces : repeticiones) {

            System.out.println("\n====================================");
            System.out.println("EJECUCIONES: " + veces);
            System.out.println("====================================");

            // -------- ALGORITMO A --------
            long inicioA = System.nanoTime();

            for (int i = 1; i <= veces; i++) {
                resultado = algoritmoA(n1, n2);
                System.out.println("Alg A - Ejecución " + i + ": Mayor = " + resultado);
            }

            long finA = System.nanoTime();
            long tiempoTotalA_ns = finA - inicioA;

            double tiempoTotalA_s = tiempoTotalA_ns / 1_000_000_000.0;
            double promedioA_s = tiempoTotalA_s / veces;

            System.out.println("Tiempo total Algoritmo A: " + tiempoTotalA_s + " s");
            System.out.println("Promedio Algoritmo A: " + promedioA_s + " s");

            // -------- ALGORITMO B --------
            long inicioB = System.nanoTime();

            for (int i = 1; i <= veces; i++) {
                resultado = algoritmoB(n1, n2);
                System.out.println("Alg B - Ejecución " + i + ": Mayor = " + resultado);
            }

            long finB = System.nanoTime();
            long tiempoTotalB_ns = finB - inicioB;

            double tiempoTotalB_s = tiempoTotalB_ns / 1_000_000_000.0;
            double promedioB_s = tiempoTotalB_s / veces;

            System.out.println("Tiempo total Algoritmo B: " + tiempoTotalB_s + " s");
            System.out.println("Promedio Algoritmo B: " + promedioB_s + " s");
        }
    }
}
