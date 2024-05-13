package main;

public class Pizza {
    
    private int cantidadRebanandas;
    private String especialidad;

    public Pizza(int cantidadRebanandas, String especialidad){
        this.cantidadRebanandas = cantidadRebanandas;
        this.especialidad = especialidad;
    }

    public String toString(){
        return "Cantidad rebanadas : " + this.cantidadRebanandas + " Especialidad : " + this.especialidad;
    }
}
