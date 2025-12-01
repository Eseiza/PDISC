public class Data {
    private int Temp;
    private int Hum;

    public Data(int Temp, int Hum) {
        this.Temp = Temp;
        this.Hum = Hum;
    }

    public Data() {
    }

    public int getHum() {
        return Hum;
    }

    public int getTemp() {
        return Temp;
    }
}
