public class Amarillo extends Estado {

    @Override
    Estado Cambiar() {
        return new Verde();
    }

    @Override
    void MostrarEstado() {
        System.out.println("\033[33mEl semaforo esta en Amarillo\033[0m");
    }

}
