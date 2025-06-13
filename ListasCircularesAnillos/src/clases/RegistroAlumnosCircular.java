package clases;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class RegistroAlumnosCircular {
   
    public static void main(String[] args) {
        ListaCircular lista = new ListaCircular();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Sistema de registro de alumnos con lista circular");

        boolean salir = false;

        while (!salir) {
            System.out.println("\nElige una opcion:");
            System.out.println("1. Insertar alumno");
            System.out.println("2. Eliminar alumno por ID");
            System.out.println("3. Buscar alumno por ID");
            System.out.println("4. Mostrar todos los alumnos");
            System.out.println("5. Salir");
            System.out.print("Opcion: ");

            int opcion = 0;
            try {
                opcion = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Opcion inválida, ingresa un número valido.");
                continue;
            }

            switch (opcion) {
                case 1:
                    try {
                        System.out.print("Ingrese ID del alumno: ");
                        int id = Integer.parseInt(scanner.nextLine());
                        System.out.print("Ingrese nombre del alumno: ");
                        String nombre = scanner.nextLine();
                        Alumno alumno = new Alumno(id, nombre);
                        lista.insertar(alumno);
                        System.out.println("Alumno insertado correctamente.");
                    } catch (NumberFormatException e) {
                        System.out.println("ID invalido.");
                    }
                    break;
                case 2:
                    try {
                        System.out.print("Ingrese ID del alumno a eliminar: ");
                        int idEliminar = Integer.parseInt(scanner.nextLine());
                        lista.eliminarPorId(idEliminar);
                        System.out.println("Alumno eliminado correctamente.");
                    } catch (NoSuchElementException e) {
                        System.out.println(e.getMessage());
                    } catch (NumberFormatException e) {
                        System.out.println("ID invalido.");
                    }
                    break;
                case 3:
                    try {
                        System.out.print("Ingrese ID del alumno a buscar: ");
                        int idBuscar = Integer.parseInt(scanner.nextLine());
                        Alumno encontrado = lista.buscarPorId(idBuscar);
                        if (encontrado != null) {
                            System.out.println("Alumno encontrado: " + encontrado);
                        } else {
                            System.out.println("Alumno no encontrado.");
                        }
                    } catch (NumberFormatException e) {
                        System.out.println("ID invalido.");
                    }
                    break;
                case 4:
                    lista.mostrar();
                    break;
                case 5:
                    salir = true;
                    System.out.println("Saliendo del sistema. ");
                    break;
                default:
                    System.out.println("Opcion no valida.");
            }
        }

        scanner.close();
    }
}


