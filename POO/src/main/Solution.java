package main;

import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNextLine()) {
            String cadenaCaracteres = scanner.nextLine();

            if (cadenaCaracteres.isEmpty()) {
                continue;
            }

            StringBuilder mensajeCorrecto = new StringBuilder();

            
            for (int i = 0; i < cadenaCaracteres.length(); i++) {
                char caracter = cadenaCaracteres.charAt(i);

                
                if (mensajeCorrecto.indexOf(String.valueOf(caracter)) == -1) {
                    
                    mensajeCorrecto.append(caracter);
                }
            }

            
            System.out.println(mensajeCorrecto.toString());
        }

        scanner.close();
    }
}
