package es.ies.puerto.controller;

import java.io.IOException;
import java.sql.SQLException;

import es.ies.puerto.PrincipalApplication;
import es.ies.puerto.model.UsuarioEntity;
import es.ies.puerto.model.abstractas.UsuarioServiceModel;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class menu3Controller {
    
    @FXML
    Text text;

    @FXML
    Button playButton1;
    
    @FXML
    Button playButton2;

    @FXML
    Button editButton;

    @FXML
    Button returnButton;

    @FXML
    void initialize() {
        text.setText("Hola");

    }

    /**
     * Metodo que te lleva a la pestaña "Jugar"
     * 
     * @throws IOException
     * @throws SQLException
     */
    @FXML
    protected void onPlay1ButtonClick() throws IOException, SQLException {
        Stage stage = (Stage) playButton1.getScene().getWindow();
        FXMLLoader fxmlLoader = new FXMLLoader(PrincipalApplication.class.getResource("menu5.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 360, 500);
        stage.setTitle("Tres en Raya");
        stage.setScene(scene);
        stage.show();
    }
        /**
     * Metodo que te lleva a la pestaña "Jugar"
     * 
     * @throws IOException
     * @throws SQLException
     */
    @FXML
    protected void onPlay2ButtonClick() throws IOException, SQLException {
        Stage stage = (Stage) playButton2.getScene().getWindow();
        FXMLLoader fxmlLoader = new FXMLLoader(PrincipalApplication.class.getResource("menu6.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 360, 500);
        stage.setTitle("Quiz");
        stage.setScene(scene);
        stage.show();
    }
    

    /**
     * Metodo que te lleva a la pestaña "Editar"
     * 
     * @throws IOException
     */
    @FXML
    protected void onEditButtonClick() throws IOException {

        Stage stage = (Stage) editButton.getScene().getWindow();
        FXMLLoader fxmlLoader = new FXMLLoader(PrincipalApplication.class.getResource("menu4.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 360, 500);
        stage.setTitle("Editar");
        stage.setScene(scene);
        stage.show();
    }

    /**
     * Metodo que regresa a la pantalla "Inicio"
     * 
     * @throws IOException
     */
    @FXML
    protected void onReturnButtonClick() throws IOException {

        Stage stage = (Stage) returnButton.getScene().getWindow();
        FXMLLoader fxmlLoader = new FXMLLoader(PrincipalApplication.class.getResource("menu1.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 360, 500);
        stage.setTitle("Inicio");
        stage.setScene(scene);
        stage.show();
    }
}
