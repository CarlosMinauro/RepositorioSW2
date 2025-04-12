package pe.edu.ulima.sin.lspv1;

public class Test {
    public static void main(String[] args) {
        ManejarVuelo manejarVuelo = new ManejarVuelo();

        AvesQueVuelan pato = new Pato();
        manejarVuelo.hacerVolar(pato);

        Ave pinguino = new Pinguino();
        pinguino.comer();
        // No se intenta hacer volar al pingüino
    }
}
