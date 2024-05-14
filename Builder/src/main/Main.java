package main;

public class Main {
    public static void main(String[] args) throws Exception {
        
        Usuario codi = Usuario.Make("Codi", "Facilito")
                                .setEmail("chrisfer@mail.com")
                                .setTelefono("xxx-xx-xx")
                                .setDireccion("Colombia")
                                .Build();

        System.out.println(codi);
    }
}
