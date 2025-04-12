package pe.ulima.sin.ispv1;


public class Test {
    public static void main(String[] args) {
        Comedor conejo = new Conejo();
        Comedor perro = new Perro();
        Nadador nadador = new Perro(); // Solo los que nadan

        conejo.comer();
        perro.comer();
        nadador.nadar();
    }
}
