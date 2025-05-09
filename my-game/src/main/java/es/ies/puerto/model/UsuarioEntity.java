package es.ies.puerto.model;

import java.util.Objects;

public class UsuarioEntity {
    String email;
    String nombre;
    String contrasenia;

    public UsuarioEntity() {
    }

    public UsuarioEntity(String nombre, String contrasenia) {
        this.nombre = nombre;
        this.contrasenia = contrasenia;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getContrasenia() {
        return this.contrasenia;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }

    public UsuarioEntity nombre(String nombre) {
        setNombre(nombre);
        return this;
    }

    public UsuarioEntity contrasenia(String contrasenia) {
        setContrasenia(contrasenia);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof UsuarioEntity)) {
            return false;
        }
        UsuarioEntity usuarioModel = (UsuarioEntity) o;
        return Objects.equals(email, usuarioModel.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(email);
    }

    @Override
    public String toString() {
        return "nombre='" + getNombre() + "'" +
                ", contrasenia='" + getContrasenia() + "'";
    }

}
