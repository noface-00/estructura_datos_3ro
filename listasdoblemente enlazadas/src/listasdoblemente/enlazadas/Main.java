/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package listasdoblemente.enlazadas;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author hp
 */
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        TadLista lista = new TadLista();

        lista.cargarLista();
        lista.mostrar();

        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Elemento a eliminar: ");
        int valor = Integer.parseInt(entrada.readLine());

        lista.eliminar(valor);
        lista.mostrar();
    }
}
