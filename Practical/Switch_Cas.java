import java.util.*;
class Switch_Cas{
	public void C_ase(int month_num)
	{
		switch(month_num){
			case 1:
			System.out.println("\n january month");
			break;
			
			case 2:
			System.out.println("\n February month");
			break;
			
			case 3:
			System.out.println("\n March month");
			break;
			
			case 4:
			System.out.println("\n April month");
			break;
			
			case 5:
			System.out.println("\n May month");
			break;
			
			case 6:
			System.out.println("\n June month");
			break;
			
			case 7:
			System.out.println("\n July month");
			break;
			
			case 8:
			System.out.println("\n August month");
			break;
			
			case 9:
			System.out.println("\n September month");
			break;
			
			case 10:
			System.out.println("\n October month");
			break;
			
			case 11:
			System.out.println("\n November month");
			break;
			
			case 12:
			System.out.println("\n December month");
			break;
			
			default:
			System.out.println("\n INVALID VALUE");
			break;
		}
	}
		public static void main(String args[])
		{
			Scanner sellu=new Scanner(System.in);
			System.out.println("\n Enter a num for finding a month name: ");
			int month_num=sellu.nextInt();
			Switch_Cas sel=new Switch_Cas();
			sel.C_ase(month_num);
		}
	}


	