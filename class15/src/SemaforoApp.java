import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;
import javafx.util.Duration;

public class SemaforoApp extends Application {

    private Semaforo semaforo;
    private Circle redCircle;
    private Circle yellowCircle;
    private Circle greenCircle;
    private Timeline autoTimeline;

    @Override
    public void start(Stage stage) {
        // inicializo semaforo en Rojo
        semaforo = new Semaforo(new Rojo());

        // círculos (radio 40)
        redCircle = new Circle(40, Color.web("#4d0000")); // apagado: versión oscura
        yellowCircle = new Circle(40, Color.web("#4a4200"));
        greenCircle = new Circle(40, Color.web("#003300"));

        // Botones
        Button mostrarBtn = new Button("Mostrar (consola)");
        Button cambiarBtn = new Button("Cambiar estado");
        Button autoBtn = new Button("Auto ON/OFF");

        mostrarBtn.setOnAction(e -> {
            semaforo.MostrarEstado(); // sigue imprimiendo en consola tal como pedías
            updateUI();
        });

        cambiarBtn.setOnAction(e -> {
            semaforo.CambiarEstado();
            updateUI();
        });

        // Timeline para cambiar automáticamente cada 2 segundos
        autoTimeline = new Timeline(new KeyFrame(Duration.seconds(2), ev -> {
            semaforo.CambiarEstado();
            updateUI();
        }));
        autoTimeline.setCycleCount(Timeline.INDEFINITE);

        autoBtn.setOnAction(e -> {
            if (autoTimeline.getStatus() == Timeline.Status.RUNNING) {
                autoTimeline.stop();
                autoBtn.setText("Auto ON");
            } else {
                autoTimeline.play();
                autoBtn.setText("Auto OFF");
            }
        });

        // Layout
        VBox lights = new VBox(15, redCircle, yellowCircle, greenCircle);
        lights.setAlignment(Pos.CENTER);

        HBox controls = new HBox(10, mostrarBtn, cambiarBtn, autoBtn);
        controls.setAlignment(Pos.CENTER);

        VBox root = new VBox(20, lights, controls);
        root.setAlignment(Pos.CENTER);
        root.setStyle("-fx-padding: 20; -fx-background-color: #111;");

        updateUI(); // pinta inicial

        Scene scene = new Scene(root, 300, 420);
        stage.setScene(scene);
        stage.setTitle("Semáforo - JavaFX (Estado)");
        stage.show();
    }

    // Actualiza la UI según el estado actual del semaforo
    private void updateUI() {
        Estado estado = semaforo.getEstado();
        // reinicio a "apagado" oscuro
        redCircle.setFill(Color.web("#4d0000"));
        yellowCircle.setFill(Color.web("#4a4200"));
        greenCircle.setFill(Color.web("#003300"));

        // activo el color correspondiente
        Color active = estado.getColor();
        if (estado instanceof Rojo) {
            redCircle.setFill(active);
        } else if (estado instanceof Amarillo) {
            yellowCircle.setFill(active);
        } else if (estado instanceof Verde) {
            greenCircle.setFill(active);
        }
    }

    public static void main(String[] args) {
        launch(args);
    }
}
