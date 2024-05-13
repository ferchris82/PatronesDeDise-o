package main;

/* 
 * SimpleFactory nos sirve para instanciar objetos complejos
 * o para controlar la creación de objetos
 */

public class Pizzeria {
    //DB, File, API
    public Pizza crearPizzaChica(){
        return new Pizza(6); //
    }
    
    public Pizza crearPizzaMediana(){
        return new Pizza(8); //
    }
    
    public Pizza crearPizzaGrande(){
        return new Pizza(12); //
    }
}
