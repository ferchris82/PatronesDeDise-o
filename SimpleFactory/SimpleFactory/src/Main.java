import main.Pizza;
import main.Pizzeria;

public class Main {
    public static void main(String[] args) throws Exception {

        Pizzeria pizzeriaCF = new Pizzeria();

        Pizza pizzaPeperoni = pizzeriaCF.crearPizzaChica();

        System.out.println(pizzaPeperoni);
    }
}
