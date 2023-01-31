import java.util.*;
class For_Lop{
	public void table(int num){
		for(int i=1; i<=10; i++)
		{
			System.out.println(num +"x"+i+"="+(num*i));
		}
	}
	
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("\n Enter a num for table");
		int num=sc.nextInt();
		For_Lop sellu=new For_Lop();
		sellu.table(num);
	}
}

