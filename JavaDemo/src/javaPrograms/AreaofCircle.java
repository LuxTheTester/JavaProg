package javaPrograms;

import java.util.Scanner;

public class AreaofCircle {
	
	public static void main(String[] args) {
		double radius;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the radius: ");
		radius= sc.nextDouble();
		double area=3.14*radius*radius;
		System.out.println("Area of the circle is "+area);
		
	}

}
