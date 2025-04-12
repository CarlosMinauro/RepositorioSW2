/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cohesionV2;

import java.util.List;

/**
 *
 * @author cminauro
 */
public class Impresion {
    
    public void muestraLibros(List<Libro> libros) {
        for (Libro l : libros) {
            System.out.println(l);
        }
    }

    public void imprimeResumen(List<Libro> libros) {
        System.out.println("Cantidad de Libros: " + libros.size());
    }
}
