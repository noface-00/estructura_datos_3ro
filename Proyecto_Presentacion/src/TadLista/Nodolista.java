/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TadLista;

/**
 *
 * @author mkevi
 */
class Nodolista {

    int clave;
    Nodolista siguiente;
  

    public Nodolista(int clave) {
        this.clave = clave;
        this.siguiente = null;
    }

    public Nodolista(int clave, Nodolista siguiente) {
        this.clave = clave;
        this.siguiente = siguiente;
    }
    
}
