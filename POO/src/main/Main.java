package main;

public class Main{
    public static void main(String[] args) {
        
        //Instancia es a crear un objeto
        Jaguar yagua = new Jaguar(10, 120f);
        System.out.println(yagua);

        Jaguar yagua2 = new Jaguar();
        System.out.println(yagua2);

        
        Jaguar yagua3 = new Jaguar(10);
        System.out.println(yagua3);

        
        Jaguar yagua4 = new Jaguar(100f);
        System.out.println(yagua4);
    }
}