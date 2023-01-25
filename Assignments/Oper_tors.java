class Oper_tors{                              // MAIN CLASS FOR SUB OPERATORS AND FUNCTIONS
	public void arth(){                       // ARTHMTIC OPERATORS DECLARTION 
		int a=5,b=55;
		System.out.println("A+B: "+(a+b));
		System.out.println("A-B: "+(a-b));
		System.out.println("A/B: "+(a/b));
		System.out.println("A*B: "+(a*b));
	}
	
	public void calcIncrement(){              // UNARY OPERATORS DECLARTION
	int x=10;
	System.out.println(x++);
	System.out.println(x++);
	System.out.println(++x);
	System.out.println(x++);
	System.out.println(x);
}

public void calcDecrement(){
	int x=10;
	 
		System.out.println(x--);
		System.out.println(--x);
		System.out.println(--x);
		System.out.println(x--);
		System.out.println(x);
} 

public void Compari_on(){                     // COMPARISON OR RELATIONAL OPERATORS DECLARTION
		int a=15,b=58;
		System.out.println("a>b:" +(a>b));
		System.out.println("a>b:" +(a>b));
		System.out.println("a>b:" +(a>=b));
		System.out.println("a>b:" +(a>=b));
		System.out.println("a>b:" +(a==b));
		System.out.println("a>b:" +(a!=b));
}

public void Log_ic(){                         //LOGICAL OPERATORS DECLARTION
	int a=54;
	double b=9.56;
	System.out.println("a&&b"+(a>b&&a>=b));
	System.out.println("a&&b"+(a>b||a>=b));
}


public void Assignm_ent(){                      //ASSIGNMENT OPERATORS DECLARTION
      int a=88 ,b=66;
	  System.out.println("a+="+(a+=58));
	  System.out.println("b-="+(b-=50));
}

public void Author_code(){
	System.out.println("THIS PROGRAM IS DONE BY MUTHUSELVAN");
}

public static void main(String args[]){
	Oper_tors sellu=new Oper_tors();
	sellu.arth();
	sellu.calcIncrement();
	sellu.calcIncrement();
	sellu.Compari_on();
	sellu.Log_ic();
	sellu.Assignm_ent();
	sellu.Author_code();
}
}
