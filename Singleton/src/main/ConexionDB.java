package main;

public class ConexionDB {
    
    private static ConexionDB conexion;

    public String host;
     
    private ConexionDB(){

    }

    public synchronized static ConexionDB obtenerConexion(){
        if (conexion == null) { //No se ha instanciado
            conexion = new ConexionDB();
        }
        return conexion;
    }
}
