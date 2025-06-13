/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package presentacion;

import java.util.Scanner;

/**
 *
 * @author Date
 */
public class Main {
    public static void main(String[] args) {
        ListaEstatica miLista = new ListaEstatica(5); // Tamaño fijo

        // Insertamos 6 elementos para mostrar el límite
        miLista.insertar(10);
        miLista.insertar(20);
        miLista.insertar(30);
        miLista.insertar(40);
        miLista.insertar(50);
        miLista.insertar(60);
        miLista.insertar(70);
        miLista.insertar(80);

        // Mostrar la lista
        miLista.mostrar();
    }
}

