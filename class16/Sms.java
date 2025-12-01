public class Sms extends Decorator {
    public Sms(Enviador wrappee) {
        super(wrappee);
    }

    @Override
    public void Enviar() {
        super.Enviar();
        System.out.println("Enviado por SMS");
    }

}
