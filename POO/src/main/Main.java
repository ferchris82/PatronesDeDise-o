package main;

public class Main{
    public static void main(String[] args) {
        
        //Instancia es a crear un objeto
        Oled oled = new Oled("LG", "55", 1000);

        System.out.println(oled);
        
        oled.disponible();
        oled.TiendaDisponible();
        

        
    }
}