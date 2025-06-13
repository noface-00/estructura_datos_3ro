
package TadLista;

import java.io.IOException;

/**
 *
 * @author mkevi
 */
public interface Lista {
    
    void CrearNodo (); 
    
    int devolverClave();
    
    Nodolista devolverSiguiente();
    
    void asignarclave (int dato); 
    
    void asignarReferencia(Nodolista referencia);
    
    void asignarReferenciaenlaSiguiente(Nodolista referenciaNueva);
    
    void asignarNulo();
    
    boolean esNulo();
    
    boolean Esigual (Nodolista referencia);
    
    void imprimirLista();
    
    void buscarelemento(int dato);
    
    void eliminarValor(int dato);
    
    void contar();
    
    void insertarAlFinal(TadLista lista, int dato)throws NumberFormatException, IOException;
    
    Nodolista insertarAlFinal(Nodolista nodoLista, int dato);

    void insertarEnPosicion(int posicion, int dato) throws NumberFormatException, IOException;
            
    void cargarTadLista()throws NumberFormatException, IOException;
}
