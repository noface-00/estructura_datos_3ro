package listas_centinelas;

import java.util.InputMismatchException;
import java.util.Scanner;
/**
 *
 * @author Marilyn Sanchez
 */

public class Main {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Lista tareas = new ListaConCentinela();
        int opcion = 0;

        do {
            try {
                System.out.println("1. Agregar tarea");
                System.out.println("2. Eliminar tarea");
                System.out.println("3. Mostrar lista de tareas");
                System.out.println("4. Salir");
                System.out.println("5. Buscar tarea"); // NUEVO
                opcion = entrada.nextInt();

                switch (opcion) {
                    case 1:
                        System.out.print("Ingresa el ID de la tarea: ");
                        int nueva = entrada.nextInt();
                        tareas.insertar(nueva);
                        break;
                    case 2:
                        System.out.print("Ingresa el ID de la tarea a eliminar: ");
                        int eliminar = entrada.nextInt();
                        tareas.eliminar(eliminar);
                        break;
                    case 3:
                        tareas.imprimir();
                        break;
                    case 4:
                        System.out.println("Saliendo del sistema. ¡Hasta luego!");
                        break;

                    case 5:
                        System.out.print("Ingresa el ID de la tarea a buscar: ");
                        int buscar = entrada.nextInt();
                        boolean encontrado = tareas.buscar(buscar);
                        if (encontrado) {
                            System.out.println("Tarea encontrada: " + buscar);
                        } else {
                            System.out.println("Tarea no encontrada.");
                        }
                        break;

                    default:
                        System.out.println("Opción inválida. Intenta con un número del 1 al 4.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida. Por favor, ingresa solo números.");
                entrada.nextLine(); // limpia el buffer del scanner
            }
        } while (opcion != 4);

        entrada.close();
    }
}
