public abstract class Enviador {
    protected Mensaje mensaje;

    public Enviador() {
    }

    public Enviador(Mensaje mensaje) {
        this.mensaje = mensaje;
    }

    public abstract void Enviar();

}
