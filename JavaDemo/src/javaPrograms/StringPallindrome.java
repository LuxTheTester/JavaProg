package javaPrograms;

import java.util.Arrays;

public class StringPallindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	String a="silent";
	char[] a1=a.toCharArray();
	String reverse="";
	for(int i=a.length()-1; i>=0;i--) {
		 reverse=reverse+a1[i];
		
	}
			System.out.println("Before reverse "+a);
			System.out.println("After reverse "+reverse);
	
	String b="lis7ten";
	char[] b1=b.toCharArray();
	Arrays.sort(a1);
	Arrays.sort(b1);
	if(Arrays.equals(a1,b1)) {
		System.out.println("Strings are anagram");
	}
	else {
		System.out.println("Strings aren't anagram");
	}
	
	
	}

}
