package AimsProjects.Lab02.test;
import AimsProjects.Lab02.disc.DigitalVideoDisc;
import AimsProjects.Lab02.cart.Cart;
public class CartTest {

    public static void main(String[] args) {
        // TODO Auto-generated method stub


        // Create a new cart
        Cart cart = new Cart();

        // Create new dvd objects and add them to the cart

        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King",
                "Animation", "Roger Allers", 87, 19.95f);

        cart.addDigitalVideoDisc(dvd1);

        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars",
                "Science Fiction", "George Lucas", 87, 24.95f);
        cart.addDigitalVideoDisc(dvd2);

        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Animation",
                "Aladin", 18.99f);

        cart.addDigitalVideoDisc(dvd3);
        System.out.println("Total Cost is: ");
        System.out.println(Cart.totalCost());

    }
}