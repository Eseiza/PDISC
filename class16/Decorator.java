public class Decorator extends Enviador {
    protected Enviador wrappee;

    public Decorator(Enviador wrappee) {
        this.wrappee = wrappee;
        this.mensaje = wrappee.mensaje;
    }

    @Override
    public void Enviar() {
        wrappee.Enviar();
    }

}
