package listas_centinelas;
/**
 *
 * @author Kevin Mora 
 */
public interface Lista {

    void insertar(int valor);

    void eliminar(int valor);

    void imprimir();

    boolean buscar(int valor);
}
