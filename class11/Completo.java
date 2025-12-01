public class Completo extends Estado {
    public Completo() {
    }

    public Completo(String Nombre) {
        super(Nombre);
    }

    @Override
    void Nombre() {
        System.out.println("El nombre de este estado es: " + getNombre());
    }

}
