public class Rojo extends Estado {
    @Override
    Estado Cambiar() {
        return new Amarillo();
    }

    @Override
    void MostrarEstado() {
        System.out.println("\033[91mEl semaforo esta en Rojo\033[0m");
    }

}
