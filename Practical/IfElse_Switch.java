import java.util.*;
class IfElse_Switch{
	public void job(int age){
	
	 
		if (age >=40 && age <=65){	
				String shift = "First";
			switch(shift){
				
				case "First" :
				System.out.println("first shift allowed 6am - 3pm");
				break;
				
				case "Second" :
				System.out.println("Second shift allowed 4pm - 10 pm");
				break;
			}
			
		}
		else if(age >=20 && age <40){
			String shift1 = "Night";
			switch(shift1){
				
				case "Night" :
				System.out.println("Night shift allowed 11pm - 5 am");
				break;
				
				case "General" :
				System.out.println("General shift allowed 10am - 6 pm");
				break;
				
			}
			
		}
		else{
			System.out.println("Age is not proper");
		}
		
	}
	
	public static void main(String args[]){
		Scanner sellu=new Scanner(System.in);
		System.out.println("\n Enter a age");
		int age=sellu.nextInt();
		IfElse_Switch obj=new IfElse_Switch();
		obj.job(age);
	}
}

		
