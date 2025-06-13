/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TadLista;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author lvsld
 */
public class Main_Presentacion {

    public static boolean bandera = true;

    public static void main(String[] args) throws NumberFormatException, IOException {
        TadLista lista = new TadLista();
        int deter, valor, posicion, buscar, eliminar;

        BufferedReader linea = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Ingrese la dimension de la Lista y sus Valores");
        lista.cargarTadLista();

        while (bandera == true) {
            System.out.println("""
                               Seleccione la opcion a ejecutar
                               1.-Buscar un elemento
                               2.-Insertar un Elemento
                               3.-Eliminar un Elemento
                               4.-Recorrido completo
                               5.-Salir""");
            deter = Integer.parseInt(linea.readLine());

            switch (deter) {
                case 1 -> {
                    System.out.println("Ingrese el Valor a Buscar");
                    buscar = Integer.parseInt(linea.readLine());
                    lista.buscarelemento(buscar);
                    lista.imprimirLista();
                }
                case 2 -> {
                    System.out.println("Ingrese el elemento a insertar");
                    valor = Integer.parseInt(linea.readLine());
                    System.out.println("Ingrese la posicion a ingresar");
                    posicion = Integer.parseInt(linea.readLine());
                    lista.insertarEnPosicion(valor, posicion);
                    lista.imprimirLista();
                }
                case 3 -> {
                    System.out.println("Ingrese el elemento a eliminar");
                    eliminar = Integer.parseInt(linea.readLine());
                    lista.eliminarValor(eliminar);
                    lista.imprimirLista();
                }
                case 4 -> {
                    lista.contar();
                    lista.imprimirLista();
                }
                case 5 ->
                    bandera = false;
            }
        }
    }
}
