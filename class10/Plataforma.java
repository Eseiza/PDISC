public abstract class Plataforma {
    private int Costo;

    public Plataforma() {
    }

    public Plataforma(int Costo) {
        this.Costo = Costo;
    }

    abstract int Cobrar(int Costo);
}
