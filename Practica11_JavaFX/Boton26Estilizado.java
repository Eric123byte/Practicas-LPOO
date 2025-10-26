
package Practica11_GUI;

import javafx.scene.control.Button;

public class Boton26Estilizado extends Button{
    
    public Boton26Estilizado(String texto){
        this.setText(texto);
        this.getStyleClass().add("button");
        this.setOnMouseEntered(evento -> {
            this.getStyleClass().add("buttonEntered");
        });
        this.setOnMousePressed(event -> {
            this.getStyleClass().add("buttonClicked");
        });
    }
    
}
