public class Main {
    public static void main(String[] args) {
        Estado r = new Rojo();
        Estado a = new Amarillo();
        Estado v = new Verde();

        Semaforo s1 = new Semaforo(r);
        Semaforo s2 = new Semaforo(a);
        Semaforo s3 = new Semaforo(v);

        System.out.println("=== Semaforo 1 ===");
        s1.MostrarEstado();
        s1.CambiarEstado();
        s1.MostrarEstado();

        System.out.println("\n");

        System.out.println("=== Semaforo 2 ===");
        s2.MostrarEstado();
        s2.CambiarEstado();
        s2.MostrarEstado();

        System.out.println("\n");

        System.out.println("=== Semaforo 3 ===");
        s3.MostrarEstado();
        s3.CambiarEstado();
        s3.MostrarEstado();
    }
}
