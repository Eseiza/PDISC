public class Main {
    public static void main(String[] args) {
        Clima C = new Clima(2, 2);
        System.err.println(C.temperatura() + ", " + C.humedad());

        Absw ca = new ClimaAdapter(C.temperatura(), C.humedad());

        System.err.println(ca.Temp() + "," + ca.Hum());

        Data D = new Data(ca.Temp(), ca.Hum());

        Wheather w = new Wheather(ca);

        w.obtainAll(D.getTemp(), D.getHum());
    }
}
