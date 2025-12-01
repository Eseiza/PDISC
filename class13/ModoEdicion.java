import java.util.Scanner;

public class ModoEdicion extends Estado {
    Scanner scanner = new Scanner(System.in);

    @Override
    public void Escribir() {
        System.out.println("\033[32mIntroduzca el nuevo texto: \033[0m");
        String texto = scanner.nextLine();
        setNuevoTexto(texto);
        scanner.close();
    }

    @Override
    public String Guardar() {
        System.out.println("\033[32mSu texto se a modificado exitosamente \033[0m");
        return getNuevoTexto();
    }
}
