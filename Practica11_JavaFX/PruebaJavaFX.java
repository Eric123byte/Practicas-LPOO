package Practica11_GUI;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class PruebaJavaFX extends Application {
    
    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("pruebafx.fxml"));
        Scene scene = new Scene(root, 900, 700);

        scene.getStylesheets().add(getClass().getResource("estilos_2090509.css").toExternalForm());

        primaryStage.setScene(scene);
        primaryStage.setTitle("SistemaEstudiantilE0509");
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }

}
