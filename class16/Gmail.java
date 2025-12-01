public class Gmail extends Decorator {

    public Gmail(Enviador wrappee) {
        super(wrappee);
    }

    @Override
    public void Enviar() {
        super.Enviar();
        System.out.println("Enviado desde Gmail");
    }

}
