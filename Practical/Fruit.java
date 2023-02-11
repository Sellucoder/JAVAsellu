
interface Fruit {
    String name = "Apple";

    void sell();

    default void buy() {
        System.out.println("Fruits bought by buyer...");
    }

    static void eat() {
        System.out.println("Fruits are healthier...");
    }
}

class Seller implements Fruit {
    public void sell() {
        System.out.println("Selling apples...");
    }
}

public class InterfaceExample {
    public static void main(String[] args) {
        Fruit f = new Seller();
        f.sell();
        f.buy();
        Fruit.eat();
    }
}