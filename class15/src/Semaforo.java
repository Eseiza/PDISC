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

    public Estado getEstado() {
        return Estado;
    }

    public void setEstado(Estado estado) {
        this.Estado = estado;
    }

}
