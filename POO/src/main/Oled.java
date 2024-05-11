package main;

//Las clases hijas defines como se debe hacer

public class Oled extends Electrodomestico implements ITelevisor{

    // Atributos de la clase Televisor

    private String marca;
    private String tamanio;
    private double precio;

    //Constructor es el primer método que se ejecuta cuando se crea una instancia
    public Oled(String marca, String tamanio, double precio) {
        this.setMarca(marca);
        this.setPrecio(precio);
        this.setTamanio(tamanio);
    }
    
    // Métodos Getter and Setter
    public String getMarca() {
        return marca;
    }


    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getTamanio() {
        return tamanio;
    }

    public void setTamanio(String tamanio) {
        this.tamanio = tamanio;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Televisor " + this.getMarca() + " tamaño " + getTamanio() + " pulgadas" + " precio de " + getPrecio();
    }

    @Override
    public void disponible() {
        System.out.println("El televisor se encuentra en tienda");
    }

    @Override
    public void agotado() {
        System.out.println("El televisor no se encuetra disponible");
    }

    @Override
    public void noEncontrado() {
        throw new UnsupportedOperationException("Televisor no encontrado");
    }

    

}
