package interfaces;

public interface Shape {
	
	int length=10;
	int breadth=20;
	
	void circle();
	
	default void square() {
		
		System.out.println("This is a square");
	}
	
	static void rectangle() {
		System.out.println("This is a rectangle- static");
	}
	

}
