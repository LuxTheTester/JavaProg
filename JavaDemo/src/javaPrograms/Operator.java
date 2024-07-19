package javaPrograms;

import java.util.Scanner;

public class Operator {

	public static void main(String[] args) {
		
		//Swapping two numbers
		//int a=45;
		//int b=34;
		
		int a,b;
		
		Scanner s= new Scanner(System.in);
		System.out.println("Enter the first digit: ");
		a=s.nextInt();
		System.out.println("Enter the second digit: ");
		b=s.nextInt();
		
		System.out.println("Before Swap ");
		System.out.println("a= "+a);
		System.out.println("b= "+b);
		
		if(a>b) {
			a=a+b;
			b=a-b;
			a=a-b;
			System.out.println("After Swap ");
			System.out.println("a= "+a);
			System.out.println("b= "+b);
		}
		else {
			b=a+b;
			a=b-a;
			b=b-a;
			System.out.println("After Swap ");
			System.out.println("a= "+a);
			System.out.println("b= "+b);
		}
		
		//Reverse a number
		int rem, rev=0;
		System.out.println("Enter a number to reverse: ");
		int c=s.nextInt();
		while(c!=0) {
			
			rem=c%10;
			rev=rev*10+rem;
			c=c/10;
		}
		System.out.println("Reversed number is: "+rev);

	}

}
