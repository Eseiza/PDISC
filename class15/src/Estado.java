import javafx.scene.paint.Color;

public abstract class Estado {
    abstract Estado Cambiar();

    abstract void MostrarEstado();

    abstract Color getColor();
}
