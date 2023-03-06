import java.util.Scanner;

public class Division {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            int x = scanner.nextInt();
            int y = scanner.nextInt();

            if (y == 0) {
                throw new ArithmeticException("/ by zero");
            }

            int result = x / y;
            System.out.println(result);

        } catch (ArithmeticException e) {
            System.out.println(e);
        } catch (Exception e) {
            System.out.println("java.util.InputMismatchException");
        }
    }
}
