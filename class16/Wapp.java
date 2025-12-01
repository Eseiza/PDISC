public class Wapp extends Decorator {

    public Wapp(Enviador wrappee) {
        super(wrappee);
    }

    @Override
    public void Enviar() {
        super.Enviar();
        System.out.println("Enviado desde whatsapp");
    }

}
