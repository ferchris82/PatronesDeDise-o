package main;

public class Usuario {

    private String nombre;
    private String apellido;

    private boolean medioContacto; // Opcional

    private String email;
    private String telefono;
    private String direccion;

    private Usuario(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;

        this.medioContacto = false;

        this.email = "";
        this.telefono = "";
        this.direccion = "";
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

    public BuilderUsuario setMedioContacto(boolean medioContacto){

        if(!medioContacto){
            throw new IllegalArgumentException("No es posible asignar un valor falso a medio de contacto");
        }
        this.medioContacto = medioContacto;
        return new BuilderUsuario(this);
    }

    public String getEmail() {
        return email;
    }

    public String getTelefono() {
        return telefono;
    }

    @Override
    public String toString() {
        return "Usuario [nombre=" + nombre + ", apellido=" + apellido + ", email=" + email + ", telefono=" + telefono
                + ", direccion=" + direccion + "]";
    }

    public static class BuilderUsuario{
        private Usuario usuario;

        public BuilderUsuario(Usuario usuario){
            this.usuario = usuario;
        }

        public BuilderUsuario setEmail(String email) {
            usuario.email = email;
            return this;
        }
        
        public BuilderUsuario setTelefono(String telefono) {
            usuario.telefono = telefono;
            return this;
        }
        public BuilderUsuario setDireccion(String direccion) {
            usuario.direccion = direccion;
            return this;
        }

        public Usuario Build(){
            return usuario ;
        }
    }

}
