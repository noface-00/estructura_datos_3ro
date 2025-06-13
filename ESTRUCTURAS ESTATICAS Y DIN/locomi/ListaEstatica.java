/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package presentacion;

/**
 *
 * @author Date
 */
public class ListaEstatica implements TADLista {
    private int[] lista;
    private int contador;
    private final int MAX;

    public ListaEstatica(int tamaño) {
        MAX = tamaño;
        lista = new int[MAX];
        contador = 0;
    }

    @Override
    public void insertar(int dato) {
        if (contador < MAX) {
            lista[contador] = dato;
            contador++;
            System.out.println("Elemento " + dato + " insertado.");
        } else {
            System.out.println("No se puede insertar mas elementos! La lista esta llena.");
        }
    }

    @Override
    public void mostrar() {
        System.out.println("\nContenido de la lista:");
        for (int i = 0; i < contador; i++) {
            System.out.print(lista[i] + " ");
        }
        System.out.println();
    }
}
