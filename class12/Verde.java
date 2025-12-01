public class Verde extends Estado {

    @Override
    Estado Cambiar() {
        return new Rojo();
    }

    @Override
    void MostrarEstado() {
        System.out.println("\033[32mEl semaforo esta en Verde\033[0m");
    }

}
