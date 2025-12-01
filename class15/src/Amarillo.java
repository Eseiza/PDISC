import javafx.scene.paint.Color;

public class Amarillo extends Estado {
    @Override
    Estado Cambiar() {
        return new Verde();
    }

    @Override
    void MostrarEstado() {
        System.out.println("\033[33mEl semáforo esta en Amarillo\033[0m");
    }

    @Override
    Color getColor() {
        return Color.GOLD;
    }
}
