import java.util.*;
class If_else{
public void Kids(int age)
{
	if((age<=4)&&(age>=3))
	{
		System.out.println("Kids are eligiable to go nursery");
	}
	else if((age>=5)&&(age<=6))
	{
		System.out.println("kids eligiable to go Kinder gardens");
	}
	else if((age>18)&&(age==18))
	{
System.out.println("Kid can eligiable to vote ");
	}
else if((age>21)&&(age!=19))
{
	System.out.println("kid is eligiable for election candidate & WEDDING");
}
else if((age>=50)&&(age<=58))
{
	System.out.println("eligiable for retirement ");
}
else
{
	System.out.println("INVALID AGE INPUT");
}
}
public static void main(String args[])
{
	Scanner sellu=new Scanner(System.in);
	System.out.println("Enter Age: ");
	int age=sellu.nextInt();
	
	If_else obj=new If_else();
	obj.Kids(age);
}
}
