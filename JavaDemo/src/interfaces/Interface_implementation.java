package interfaces;

public class Interface_implementation implements Shape{
	
	public void circle() {
		System.out.println("This is circle - abstract");
		
	}
	
	public static void main(String[] args) {
		Interface_implementation i= new Interface_implementation();
		i.circle();
		i.square();
		Shape.rectangle();
		
		Shape sh= new Interface_implementation();
		int area = sh.length*sh.breadth;
		System.out.println(area);
		
		
		
	}

}
