enum Fruits {
    APPLE, BANANA, CHERRY, MANGO;
}

class EnumExample2 {
    public static void main(String args[]) {
        Fruits fru = Fruits.BANANA;
        switch (fru) {
            case APPLE:
                System.out.println("Fruit is apple");
                break;
            case BANANA:
                System.out.println("Fruit is banana");
                break;
            case CHERRY:
                System.out.println("Fruit is cherry");
                break;
            case MANGO:
                System.out.println("Fruit is mango");
                break;
            default:
                System.out.println("Invalid fruit!!");
                break;
        }
    }
}