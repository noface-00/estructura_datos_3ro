package presentacion;

import java.util.Scanner;
import java.util.Stack;

public class Dinamica1 {

    /**
     * @param args the command line arguments
     */


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Stack<String> pila = new Stack<>();
        int opcion;

        do {
            System.out.println("\n--- PILA DINAMICA ---");
            System.out.println("1. Apilar (push)");
            System.out.println("2. Desapilar (pop)");
            System.out.println("3. Mostrar pila");
            System.out.println("4. Salir");
            System.out.print("Elige una opcion: ");
            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el valor a apilar: ");
                    String valor = scanner.nextLine();
                    pila.push(valor);
                    System.out.println("Valor apilado.");
                    break;
                case 2:
                    if (!pila.isEmpty()) {
                        String eliminado = pila.pop();
                        System.out.println("Elemento desapilado: " + eliminado);
                    } else {
                        System.out.println("La pila esta vacia.");
                    }
                    break;
                case 3:
                    System.out.println("\nContenido de la pila:");
                    if (pila.isEmpty()) {
                        System.out.println("[VACIA]");
                    } else {
                        for (int i = pila.size() - 1; i >= 0; i--) {
                            System.out.println("| " + pila.get(i) + " |");
                        }
                        System.out.println("-----");
                    }
                    System.out.println("Tamano actual: " + pila.size());
                    break;
                case 4:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opcion invalida. Intenta de nuevo.");
            }

        } while (opcion != 4);

        scanner.close();
    }
}

