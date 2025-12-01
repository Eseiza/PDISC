public class Main {
    public static void main(String[] args) {
        // Estructura del sistema:
        // Dos objetos documento, uno editable y el otro solo de lectura
        // Probar ambos métodos Escribir y Guardar

        // === Creación de los objetos de Estado ===
        Estado SL = new SoloLectura();
        Estado MD = new ModoEdicion();

        // === Creación de los objetos Documento ===
        Documento D1 = new Documento("Esto solo se puede leer", SL);
        Documento D2 = new Documento("Esto se puede modificar: A", MD);

        // === Prueba de los métodos ===
        // == D1 ==
        System.err.println("\033[1;35mTexto original: \033[0m");
        System.out.println(D1.getTexto());
        System.err.println("\n--------------------\n");
        D1.usarEstado("Escribir");
        System.err.println("\n--------------------\n");
        D1.usarEstado("Guardar");
        System.err.println("\n--------------------\n");
        System.err.println("\033[1;35mTexto después de haber pasado por los métodos: \033[0m");
        System.out.println(D1.getTexto());

        // == Salto de linea entre pruebas
        System.err.println("\n====================\n");

        // == D2 ==
        System.err.println("\033[1;35mTexto original: \033[0m");
        System.out.println(D2.getTexto());
        System.err.println("\n--------------------\n");
        D2.usarEstado("Escribir");
        System.err.println("\n--------------------\n");
        D2.usarEstado("Guardar");
        System.err.println("\n--------------------\n");
        System.err.println("\033[1;35mTexto después de haber pasado por los métodos: \033[0m");
        System.out.println(D2.getTexto());
    }
}
