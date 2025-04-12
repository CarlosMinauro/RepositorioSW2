/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cohesionV2;

import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author cminauro
 */
public class Biblioteca {
       private List<Libro> libros;

    public Biblioteca() {
        this.libros = new ArrayList<>();
    }

    public void agregaLibro(Libro l) {
        libros.add(l);
    }

    public List<Libro> getLibros() {
        return libros;
    }
    

}
