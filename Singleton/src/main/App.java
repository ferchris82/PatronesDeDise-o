package main;

public class App {
    public static void main(String[] args) throws Exception {

        Thread t1 = new Thread(new Runnable() {
            
            public void run(){
                ConexionDB conexion = ConexionDB.obtenerConexion();
                System.out.println(conexion.hashCode());
            }
        });

        Thread t2 = new Thread(new Runnable() {
            
            public void run(){
                ConexionDB conexion = ConexionDB.obtenerConexion();
                System.out.println(conexion.hashCode());
            }
        });

        t1.start();
        t2.start();

    }
}
