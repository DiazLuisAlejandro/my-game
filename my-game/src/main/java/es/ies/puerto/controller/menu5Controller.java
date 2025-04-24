package es.ies.puerto.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;

import es.ies.puerto.PrincipalApplication;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class menu5Controller {

    int[][] matriz = new int[3][3];

    HashSet<Integer> positionsHashSet=new HashSet<>();    

    Image imageO = new Image(getClass().getResource("/es/ies/puerto/image/O.png").toString());

    Image imageX = new Image(getClass().getResource("/es/ies/puerto/image/X.png").toString());
    Image imagePlaceHolder = new Image(getClass().getResource("/es/ies/puerto/image/placeholder.png").toString());

    @FXML
    Button button1;

    @FXML
    ImageView im1;

    @FXML
    Button button2;

    @FXML
    ImageView im2;

    @FXML
    Button button3;

    @FXML
    ImageView im3;

    @FXML
    Button button4;

    @FXML
    ImageView im4;

    @FXML
    Button button5;

    @FXML
    ImageView im5;

    @FXML
    Button button6;

    @FXML
    ImageView im6;

    @FXML
    Button button7;

    @FXML
    ImageView im7;

    @FXML
    Button button8;

    @FXML
    ImageView im8;

    @FXML
    Button button9;

    @FXML
    ImageView im9;

    @FXML
    Text textTurn;

    @FXML
    Text textErrors;

    @FXML
    Button restartButton;

    @FXML
    Button returnButton;

    /**
     * Metodo que regresa a la pestaña "Confirmacion de Ususario"
     * 
     * @throws IOException
     */
    @FXML
    protected void onReturnButtonClick() throws IOException {
        Stage stage = (Stage) returnButton.getScene().getWindow();
        FXMLLoader fxmlLoader = new FXMLLoader(PrincipalApplication.class.getResource("menu3.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 360, 500);
        stage.setTitle("Inicio");
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    protected void onButton1() throws IOException {
        if (matriz[0][0] != 0) {
            textErrors.setText("No puedes poner ahi, ya se ha jugado en esa casilla");
        }
        im1.setImage(imageO);
        matriz[0][0] = 1;
        rivalTurn(1);
        win(1);
    }

    @FXML
    protected void onButton2() throws IOException {
        if (matriz[0][1] != 0) {
            textErrors.setText("No puedes poner ahi, ya se ha jugado en esa casilla");
        }
        im2.setImage(imageO);
        matriz[0][1] = 1;
        rivalTurn(2);
        win(2);
    }

    @FXML
    protected void onButton3() throws IOException {
        if (matriz[0][2] != 0) {
            textErrors.setText("No puedes poner ahi, ya se ha jugado en esa casilla");
        }
        im3.setImage(imageO);
        matriz[0][2] = 1;
        rivalTurn(3);
        win(3);
    }

    @FXML
    protected void onButton4() throws IOException {
        if (matriz[1][0] != 0) {
            textErrors.setText("No puedes poner ahi, ya se ha jugado en esa casilla");
        }
        im4.setImage(imageO);
        matriz[1][0] = 1;
        rivalTurn(4);
        win(4);
    }

    @FXML
    protected void onButton5() throws IOException {
        if (matriz[1][1] != 0) {
            textErrors.setText("No puedes poner ahi, ya se ha jugado en esa casilla");
        }
        im5.setImage(imageO);
        matriz[1][1] = 1;
        rivalTurn(5);
        win(5);
    }

    @FXML
    protected void onButton6() throws IOException {
        if (matriz[1][2] != 0) {
            textErrors.setText("No puedes poner ahi, ya se ha jugado en esa casilla");
        }
        im6.setImage(imageO);
        matriz[1][2] = 1;
        rivalTurn(6);
        win(6);
    }

    @FXML
    protected void onButton7() throws IOException {
        if (matriz[2][0] != 0) {
            textErrors.setText("No puedes poner ahi, ya se ha jugado en esa casilla");
        }
        im7.setImage(imageO);
        matriz[2][0] = 1;
        rivalTurn(7);
        win(7);
    }

    @FXML
    protected void onButton8() throws IOException {
        if (matriz[2][1] != 0) {
            textErrors.setText("No puedes poner ahi, ya se ha jugado en esa casilla");
        }
        im8.setImage(imageO);
        matriz[2][1] = 1;
        rivalTurn(8);
        win(8);
    }

    @FXML
    protected void onButton9() throws IOException {
        if (matriz[2][2] != 0) {
            textErrors.setText("No puedes poner ahi, ya se ha jugado en esa casilla");
        }
        im9.setImage(imageO);
        matriz[2][2] = 1;
        rivalTurn(9);
        win(9);
    }

    @FXML
    protected void onRestartButtonClick() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matriz[i][j] = 0;
            }
        }
        im1.setImage(imagePlaceHolder);
        im2.setImage(imagePlaceHolder);
        im3.setImage(imagePlaceHolder);
        im4.setImage(imagePlaceHolder);
        im5.setImage(imagePlaceHolder);
        im6.setImage(imagePlaceHolder);
        im7.setImage(imagePlaceHolder);
        im8.setImage(imagePlaceHolder);
        im9.setImage(imagePlaceHolder);
        textTurn.setText("Tu turno");
    }

    private void rivalTurn(int value) {
        
    }


    private void win(int value){
        positionsHashSet.add(value);
        if (positionsHashSet.size()<3) {
            
        }else{
            for (int i : positionsHashSet) {
                
            }
            if (true) {
                textTurn.setText("Has ganado");
                
            }if (positionsHashSet.contains(0)) {
                textTurn.setText("Has perdido");

            }else{
                textTurn.setText("Has empatado");
            }
        }
    }
}
