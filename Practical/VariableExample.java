 class VariableExample{
	 static int num=55;
	 long num1=52646458;
	 
	 public void display(){
		 char a='m';
		 double num2=52.36;
		 System.out.println("local variable value: "+a);
		 System.out.println("local variable value:"+num2);
 
	 }
 
 public static void calc(){
	 double a=56.84;
	 double b=53.69;
	 double res=a*b;
	 System.out.println("result is :"+res);
 }
 public static void main(String args[]) {
	 VariableExample obj=new VariableExample();
	 obj.display();
	 calc();
	 System.out.println("instance variable value :"+obj.num1);
	 System.out.println("static variable value:"+ num);
 }}