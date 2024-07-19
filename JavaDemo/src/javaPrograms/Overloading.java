package javaPrograms;

public class Overloading {
	
public static void add() {
	int a=10;
	int b=20;
	System.out.println(a+b);
}

public static void add(int a, int b) {
	int c=a+b;
	System.out.println(c);
}

public static void add(double a) {
	System.out.println(a+100);
}

public static void main(String[] args)
{
	add();
	add(35,65);
	add(56.25);
	
}
}
