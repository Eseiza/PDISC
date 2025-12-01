public abstract class Estado {
    private String Nombre;

    public Estado() {
    }

    public Estado(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getNombre() {
        return Nombre;
    }

    abstract void Nombre();
}
