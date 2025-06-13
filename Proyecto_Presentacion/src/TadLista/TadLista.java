package TadLista;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author jaire
 */
public class TadLista implements Lista {

    public Nodolista inicio;

    public TadLista() {
        inicio = null;
    }

    @Override
    public void CrearNodo() {
        inicio = new Nodolista(0, inicio);
    }

    @Override
    public int devolverClave() {
        return inicio.clave;
    }

    @Override
    public Nodolista devolverSiguiente() {
        return inicio.siguiente;
    }

    @Override
    public void asignarclave(int dato) {
        inicio.clave = dato;
    }

    @Override
    public void asignarReferencia(Nodolista referencia) {
        inicio = referencia;
    }

    @Override
    public void asignarReferenciaenlaSiguiente(Nodolista referenciaNueva) {
        inicio.siguiente = referenciaNueva;
    }

    @Override
    public void asignarNulo() {
        inicio = null;
    }

    @Override
    public boolean esNulo() {
        return inicio == null;
    }

    @Override
    public boolean Esigual(Nodolista referencia) {
        return inicio == referencia;
    }

    @Override
    public void cargarTadLista() throws NumberFormatException, IOException {

        int cantidad, i, x;
        Nodolista aux;
        Nodolista ant = null;
        BufferedReader linea_entrada = new BufferedReader(new InputStreamReader(System.in));

        inicio = null;

        System.out.println("Numero de elementos de la Lista : ");
        cantidad = Integer.parseInt(linea_entrada.readLine());
        for (i = 0; i < cantidad; i++) {
            x = Integer.parseInt(linea_entrada.readLine());
            aux = new Nodolista(x, null);
            if (inicio == null) {
                inicio = aux;
                ant = aux;
            } else {
                ant.siguiente = aux;
                ant = aux;
            }
        }
    }

    @Override
    public void imprimirLista() {

        Nodolista aux;

        aux = inicio;
        while (aux != null) {
            System.out.print(aux.clave + " ");
            aux = aux.siguiente;
        }
        System.out.println("FIN");
    }

    @Override
    public void insertarAlFinal(TadLista lista, int dato) throws NumberFormatException, IOException {
        lista.inicio = insertarAlFinal(lista.inicio, dato);
    }

    @Override
    public Nodolista insertarAlFinal(Nodolista nodoLista, int dato) {
        Nodolista resul = nodoLista;

        if (nodoLista != null) {
            nodoLista.siguiente = insertarAlFinal(nodoLista.siguiente, dato);
        } else {
            resul = new Nodolista(dato);

        }
        return resul;
    }

    @Override
    public void insertarEnPosicion(int dato, int posicion) throws NumberFormatException, IOException {
        if (posicion < 0) {
            throw new IndexOutOfBoundsException("La posición no puede ser negativa");
        }

        Nodolista nuevo = new Nodolista(dato, null);

        if (posicion == 0) {
            nuevo.siguiente = inicio;
            inicio = nuevo;
            return;
        }

        Nodolista actual = inicio;
        int contador = 0;

        while (actual != null && contador < posicion - 1) {
            actual = actual.siguiente;
            contador++;
        }

        if (actual == null) {
            throw new IndexOutOfBoundsException("Posición fuera de rango");
        }

        nuevo.siguiente = actual.siguiente;
        actual.siguiente = nuevo;
    }

    @Override
    public void eliminarValor(int Eliminar) {  
    if (inicio == null) return;
    if (inicio.clave == Eliminar) {
        inicio = inicio.siguiente;
        return;
    }
   Nodolista actual = inicio;
    while (actual.siguiente != null && actual.siguiente.clave != Eliminar) {
        actual = actual.siguiente;
    }
    if (actual.siguiente != null) {
        actual.siguiente = actual.siguiente.siguiente;
    }
}

    @Override
    public void buscarelemento(int Buscar) {
        Nodolista actual = inicio;

    while (actual != null) {
        if (actual.clave == Buscar) {
            System.out.println("Elemento encontrado: " + actual.clave);
            return;
        }
        actual = actual.siguiente;
    }         System.out.println("El elemento no se encuentra dentro de la lista");
        
    }

    @Override
    public void contar() {
    int contador = 0;
    Nodolista actual = inicio;

    while (actual != null) {
        contador++;
        actual = actual.siguiente;
    }
    System.out.println("La lista contiene " + contador + " elementos.");
}


}
