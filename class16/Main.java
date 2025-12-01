public class Main {
    public static void main(String[] args) {
        Mensaje m = new Mensaje("Hola", "Anda?");

        Enviador e = new EnviadorSimple(m);

        Enviador w = new Wapp(e);
        Enviador g = new Gmail(e);
        Enviador s = new Sms(e);

        System.out.println("=========\nEnviado por WhatsApp:");
        w.Enviar();

        System.out.println("\n=========\nEnviado por Gmail:");
        g.Enviar();

        System.out.println("\n=========\nEnviado por Sms:");
        s.Enviar();
    }
}
