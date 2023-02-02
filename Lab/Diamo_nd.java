// Write a program to print an diamond star pattern using loop
class Diamo_nd{                                    // main class 
	public void star(){                           
		for(int i=1;i<=6;i++)                         //for loop for diamond star condition 
		{
			for(int j=i;j<=6;j++)
			{				
				System.out.print('*');
		}
		System.out.println(" ");
	}
	    for(int j=1;j<=6;j++)
		{
			for(int i=j;i<=6;i++)
			{
				System.out.print('*');
			}
			System.out.println(" ");
		}
		
			
	}
	public static void main(String args[]){                   //main method
		Diamo_nd sellu=new Diamo_nd();
		sellu.star();
	}
}