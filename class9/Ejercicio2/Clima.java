public class Clima {
    private int Temperatura;
    private int Humedad;

    public Clima() {
    }

    public Clima(int Temperatura, int Humedad) {
        this.Temperatura = Temperatura;
        this.Humedad = Humedad;
    }

    public int temperatura() {
        return this.Temperatura;
    }

    public int humedad() {
        return this.Humedad;
    }
}
