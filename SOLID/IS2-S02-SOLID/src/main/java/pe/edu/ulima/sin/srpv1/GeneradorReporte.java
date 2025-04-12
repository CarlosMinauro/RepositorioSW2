/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.edu.ulima.sin.srpv1;

/**
 *
 * @author l34210
 */


public class GeneradorReporte {

    public void generar(Reporte reporte) {
        System.out.println("Generando Reporte: " + reporte.getTitulo());
        System.out.println(reporte.getContenido());
    }
}
