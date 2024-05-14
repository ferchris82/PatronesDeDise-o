package main;

public class Usuario {

    private String nombre;
    private String apellido;

    private String email;
    private String telefono;
    private String direccion;

    private Usuario(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = "";
        this.telefono = "";
        this.direccion = "";
    }

    public Usuario Build(){
        return this;
    }

    public static Usuario Make(String nombre, String apellido) {
        return new Usuario(nombre, apellido);
    }

    public String getNombre() {
        return nombre;
    }

    public Usuario setNombre(String nombre) {
        this.nombre = nombre;
        return this;
    }

    public String getEmail() {
        return email;
    }

    public Usuario setEmail(String email) {
        this.email = email;
        return this;
    }

    public String getTelefono() {
        return telefono;
    }

    public Usuario setTelefono(String telefono) {
        this.telefono = telefono;
        return this;
    }

    public Usuario setDireccion(String direccion) {
        this.direccion = direccion;
        return this;
    }
    

    @Override
    public String toString() {
        return "Usuario [nombre=" + nombre + ", apellido=" + apellido + ", email=" + email + ", telefono=" + telefono
                + ", direccion=" + direccion + "]";
    }


}
