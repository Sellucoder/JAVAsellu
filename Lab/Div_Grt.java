//Write a program to Print numbers from 1-100, which are divisible by 5, and if the number is greater than 40.
class Div_Grt{
	public void One_Hun(){
		for(int i=1; i<=100; i++)
		{
			if((i%5==0) && (i>=40))
			{
				System.out.println("\n" +i);
			}
		}
		System.out.println("\n Thank you Anudip...");
	}
	public static void main(String args[]){
		Div_Grt sellu=new Div_Grt();
		sellu.One_Hun();
	}
}

