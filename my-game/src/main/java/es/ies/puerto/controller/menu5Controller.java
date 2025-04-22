package es.ies.puerto.controller;

import java.io.IOException;

import es.ies.puerto.PrincipalApplication;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class menu5Controller {

    @FXML
    Button returnButton;
    /**
     * Metodo que regresa a la pestaña "Confirmacion de Ususario"
     * @throws IOException
     */
    @FXML
    protected void onReturnButtonClick() throws IOException{
        Stage stage=(Stage) returnButton.getScene().getWindow();
        FXMLLoader fxmlLoader = new FXMLLoader(PrincipalApplication.class.getResource("menu3.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 360, 500);
        stage.setTitle("Inicio");
        stage.setScene(scene);
        stage.show();        
    }
}
