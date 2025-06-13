/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package listasdoblemente.enlazadas;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TadLista implements Lista {
    NodoLista inicio;

    @Override
    public void cargarLista() throws IOException {
        int cantidad, i, x;
        NodoLista aux, ant = null;
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));

        inicio = null;

        System.out.print("Número de elementos de la lista: ");
        cantidad = Integer.parseInt(entrada.readLine());

        for (i = 0; i < cantidad; i++) {
            System.out.print("Elemento " + (i + 1) + ": ");
            x = Integer.parseInt(entrada.readLine());
            aux = new NodoLista(x, null, ant);
            if (inicio == null) {
                inicio = aux;
            } else {
                ant.siguiente = aux;
            }
            ant = aux;
        }
    }

    @Override
    public void eliminar(int valor) {
        NodoLista actual = inicio;

        while (actual != null) {
            if (actual.dato == valor) {
                if (actual.anterior != null) {
                    actual.anterior.siguiente = actual.siguiente;
                } else {
                    inicio = actual.siguiente;
                }

                if (actual.siguiente != null) {
                    actual.siguiente.anterior = actual.anterior;
                }

                System.out.println("Elemento " + valor + " eliminado.");
                return;
            }
            actual = actual.siguiente;
        }

        System.out.println("Elemento " + valor + " no encontrado.");
    }

    @Override
    public void mostrar() {
        NodoLista actual = inicio;
        System.out.print("Lista: ");
        while (actual != null) {
            System.out.print(actual.dato + " <-> ");
            actual = actual.siguiente;
        }
        System.out.println("null");
    }
}
