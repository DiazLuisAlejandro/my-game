package es.ies.puerto.model;

import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public abstract class Conexion {
    private String rutaArchivoBD="src/main/resources/data.db";
    private Connection conexion;
    private String userName;
    
    public Conexion(){

    }

    /**
     * Constructor con path de coexion
     * @param unaRutaArchivoBD path a la bbdd
     * @throws SQLException error controlado
     */
    public Conexion(String unaRutaArchivoBD) throws SQLException{
        if (unaRutaArchivoBD==null||unaRutaArchivoBD.isEmpty()) {
            throw new SQLException("El fichero es nulo o vacio");
        }
        File file = new File(unaRutaArchivoBD);
        if (!file.exists()) {
            throw new SQLException("Error: " + unaRutaArchivoBD);
        }
        rutaArchivoBD = unaRutaArchivoBD;

    }

    public Connection conectar() throws SQLException{
        if (conexion!=null) {
            return conexion;
        }
        conexion=DriverManager.getConnection("jdbc:sqlite:"+rutaArchivoBD);
        return conexion;
    }

    /**
     * Funcio
     * @throws SQLException
     */
    public void cerrar() {
        try {
            if (conexion!=null||!conexion.isClosed()) {
               conexion.close();
            }
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        conexion=null;
    }


    public String getRutaArchivoBD() {
        return this.rutaArchivoBD;
    }

    public Connection getConexion() {
        try {
            if (conexion==null) {
                conexion=DriverManager.getConnection("jdbc:sqlite:"+rutaArchivoBD);
            }
        } catch (SQLException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
        }
        return this.conexion;
    }

}