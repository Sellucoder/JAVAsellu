//Write a program to print even, odd, sum of natural number using for loop from 1-200
class Even_Odd{
public void E_v1(){
	for(int i=1; i<=200; i++)
	{
		if (i%2!=0) 
		{
			
		System.out.println("\n " +i);
	}
	 
}
}
public void O__d(){
	for(int i=1;i<=200;i++)
	{
		if(i%2==0)
		{
		System.out.println("\n" +i);
		}
	}
	System.out.println("Thank you .....anudip");
}
public static void main(String args[]){
	Even_Odd sellu=new Even_Odd();
	sellu.E_v1();
	sellu.O__d();
}
}
 