package javaPrograms;

public class ArraysDemo {
	
	public static void main(String[] args) {
		
		int array[]= {10,20,65,64,98,25,32};
		
//		for(int i=0;i<array.length; i++) {
//			System.out.println("Array elements are: "+array[i]);
//		}
		int sum=0;
		//Enhanced for loop
		for(int x:array) {
			System.out.println("Array elements are: "+x);
			sum=sum+x;
			
			if(x%2==0) {
				System.out.println(x+" "+"is even");
			}
			else {
				System.out.println(x+" "+"is odd");
			}
		}
		System.out.println("Sum of elements of the array: "+sum);
		
		
		
		//TwoD Array
		int a[][]= new int[2][2];
		a[0][0]=100;
		a[0][1]=200;
		a[1][0]=800;
		a[1][1]=950;
		
		for(int r=0; r<a.length; r++) {
			for(int c=0; c<a[r].length;c++) {
				System.out.println("Array Elements are : "+a[r][c]);
			}
		}
		
	}
	

}
