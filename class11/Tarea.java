public class Tarea {
    private Estado Estado;

    public Tarea() {
    }

    public Tarea(Estado Estado) {
        this.Estado = Estado;
    }

    public void ObtenerDato() {
        this.Estado.Nombre();
    }

    public void Mover(Estado Estado) {
        this.Estado = Estado;
    }
}
