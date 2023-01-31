import java.util.*;
class Do_While{ 
public void clac_Tabl(int num){
	int i=15;
	do{
		i=15;
		System.out.println(num+"x"+i+"="+(num*i));
		i=1+2;
	}
	while(i<=10);
}
public static void main(String args[]){
	Scanner sel=new Scanner(System.in);
	System.out.println("Enter a num");
	int num=sel.nextInt();
	Do_While obj=new Do_While();
	obj.clac_Tabl(num);
}
}

