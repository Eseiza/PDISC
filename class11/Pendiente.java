public class Pendiente extends Estado {
    public Pendiente(String Nombre) {
        super(Nombre);
    }

    public Pendiente() {
    }

    @Override
    void Nombre() {
        System.out.println("El nombre de este estado es: " + getNombre());
    }
}
