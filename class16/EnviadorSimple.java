public class EnviadorSimple extends Enviador {

    public EnviadorSimple(Mensaje mensaje) {
        super(mensaje);
    }

    @Override
    public void Enviar() {
        System.out.println(mensaje.getTitulo() + ": " + mensaje.getTexto());
    }

}
