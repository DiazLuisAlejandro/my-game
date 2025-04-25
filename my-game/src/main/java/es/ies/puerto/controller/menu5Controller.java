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

    static int[][] matriz = new int[3][3];

    HashSet<Integer> positionsHashSet = new HashSet<>();

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
        rivalTurn();
        Integer resultado = win();
        if (resultado != null) {
            if (resultado == 1) {
                textTurn.setText("¡Has ganado!");
            } else if (resultado == 2) {
                textTurn.setText("¡Ha ganado el rival!");
            } else if (resultado == 0) {
                textTurn.setText("Empate.");
            }
        }
    }

    @FXML
    protected void onButton2() throws IOException {
        if (matriz[0][1] != 0) {
            textErrors.setText("No puedes poner ahi, ya se ha jugado en esa casilla");
        }
        im2.setImage(imageO);
        matriz[0][1] = 1;
        rivalTurn();
        Integer resultado = win();
        if (resultado != null) {
            if (resultado == 1) {
                textTurn.setText("¡Has ganado!");
            } else if (resultado == 2) {
                textTurn.setText("¡Ha ganado el rival!");
            } else if (resultado == 0) {
                textTurn.setText("Empate.");
            }
        }
    }

    @FXML
    protected void onButton3() throws IOException {
        if (matriz[0][2] != 0) {
            textErrors.setText("No puedes poner ahi, ya se ha jugado en esa casilla");
        }
        im3.setImage(imageO);
        matriz[0][2] = 1;
        rivalTurn();
        Integer resultado = win();
        if (resultado != null) {
            if (resultado == 1) {
                textTurn.setText("¡Has ganado!");
            } else if (resultado == 2) {
                textTurn.setText("¡Ha ganado el rival!");
            } else if (resultado == 0) {
                textTurn.setText("Empate.");
            }
        }
    }

    @FXML
    protected void onButton4() throws IOException {
        if (matriz[1][0] != 0) {
            textErrors.setText("No puedes poner ahi, ya se ha jugado en esa casilla");
        }
        im4.setImage(imageO);
        matriz[1][0] = 1;
        rivalTurn();
        Integer resultado = win();
        if (resultado != null) {
            if (resultado == 1) {
                textTurn.setText("¡Has ganado!");
            } else if (resultado == 2) {
                textTurn.setText("¡Ha ganado el rival!");
            } else if (resultado == 0) {
                textTurn.setText("Empate.");
            }
        }
    }

    @FXML
    protected void onButton5() throws IOException {
        if (matriz[1][1] != 0) {
            textErrors.setText("No puedes poner ahi, ya se ha jugado en esa casilla");
        }
        im5.setImage(imageO);
        matriz[1][1] = 1;
        rivalTurn();
        Integer resultado = win();
        if (resultado != null) {
            if (resultado == 1) {
                textTurn.setText("¡Has ganado!");
            } else if (resultado == 2) {
                textTurn.setText("¡Ha ganado el rival!");
            } else if (resultado == 0) {
                textTurn.setText("Empate.");
            }
        }
    }

    @FXML
    protected void onButton6() throws IOException {
        if (matriz[1][2] != 0) {
            textErrors.setText("No puedes poner ahi, ya se ha jugado en esa casilla");
        }
        im6.setImage(imageO);
        matriz[1][2] = 1;
        rivalTurn();
        Integer resultado = win();
        if (resultado != null) {
            if (resultado == 1) {
                textTurn.setText("¡Has ganado!");
            } else if (resultado == 2) {
                textTurn.setText("¡Ha ganado el rival!");
            } else if (resultado == 0) {
                textTurn.setText("Empate.");
            }
        }
    }

    @FXML
    protected void onButton7() throws IOException {
        if (matriz[2][0] != 0) {
            textErrors.setText("No puedes poner ahi, ya se ha jugado en esa casilla");
        }
        im7.setImage(imageO);
        matriz[2][0] = 1;
        rivalTurn();
        Integer resultado = win();
        if (resultado != null) {
            if (resultado == 1) {
                textTurn.setText("¡Has ganado!");
            } else if (resultado == 2) {
                textTurn.setText("¡Ha ganado el rival!");
            } else if (resultado == 0) {
                textTurn.setText("Empate.");
            }
        }
    }

    @FXML
    protected void onButton8() throws IOException {
        if (matriz[2][1] != 0) {
            textErrors.setText("No puedes poner ahi, ya se ha jugado en esa casilla");
        }
        im8.setImage(imageO);
        matriz[2][1] = 1;
        rivalTurn();
        Integer resultado = win();
        if (resultado != null) {
            if (resultado == 1) {
                textTurn.setText("¡Has ganado!");
            } else if (resultado == 2) {
                textTurn.setText("¡Ha ganado el rival!");
            } else if (resultado == 0) {
                textTurn.setText("Empate.");
            }

        }
    }

    @FXML
    protected void onButton9() throws IOException {
        if (matriz[2][2] != 0) {
            textErrors.setText("No puedes poner ahi, ya se ha jugado en esa casilla");
        }
        im9.setImage(imageO);
        matriz[2][2] = 1;
        rivalTurn();
        Integer resultado = win();
        if (resultado != null) {
            if (resultado == 1) {
                textTurn.setText("¡Has ganado!");
            } else if (resultado == 2) {
                textTurn.setText("¡Ha ganado el rival!");
            } else if (resultado == 0) {
                textTurn.setText("Empate.");
            }
        }
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

    public void rivalTurn() {
        int mejorMove = Integer.MIN_VALUE;
        int[] move = { -1, -1 };

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (matriz[i][j] == 0) {
                    matriz[i][j] = 2;
                    int moveToDo = minimax(0, false);
                    matriz[i][j] = 0;

                    if (moveToDo > mejorMove) {
                        mejorMove = moveToDo;
                        move[0] = i;
                        move[1] = j;
                        matriz[move[0]][move[1]] = 2;
                        rellenarImangen(move[0], move[1]);
                    }
                }
            }
        }

    }

    public static int minimax(int depth, boolean isMaximizing) {
        Integer result = win();
        if (result != null) {
            return result;
        }

        if (isMaximizing) {
            int best = Integer.MIN_VALUE;
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    if (matriz[i][j] == 0) {
                        matriz[i][j] = 2;
                        best = Math.max(best, minimax(depth + 1, false));
                        matriz[i][j] = 0;
                    }
                }
            }
            return best;
        } else {
            int best = Integer.MAX_VALUE;
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    if (matriz[i][j] == 0) {
                        matriz[i][j] = 1;
                        best = Math.min(best, minimax(depth + 1, true));
                        matriz[i][j] = 0;
                    }
                }
            }
            return best;
        }
    }

    public static Integer win() {
        int[][] filas = {
                { 0, 0, 0, 1, 0, 2 },
                { 1, 0, 1, 1, 1, 2 },
                { 2, 0, 2, 1, 2, 2 },
                { 0, 0, 1, 0, 2, 0 },
                { 0, 1, 1, 1, 2, 1 },
                { 0, 2, 1, 2, 2, 2 },
                { 0, 0, 1, 1, 2, 2 },
                { 0, 2, 1, 1, 2, 0 }
        };

        for (int[] fila : filas) {
            int pos1 = matriz[fila[0]][fila[1]];
            int pos2 = matriz[fila[2]][fila[3]];
            int pos3 = matriz[fila[4]][fila[5]];
            if (pos1 == pos2 && pos1 == pos3 && pos1 != 0) {
                return pos1;
            }
        }

        boolean lleno = true;
        for (int[] fila : matriz)
            for (int celda : fila)
                if (celda == 0)
                    lleno = false;

        return lleno ? 0 : null;
    }

    private void rellenarImangen(int row, int col) {
        if (row == 0 && col == 0)
            im1.setImage(imageX);
        else if (row == 0 && col == 1)
            im2.setImage(imageX);
        else if (row == 0 && col == 2)
            im3.setImage(imageX);
        else if (row == 1 && col == 0)
            im4.setImage(imageX);
        else if (row == 1 && col == 1)
            im5.setImage(imageX);
        else if (row == 1 && col == 2)
            im6.setImage(imageX);
        else if (row == 2 && col == 0)
            im7.setImage(imageX);
        else if (row == 2 && col == 1)
            im8.setImage(imageX);
        else if (row == 2 && col == 2)
            im9.setImage(imageX);
    }

}
