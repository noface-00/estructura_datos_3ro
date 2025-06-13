/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package listadensa;

import java.util.ArrayList;
import java.util.Scanner;

public class ListaDensa implements Lista {
    private ArrayList<Integer> lista = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);

    // Implementación de métodos de la interfaz
    @Override
    public void insertar(int elemento) {
        lista.add(elemento);
        System.out.println("Elemento insertado.");
    }

    @Override
    public boolean eliminar(int elemento) {
        if (lista.remove((Integer) elemento)) {
            System.out.println("Elemento eliminado.");
            return true;
        } else {
            System.out.println("Elemento no encontrado.");
            return false;
        }
    }

    @Override
    public boolean buscar(int elemento) {
        if (lista.contains(elemento)) {
            System.out.println("Elemento encontrado en la posicion: " + lista.indexOf(elemento));
            return true;
        } else {
            System.out.println("Elemento no encontrado.");
            return false;
        }
    }

    @Override
    public void recorrer() {
        if (lista.isEmpty()) {
            System.out.println("La lista esta vacia.");
        } else {
            System.out.println("Elementos en la lista:");
            for (int i = 0; i < lista.size(); i++) {
                System.out.println("Indice " + i + ": " + lista.get(i));
            }
        }
    }

    // Método para iniciar la interacción con el usuario
    public void iniciar() {
        System.out.print("¿Cuantos elementos deseas insertar inicialmente? ");
        int cantidad = scanner.nextInt();

        for (int i = 0; i < cantidad; i++) {
            System.out.print("Ingresa el elemento #" + (i + 1) + ": ");
            int elemento = scanner.nextInt();
            insertar(elemento);
        }

        menu();
    }

    public void menu() {
        int opcion;
        do {
            System.out.println("\n--- Menu ---");
            System.out.println("1. Insertar un elemento");
            System.out.println("2. Eliminar un elemento");
            System.out.println("3. Buscar un elemento");
            System.out.println("4. Recorrer la lista");
            System.out.println("5. Salir");
            System.out.print("Elige una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Ingresa el nuevo elemento: ");
                    insertar(scanner.nextInt());
                    break;
                case 2:
                    System.out.print("Ingresa el elemento a eliminar: ");
                    eliminar(scanner.nextInt());
                    break;
                case 3:
                    System.out.print("Ingresa el elemento a buscar: ");
                    buscar(scanner.nextInt());
                    break;
                case 4:
                    recorrer();
                    break;
                case 5:
                    System.out.println("Programa finalizado.");
                    break;
                default:
                    System.out.println("Opcion no valida.");
            }
        } while (opcion != 5);
    }

    public static void main(String[] args) {
        ListaDensa programa = new ListaDensa();
        programa.iniciar();
    }
}

