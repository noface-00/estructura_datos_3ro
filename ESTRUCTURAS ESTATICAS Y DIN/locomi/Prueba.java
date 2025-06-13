package presentacion;

import java.util.Scanner;

public class Prueba {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario el número de filas y columnas
        System.out.print("Ingrese el numero de filas: ");
        int filas = scanner.nextInt();
        System.out.print("Ingrese el numero de columnas: ");
        int columnas = scanner.nextInt();

        // Crear la matriz
        int[][] matriz = new int[filas][columnas];//El tamano de la matriz se decide desde un principio. Mediante el scanner

        System.out.println("Ingrese los valores de la matriz:");
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print("Ingrese el valor para la posicion [" + i + "][" + j + "]: ");
                matriz[i][j] = scanner.nextInt();
            }
        }

        System.out.println("\nLa matriz ingresada es:");
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }

        scanner.close();
    }
}
