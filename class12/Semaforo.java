public class Semaforo {
    private Estado Estado;

    public Semaforo() {
    }

    public Semaforo(Estado Estado) {
        this.Estado = Estado;
    }

    public void MostrarEstado() {
        Estado.MostrarEstado();
    }

    public void CambiarEstado() {
        this.Estado = Estado.Cambiar();
    }
}
