public interface Library_user{
	public void Register_Account();
	public void Request_Book();
}


class Kid_User implements Library_user{
	int age=10;
	String Book_Type="kid";
	
	public void Register_Account() {
		if(age<=12)//checking if age is less than equal to 12
		{
			System.out.println("\n You have successfully registered under a Kids Account");//printing success message on true condition
		}
		else if (age>12){//checking if age is greater than equal to 12
			System.out.println("\n Sorry, Age must be less than 12 to register as a kid");//printing failure message on condition age greater than 12
		}
	}
	
	
	public void Request_Book(){
	     if(Book_Type=="Kids")//checking if bookType is Kids
		{
			System.out.println("Book Issued successfully, please return the book within 7 days");//printing success message on true condition
		}
		else //while bookType is not Kids
		{
			System.out.println("Oops, you are allowed to take only kids books Sorry");//printing failure message on false condition 
		}
	}
}
 public class Adult_User implements Library_user{
		int age=22;
		String Book_Type="Fiction";
		
		public void Register_Account(){
			if(age>=12){
				System.out.println(" You have successfully registered under an Adult Account ");
			}
			else 
			{
				System.out.println("Sorry, Age must be less  than 12 to register as an Kid user ");
			}
		}
		
		public void Request_Book(){
			if(Book_Type=="Fiction"){
				System.out.println("Book Issued successfully, please return the book within 7 days");
			}
			else
			{
				System.out.println("Oops, you are allowed to take only adult Fiction books");
			}
		}
 }
		
	   class Library_Interface_Demo{
		
			public Static void main(String args[]){
				
			Kid_User obj1=new Kid_User(); 
            obj1.Register_Account();
            obj1.Request_Book();
           Adult_User obj2=new Adult_User();
            obj2.Register_Account();
            obj2.Request_Book();
			}
		}
