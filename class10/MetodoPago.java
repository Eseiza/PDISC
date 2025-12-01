public class MetodoPago {
    private Plataforma plataforma;

    public MetodoPago() {
    }

    public MetodoPago(Plataforma plataforma) {
        this.plataforma = plataforma;
    }

    public int pagar(int costo) {
        this.plataforma.Cobrar(costo);
        return costo;
    }
}
