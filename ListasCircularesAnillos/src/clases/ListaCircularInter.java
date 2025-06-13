package clases;

public interface ListaCircularInter {
    
    
    void insertar(Alumno dato);
    void eliminarPorId(int id);
    Alumno buscarPorId(int id);
    void mostrar();
    boolean estaVacia();
}




