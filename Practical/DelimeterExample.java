import java.util.Scanner;

public class DelimeterExample {
    public static void main(String[] args) {
//        Scanner sc = new Scanner("Life is good...");
//        sc.useDelimiter("Life");
//        while (sc.hasNext()) {
//            System.out.println(sc.next());
//        }
        Scanner sc = new Scanner("Life is good...");
        sc.useDelimiter("\\s");
        while (sc.hasNext()) {
            System.out.println(sc.next());
        }
    }
}