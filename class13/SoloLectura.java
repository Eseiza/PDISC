public class SoloLectura extends Estado {
    @Override
    public void Escribir() {
        System.err.println("\033[33mEl modo solo lectura no permite modificar el texto\033[0m");
    }

    @Override
    public String Guardar() {
        System.err.println("\033[33mEl modo solo lectura no permite guardar\033[0m");
        return null;
    }
}
