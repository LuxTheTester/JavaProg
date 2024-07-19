package javaPrograms;

import java.util.Arrays;

public class ArraySorting {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		int array[]= {10,20,65,64,98,25,32};
		System.out.println("Before Sort");
		System.out.println(Arrays.toString(array));
		Arrays.sort(array);
		System.out.println("After Sort");
		System.out.println(Arrays.toString(array));
		
		//String sorting
		
		String[] s= {"Abc", "selenium", "Java", "Interview", "package", "salary"};
	
		Arrays.sort(s);
		System.out.println(Arrays.toString(s));
		System.out.println(Arrays.toString(s));
		
		//Reverse a String
		String a="Quality";
		String rev="";
		for(int i=a.length()-1;i>=0;i--) {
			rev=rev+a.charAt(i);	
		}
		System.out.println("Reverse String is: "+rev);

		StringBuffer sb= new StringBuffer("beautiful");
		sb.append(" girl");
		System.out.println(sb);
		sb.reverse();
		System.out.println(sb);
		
		int count=0;
		String d="hello there what's up?";
		for(int i=0; i<d.length();i++) {
			
				if(d.charAt(i)=='e')
				{count=count+1;}				
		}
		d.split("");
		System.out.println(d);
		System.out.println(count);
		
		
	}

}
