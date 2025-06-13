/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package listasdoblemente.enlazadas;

/**
 *
 * @author hp
 */
public class NodoLista {
    
   int dato;
    NodoLista siguiente;
    NodoLista anterior;

    public NodoLista(int dato, NodoLista siguiente, NodoLista anterior) {
        this.dato = dato;
        this.siguiente = siguiente;
        this.anterior = anterior;
    }

}
