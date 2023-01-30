class Conditio_nal_Statements{
	public void Voting()
	{
		int Voting_Age =24;
		int Pan_Card_Age =42;
		
		if(Voting_Age >=18 )
		{
			System.out.println("\n you are eligiable to vote");
		}
        if(Pan_Card_Age >=21)
		{
		
			System.out.println("\n you are not eligiable to apply for pancard");
			
		}
		else 
		{
			System.out.println("\n you are not an Adult");
		}
	}

	public static void main(String args[]){
		Conditio_nal_Statements sellu_obj=new Conditio_nal_Statements();
		sellu_obj.Voting();
	}
} 



 