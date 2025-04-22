package es.ies.puerto.controller;

import java.io.IOException;

import es.ies.puerto.PrincipalApplication;
import es.ies.puerto.model.UsuarioEntity;
import es.ies.puerto.model.abstractas.UsuarioServiceModel;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class menu4Controller {
    
    UsuarioEntity usuarioEntity;

    @FXML
    TextField userField;

    @FXML
    PasswordField passwordField1;

    @FXML
    PasswordField passwordField2;

    @FXML
    Button saveButton;


    @FXML
    Button returnButton;

    protected void initialize(UsuarioEntity user){
        usuarioEntity=user;
    }

    /**
     * 
     * @throws IOException
     */
    @FXML
    protected void onSaveButtonClick() throws IOException{
        Stage stage=(Stage) saveButton.getScene().getWindow();
        
        if (userField.getText().isEmpty()|| passwordField1.getText().isEmpty()||passwordField2.getText().isEmpty()) {
            System.out.println("fallo en el field");
            return;
        }
        String userString=userField.getText();
        String passwordString1=passwordField1.getText();
        String passwordString2=passwordField2.getText();
        if (!passwordString1.equals(passwordString2)) {
            System.out.println(passwordString1);
            System.out.println(passwordString2);
            return;
        }
       
        Boolean insertar=new UsuarioServiceModel().insertarUsuario(userString, passwordString1);
        if (!insertar) {
            System.out.println(insertar);
            return;
        }
        FXMLLoader fxmlLoader = new FXMLLoader(PrincipalApplication.class.getResource("menu3.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 360, 500);
        stage.setTitle("Confirmacion de Ususario");
        stage.setScene(scene);
        stage.show(); 

    }

    /**
     * Metodo que regresa a la pantalla "Inicio" o "Confirmacion de Usuario"
     * @throws IOException
     */
    @FXML
    protected void onReturnButtonClick() throws IOException{

        
        Stage stage=(Stage) returnButton.getScene().getWindow();

        if (stage.getTitle().equals("Registro")) {
            FXMLLoader fxmlLoader = new FXMLLoader(PrincipalApplication.class.getResource("menu1.fxml"));
            Scene scene = new Scene(fxmlLoader.load(), 360, 500);
            stage.setTitle("Inicio");
            stage.setScene(scene);
            stage.show();        
        }else{
         FXMLLoader fxmlLoader = new FXMLLoader(PrincipalApplication.class.getResource("menu3.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 360, 500);
        stage.setTitle("Confirmacion de Ususario");
        stage.setScene(scene);
        stage.show(); 
        }       
       
    }
}
