package main;

public class Main {
    public static void main(String[] args) throws Exception {
        
        Usuario codi = Usuario.Make("Codi", "Facilito")
                                .setMedioContacto(true)
                                .setDireccion("Colombia").Build();

        System.out.println(codi);
    }
}
