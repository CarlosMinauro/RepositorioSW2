/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.edu.ulima.sin.srpv1;

/**
 *
 * @author l34210
 */

public class Test {

    public static void main(String[] args) {
        Reporte reporte = new Reporte("Informe de ventas", "Contenido del informe...");

        GeneradorReporte generador = new GeneradorReporte();
        generador.generar(reporte);

        ArchivoReporte archivo = new ArchivoReporte();
        archivo.guardar(reporte, "reporte.txt");

        EmailReporte email = new EmailReporte();
        email.enviar(reporte, "ejemplo@correo.com");
    }
}
