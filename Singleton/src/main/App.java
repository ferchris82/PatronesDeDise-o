package main;

public class App {
    public static void main(String[] args) throws Exception {
        
        ConexionDB conexion = ConexionDB.obtenerConexion();
        ConexionDB conexion2 = ConexionDB.obtenerConexion();

        conexion.host = "localhost";
        System.out.println(conexion.host);

        System.out.println(conexion.host);
        System.out.println(conexion2.host);
    }
}
