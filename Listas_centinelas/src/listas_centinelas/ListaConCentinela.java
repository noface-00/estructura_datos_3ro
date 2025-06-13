package listas_centinelas;
/**
 *
 * @author Kevin Mora
 */

public class ListaConCentinela implements Lista {

    private Nodo cabeza;
    private Nodo centinela;

    public ListaConCentinela() {
        centinela = new Nodo(-1);  // Nodo centinela
        cabeza = centinela;        // Lista vacía
    }

    @Override
    public void insertar(int valor) {
        Nodo nuevo = new Nodo(valor);
        if (cabeza == centinela) {
            nuevo.siguiente = centinela;
            cabeza = nuevo;
        } else {
            Nodo actual = cabeza;
            while (actual.siguiente != centinela) {
                actual = actual.siguiente;
            }
            actual.siguiente = nuevo;
            nuevo.siguiente = centinela;
        }
    }

    @Override
    public void eliminar(int valor) {
        if (cabeza == centinela) {
            System.out.println("La lista está vacía.");
            return;
        }

        if (cabeza.dato == valor) {
            cabeza = cabeza.siguiente;
            System.out.println("Elemento eliminado: " + valor);
            return;
        }

        Nodo anterior = cabeza;
        Nodo actual = cabeza.siguiente;

        while (actual != centinela && actual.dato != valor) {
            anterior = actual;
            actual = actual.siguiente;
        }

        if (actual != centinela) {
            anterior.siguiente = actual.siguiente;
            System.out.println("Elemento eliminado: " + valor);
        } else {
            System.out.println("Elemento no encontrado: " + valor);
        }
    }

    @Override
    public void imprimir() {
        Nodo actual = cabeza;
        if (actual == centinela) {
            System.out.println("La lista está vacía.");
            return;
        }

        System.out.print("Lista de tareas: ");
        while (actual != centinela) {
            System.out.print(actual.dato + " -> ");
            actual = actual.siguiente;
        }
        System.out.println("null");
    }

    @Override
    public boolean buscar(int valor) {
        Nodo actual = cabeza;

        while (actual != centinela) {
            if (actual.dato == valor) {
                return true;
            }
            actual = actual.siguiente;
        }
        return false;
    }

}
