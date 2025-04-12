package pe.ulima.sin.ispv1;



public class Perro implements Comedor, Nadador {
    @Override
    public void comer() {
        System.out.println("El perro está comiendo.");
    }

    @Override
    public void nadar() {
        System.out.println("El perro está nadando.");
    }
}