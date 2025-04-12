/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.edu.ulima.sin.ocpv1;

/**
 *
 * @author l34210
 */
public class Test {

    public static void main(String[] args) {
        Figura f1 = new Circulo(2);
        Figura f2 = new Rectangulo(2, 3);

        System.out.println(f1.calcularArea());
        System.out.println(f2.calcularArea());
    }
}