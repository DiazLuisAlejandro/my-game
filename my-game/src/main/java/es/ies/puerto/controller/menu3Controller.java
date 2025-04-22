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
    TextField userField;

    @FXML
    PasswordField passwordField;
    
    @FXML
    Button playButton;

    @FXML
    Button editButton;

    @FXML
    Button returnButton;

    @FXML
    void initialize() {

    }

    /**
     * Metodo que te lleva a la pestaña "Jugar"
     * 
     * @throws IOException
     * @throws SQLException
     */
    @FXML
    protected void onPlayButtonClick() throws IOException, SQLException {
        String usuarioString = userField.getText();
        String contraseniaString = passwordField.getText();
        UsuarioEntity usuarioLogin = new UsuarioServiceModel().obtenerOneUsuario(usuarioString);
        if (usuarioLogin == null) {
            return;
        }
        if (usuarioLogin.getContrasenia().equals(contraseniaString)) {
        Stage stage = (Stage) playButton.getScene().getWindow();
        FXMLLoader fxmlLoader = new FXMLLoader(PrincipalApplication.class.getResource("menu5.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 360, 500);
        stage.setTitle("Juego");
        stage.setScene(scene);
        stage.show();
        }
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
