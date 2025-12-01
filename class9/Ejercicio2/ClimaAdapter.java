public class ClimaAdapter extends Absw {
    private int Ctem;
    private int Chum;

    public ClimaAdapter() {
    }

    public ClimaAdapter(int Ctem, int Chum) {
        this.Ctem = Ctem;
        this.Chum = Chum;
    }

    @Override
    int Temp() {
        return this.Ctem;
    }

    @Override
    int Hum() {
        return this.Chum;
    }
}
