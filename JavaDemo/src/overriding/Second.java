package overriding;

public class Second extends First{
	int b=150;
	 void display() {
		 System.out.println("Class Second, value of a "+b);
	 }
	 void show()
	 {
		 System.out.println("This is class Second");
	 }
}
