package overriding;

public class Color1 extends Color{
	
	String color="Black";
	public void display(String color) {
		System.out.println("This is class color1 and the color is "+color);
		System.out.println(super.color);
	}
	
	}

