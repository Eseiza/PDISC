public class Main {
    public static void main(String[] args) {
        Plataforma mp = new MP();
        Plataforma md = new Modo();

        MetodoPago m1 = new MetodoPago(mp);
        MetodoPago m2 = new MetodoPago(md);

        System.out.println(m1.pagar(2));
        System.out.println(m2.pagar(4));
    }
}
