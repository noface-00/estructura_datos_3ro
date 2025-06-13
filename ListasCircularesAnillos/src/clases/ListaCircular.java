package clases;
import java.util.NoSuchElementException;
public class ListaCircular implements ListaCircularInter {
  

    private static class Nodo {
        Alumno dato;
        Nodo siguiente;

        public Nodo(Alumno dato) {
            this.dato = dato;
            this.siguiente = null;
        }
    }

    private Nodo cabeza;

    public ListaCircular() {
        cabeza = null;
    }

    @Override
    public void insertar(Alumno dato) {
        Nodo nuevoNodo = new Nodo(dato);
        if (cabeza == null) { // Lista vacía
            cabeza = nuevoNodo;
            nuevoNodo.siguiente = cabeza; // Apunta a sí mismo
        } else {
            Nodo actual = cabeza;
            while (actual.siguiente != cabeza) {
                actual = actual.siguiente; // Ir al último nodo
            }
            actual.siguiente = nuevoNodo; // Enlazar el nuevo nodo
            nuevoNodo.siguiente = cabeza; // Hacer circular
        }
    }

    @Override
    public void eliminarPorId(int id) {
        if (cabeza == null) {
            throw new NoSuchElementException("La lista está vacía.");
        }

        Nodo actual = cabeza;
        Nodo anterior = null;
        boolean encontrado = false;

        do {
            if (actual.dato.getId() == id) {
                encontrado = true;
                break;
            }
            anterior = actual;
            actual = actual.siguiente;
        } while (actual != cabeza);

        if (!encontrado) {
            throw new NoSuchElementException("Alumno con ID " + id + " no encontrado.");
        }

        // Si solo hay un nodo en la lista
        if (actual == cabeza && actual.siguiente == cabeza) {
            cabeza = null; // Lista queda vacía
            return;
        }

        if (actual == cabeza) {
            // Eliminar cabeza
            Nodo ultimo = cabeza;
            while (ultimo.siguiente != cabeza) {
                ultimo = ultimo.siguiente; // Encontrar el último nodo
            }
            cabeza = cabeza.siguiente; // Mover cabeza
            ultimo.siguiente = cabeza; // Hacer circular
        } else {
            // Eliminar nodo intermedio o final
            anterior.siguiente = actual.siguiente; // Saltar el nodo a eliminar
        }
    }

    @Override
    public Alumno buscarPorId(int id) {
        if (cabeza == null) {
            return null;
        }
        Nodo actual = cabeza;
        do {
            if (actual.dato.getId() == id) {
                return actual.dato;
            }
            actual = actual.siguiente;
        } while (actual != cabeza);
        return null;
    }

    @Override
    public void mostrar() {
        if (cabeza == null) {
            System.out.println("La lista de alumnos está vacía.");
            return;
        }
        Nodo actual = cabeza;
        System.out.println("Listado de alumnos (lista circular):");
        do {
            System.out.println(" - " + actual.dato.toString());
            actual = actual.siguiente;
        } while (actual != cabeza);
    }

    @Override
    public boolean estaVacia() {
        return cabeza == null;
    }
}


