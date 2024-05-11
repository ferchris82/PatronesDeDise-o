package main;

//Las clases hijas defines como se debe hacer

public class Jaguar extends Animal {

    // Atributos de la clase Televisor

    private int edad;
    private float peso;

    //Constructor sin parámetros aplicando sobrecarga de constructores
    public Jaguar() {
    }

    public Jaguar(int edad) {
        this.edad = edad;
    }

    public Jaguar(float peso) {
        this.peso = peso;
    }

    //Constructor con parámetros es el primer método que se ejecuta cuando se crea una instancia
    public Jaguar(int edad, float peso) {
        this.setEdad(edad);
        this.setPeso(peso);
    }
    
    // Métodos Getter and Setter
    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    //Método toString 
    @Override
    public String toString() {
        return " Mi edad es " + edad + " Mi peso es " + peso;
    }

    //Acá estamos aplicando el polimorfismo que es modificar los métodos de la clase padre
    public void dormir(){
        System.out.println("El Jaguar duerme!");
    }

    public void comer(){
        System.out.println("El Jaguar come!");
    }
    
}
