public class Wheather {
    private Absw Ext;

    public Wheather() {
    }

    public Wheather(Absw Ext) {
        this.Ext = Ext;
    }

    public void obtainAll(int temp, int hum) {
        System.out.println("La temperatura es: " + temp + " La humedad es: " + hum);
    }
}
