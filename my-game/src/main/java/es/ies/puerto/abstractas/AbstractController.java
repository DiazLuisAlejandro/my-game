package es.ies.puerto.abstractas;


import es.ies.puerto.model.abstractas.UsuarioServiceModel;
import javafx.fxml.FXML;
import javafx.scene.text.Text;

public class AbstractController {

    
    protected static final String PATH_DB="src/main/resources/data.db";

    private UsuarioServiceModel usuarioServiceModel;

    public AbstractController(){
        try {
            usuarioServiceModel=new UsuarioServiceModel(PATH_DB);
        } catch (Exception e) {
            // TODO: handle exception
        }
    }

    @FXML
    public Text textUsuario;

    @FXML
    public Text textContrasenia;


    public UsuarioServiceModel getUsuarioServiceModel() {
        return this.usuarioServiceModel;
    }
}
