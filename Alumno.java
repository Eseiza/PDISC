public class Alumno {

    private String nombre;

    public Alumno(String nombre) {
        this.nombre = nombre;
    }

    public float promedio(float nota1, float nota2) {
        return (nota1 + nota2) / 2;
    }

    public String getNombre() {
        return nombre;
    }

    public static void main(String[] args) {

        Alumno alumno = new Alumno("Oscar");

        float promedioNotas = alumno.promedio(8.5f, 9.0f);
        System.out.println("El promedio de " + alumno.getNombre() + " es de: " + promedioNotas);
    }
}