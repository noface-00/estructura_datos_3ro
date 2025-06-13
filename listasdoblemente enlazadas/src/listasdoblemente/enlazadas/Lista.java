/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package listasdoblemente.enlazadas;

/**
 *
 * @author hp
 */
import java.io.IOException;

public interface Lista {
    void cargarLista() throws IOException;
    void eliminar(int valor);
    void mostrar();
}

