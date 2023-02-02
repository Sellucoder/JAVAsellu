 //Write a program to design an Calculator using switch case
 
 import java.util.*;  // using java lib for taking value from user 
 class Cal_ulator{     // class name 
 char option;
  
	 public void Choose_Option(double a,double b){
		 double result;
		  
	 switch(option){   //switchclass start
	 
			case '+':
		    result=a+b;
			break;
			
			case '-':
			result=a-b;
			break;
			
			case '*':
			result=a*b;
			break;
			
			case '/':
			result=a/b;
			break;
			
			default:
			System.out.println("\n INVALID VALUE");
			break;
			
		}
	 }
	 
	 public static void main(String args[]){    // main method 
 		 Scanner sellu=new Scanner(System.in);
		 System.out.println("\n Enter any optertor eg:(+,-,*,/)");
		 char option=sellu.next().charAt(0);
		 System.out.println("\n Enter num 1 (eg:1,2,3,4.5,2.54) etc");
		 double a=sellu.nextDouble();
		 System.out.println("\n Enter num 2 (eg:1,2,3,4.5,2.54) etc");
		 double b=sellu.nextDouble();
		  
		 
		 
		 Cal_ulator obj=new Cal_ulator();    //creating instance for calling method 
		 obj.Choose_Option(a,b);
 		 System.out.println("\n Thank You for using our service");
	 }
 }
 
		 
		 
 