public class Main {
    public static void main(String[] args) {
        Estado p = new Pendiente("Pendiente");
        Estado e = new EnCurso("En curso");
        Estado c = new Completo("Completo");

        Tarea tp = new Tarea(p);
        Tarea te = new Tarea(e);
        Tarea tc = new Tarea(c);

        System.out.println("===Obtener data de pendiente===");
        tp.ObtenerDato();

        System.out.println("\n");

        System.out.println("===Obtener data de en curso===");
        te.ObtenerDato();

        System.out.println("\n");

        System.out.println("===Obtener data de completo===");
        tc.ObtenerDato();

        System.out.println("\n");

        System.out.println("===Mover pendiente a en curso===");
        tp.Mover(e);
        tp.ObtenerDato();

    }
}
