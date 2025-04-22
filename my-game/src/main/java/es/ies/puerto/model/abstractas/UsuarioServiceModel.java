package es.ies.puerto.model.abstractas;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import es.ies.puerto.model.Conexion;
import es.ies.puerto.model.UsuarioEntity;

public class UsuarioServiceModel extends Conexion {

    public UsuarioServiceModel() {
    }

    public UsuarioServiceModel(String unaRutaArchivoBD) throws SQLException {
        super(unaRutaArchivoBD);
        // TODO Auto-generated constructor stub
    }

    public ArrayList<UsuarioEntity> obtenerUsuarios() throws SQLException {
        String sql = "Select * from user;";
        return obtenerUsuario(sql);
    }

    public ArrayList<UsuarioEntity> obtenerUsuario(String sql) throws SQLException {
        ArrayList<UsuarioEntity> usuarios = new ArrayList<UsuarioEntity>();
        try {
            PreparedStatement sentencia = getConexion().prepareStatement(sql);
            ResultSet resultado = sentencia.executeQuery();
            usuarios = new ArrayList<UsuarioEntity>();
            while (resultado.next()) {
                String nombreStr = resultado.getString("name");
                String contraseniaStr = resultado.getString("password");
                UsuarioEntity unUsuario = new UsuarioEntity(nombreStr, contraseniaStr);
                usuarios.add(unUsuario);
            }
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } finally {
            cerrar();
        }

        return usuarios;
    }
    /**
     * Metodo que inserta en la base de datos
     * @param nombre del user
     * @param contrasenia clave de acceso del user
     * @return
     */
    public boolean insertarUsuario(String nombre, String contrasenia) {
        try {
            String sql = "INSERT INTO user (name,password) VALUES (?, ?);";
            PreparedStatement sentencia = getConexion().prepareStatement(sql);
            sentencia.setString(1, nombre);
            sentencia.setString(2, contrasenia);
            sentencia.execute();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        } finally {
            cerrar();
        }
    }

    public UsuarioEntity obtenerOneUsuario(String usuarioString) throws SQLException {
        String sql = "Select * from user where name='" + usuarioString + "';";
        return obtenerUsuario(sql).get(0);
    }
}
