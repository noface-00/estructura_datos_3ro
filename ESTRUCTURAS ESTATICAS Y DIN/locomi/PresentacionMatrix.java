package presentacion;

import java.util.ArrayList;
import java.util.Scanner;

import java.util.Scanner;

public class PresentacionMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] matriz = new int[2][2];  // La matriz ya esta definida desde un inicio

        System.out.println("Ingrese los valores para una matriz 2x2:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print("Valor [" + i + "][" + j + "]: ");
                matriz[i][j] = scanner.nextInt();  // Usuario llena los datos
            }
        }

        System.out.println("Matriz ingresada:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }

        scanner.close();
    }
}
