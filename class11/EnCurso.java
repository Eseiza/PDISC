public class EnCurso extends Estado {
    public EnCurso() {
    }

    public EnCurso(String Nombre) {
        super(Nombre);
    }

    @Override
    void Nombre() {
        System.out.println("El nombre de este estado es: " + getNombre());
    }

}
