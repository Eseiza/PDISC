import javafx.scene.paint.Color;

public class Verde extends Estado {
    @Override
    Estado Cambiar() {
        return new Rojo();
    }

    @Override
    void MostrarEstado() {
        System.out.println("\033[32mEl semáforo esta en Verde\033[0m");
    }

    @Override
    Color getColor() {
        return Color.LIMEGREEN;
    }
}
