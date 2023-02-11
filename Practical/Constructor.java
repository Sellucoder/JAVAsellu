 public class Constructor {
    Constructor() {
        System.out.println("Testing 1");
    }
    int a;
    String name;

    public void display() {
        System.out.println(a + " " + name);
    }

    public static void main(String[] args) {
        System.out.println("Testing 2");
        Constructor cc = new Constructor(); //calling the default constructor
        cc.display();
    }
    //0 and null values will be provided by constructor
}