package javaPrograms;

public class StringRemoveSpaces {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "Hello World";
        str = str.replaceAll("\\s", "");
        System.out.println(str);
       // String reversed = new StringBuilder(str).reverse().toString();
//        for (int i = 0; i < reversed.length(); i++) {
//            if (i % 2 == 0) {
//                System.out.print(reversed.charAt(i));
//            }
//	}

}
}
