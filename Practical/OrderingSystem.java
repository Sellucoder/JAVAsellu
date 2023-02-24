import java.util.*;

public class OrderingSystem {
	public static String[] appetizers() {
		Scanner sc = new Scanner(System.in);
		String choices;
		int inputs = 0;
		System.out.println("How many Appetizers you want?(1 to 3)");
		inputs = sc.nextInt();
		String MyAppetizers[] = new String[inputs];
		System.out.println("Enter Your choices(1 to 3)one by one to select Appetizers: ");

		System.out.println("1.Salad");
		System.out.println("2.Soup");
		System.out.println("3.Chicken Nudgets");

		for (int i = 0; i < MyAppetizers.length; i++) {

			choices = sc.next();

			switch (choices) {
			case "1":
				MyAppetizers[i] = "Salad";
				break;
			case "2":
				MyAppetizers[i] = "Soup";
				break;
			case "3":
				MyAppetizers[i] = "Chicken Nudgets";
				break;

			default:
				break;
			}

		}
		System.out.println("Selected Appetizers:");
		for (int i = 0; i < MyAppetizers.length; i++) {
			System.out.println((i + 1) + ". " + MyAppetizers[i]);
		}
		return MyAppetizers;
	}

	public static String[] drinks() {
		Scanner sc = new Scanner(System.in);
		String choices;
		int inputs = 0;
		System.out.println("How many Drinks you want?(1 to 3)");
		inputs = sc.nextInt();
		String MyDrinks[] = new String[inputs];
		System.out.println("Enter Your choices(1 to 3)one by one to select Drinks: ");

		System.out.println("1.Mojito");
		System.out.println("2.Coke");
		System.out.println("3.Soda");

		for (int i = 0; i < MyDrinks.length; i++) {

			choices = sc.next();

			switch (choices) {
			case "1":
				MyDrinks[i] = "Mojito";
				break;
			case "2":
				MyDrinks[i] = "Coke";
				break;
			case "3":
				MyDrinks[i] = "Soda";
				break;

			default:
				break;
			}

		}
		System.out.println("Selected Drinks:");
		for (int i = 0; i < MyDrinks.length; i++) {
			System.out.println((i + 1) + ". " + MyDrinks[i]);
		}
		return MyDrinks;
	}

	public static String[] meals() {
		Scanner sc = new Scanner(System.in);
		String choices;
		int inputs = 0;
		System.out.println("How many Meals you want?(1 to 3)");
		inputs = sc.nextInt();
		String MyMeals[] = new String[inputs];
		System.out.println("Enter Your choices(1 to 3)one by one to select Meals: ");

		System.out.println("1.Chicken Biryani");
		System.out.println("2.Chicken Lolipop");
		System.out.println("3.Veg Biryani (Pulav)");

		for (int i = 0; i < MyMeals.length; i++) {

			choices = sc.next();

			switch (choices) {
			case "1":
				MyMeals[i] = "Chicken Biryani";
				break;
			case "2":
				MyMeals[i] = "Chicken Lolipop";
				break;
			case "3":
				MyMeals[i] = "Veg Biryani (Pulav)";
				break;

			default:
				break;
			}

		}
		System.out.println("Selected Meals:");
		for (int i = 0; i < MyMeals.length; i++) {
			System.out.println((i + 1) + ". " + MyMeals[i]);
		}
		return MyMeals;
	}

	public static void main(String[] args) {

		System.out.println("Welcome to Restraunt Ordering System");
		System.out.println();
		String appetizers[]=appetizers();
		System.out.println("----------------------------------------------------------");
		String drinks[]=drinks();
		System.out.println("----------------------------------------------------------");
		String meals[]=meals();
		System.out.println("----------------------------------------------------------");
		
		System.out.println("Your Final Order Is: ");
		for(String s:appetizers)
		{
			System.out.print(s+", ");
		}
		for(String s:drinks)
		{
			System.out.print(s+", ");
		}
		for(String s:meals)
		{
			System.out.print(s+", ");
		}
	}

}