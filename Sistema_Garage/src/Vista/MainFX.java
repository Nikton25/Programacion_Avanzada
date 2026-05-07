package Vista;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class MainFX extends Application {

    @Override
    public void start(Stage primaryStage) {
        // Creamos una etiqueta de texto
        Label mensaje = new Label("¡Bienvenido al sistema del Garage!");

        // El Layout: un contenedor que centra los elementos
        StackPane raiz = new StackPane();
        raiz.getChildren().add(mensaje);

        // La Escena: contiene el layout y define el tamaño de la ventana
        Scene escena = new Scene(raiz, 400, 300);

        // Configuramos el Escenario (la ventana)
        primaryStage.setTitle("Garage Pro - JavaFX");
        primaryStage.setScene(escena);
        primaryStage.show();
    }

    public static void main(String[] args) {
        // Lanza la aplicación de JavaFX
        launch(args);
    }
}