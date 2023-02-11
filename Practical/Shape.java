abstract class Shape {
    abstract void draw();//declared a method

    int width = 10;
    int height = 5;

    Shape() {

    }

    void display()//non-abstract method implementation given
    {
        System.out.println("Displaying shape");
    }
}

class Triangle extends Shape {
    void draw()//Implementation
    {
        System.out.println("Display shape");
    }

}

class Square extends Shape {
    void draw()//Implementation should be given as abstract method
    {
        System.out.println("Drawing shape");
    }
}

class Abstraction {
    public static void main(String args[]) {
	/* Shape s = new Shape();
	  s.display();
	 	 s.draw();//JVM get's confused hence multiple inheritance is not supported
  */
        Triangle s = new Triangle();
        s.display();
        s.draw();

    }
}