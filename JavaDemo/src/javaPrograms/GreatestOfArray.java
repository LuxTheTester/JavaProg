package javaPrograms;

import java.lang.reflect.Array;
import java.util.Arrays;

public class GreatestOfArray {

	public static void main(String[] args) {

		int array[]= {52, 89, 25, 56, 12, 37};
		
//		int max=array[0];
//		int min=array[0];
//		
		Arrays.sort(array);
		
//		for(int i=0;i<array.length;i++) {
//			if(max<array[i]) {
//				max=array[i];
//				System.out.println("Greatest: "+max);
//			}
//		for(int j=0;j<array.length;j++) {
//			if(min>array[j]) {
//				min=array[j];
//				System.out.println("Smallest is: "+min);
//			}
//		}
//		}
		
		System.out.println("Smallest: "+array[0]);
		System.out.println("Greatest: "+array[array.length-1]);
		

	}

}
