package es.ies.puerto.controller;

import java.io.IOException;
import java.sql.SQLException;

import es.ies.puerto.PrincipalApplication;
import es.ies.puerto.model.UsuarioEntity;
import es.ies.puerto.model.abstractas.UsuarioServiceModel;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class menu1Controller {

    @FXML
    TextField userField;

    @FXML
    PasswordField passwordField;

    @FXML
    Button loginButton;

    @FXML
    Button registerButton;

    /**
     * Metodo que cambia a la pantalla "Confirmacion de Ususario"
     * 
     * @throws IOException
     * @throws SQLException
     */
    @FXML
    protected void onLoginButtonClick() throws IOException, SQLException {
        Stage stage = (Stage) loginButton.getScene().getWindow();
        if (userField.getText().isEmpty() || passwordField.getText().isEmpty()) {
            System.out.println("fallo en el field");
            return;
        }
        String userString = userField.getText();
        String passwordString = passwordField.getText();
        UsuarioEntity user = new UsuarioServiceModel().obtenerOneUsuario(userString);
        if (user.getContrasenia().equals(passwordString)) {
            FXMLLoader fxmlLoader = new FXMLLoader(PrincipalApplication.class.getResource("menu3.fxml"));
            Scene scene = new Scene(fxmlLoader.load(), 360, 500);
            stage.setTitle("Confirmacion de Ususario");
            stage.setScene(scene);
            stage.show();
        }
        return;
    }

    /**
     * Metodo que cambia a la pantalla "Registro"
     * 
     * @throws IOException
     */
    @FXML
    protected void onRegisterButtonClick() throws IOException {
        Stage stage = (Stage) registerButton.getScene().getWindow();
        FXMLLoader fxmlLoader = new FXMLLoader(PrincipalApplication.class.getResource("menu4.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 360, 500);
        stage.setTitle("Registro");
        stage.setScene(scene);
        stage.show();
    }

}