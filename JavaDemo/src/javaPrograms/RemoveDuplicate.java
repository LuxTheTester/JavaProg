package javaPrograms;

import java.util.HashSet;

public class RemoveDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        String statement = "this is a test test statement statement";
        String[] words = statement.split(" ");
        HashSet<String> uniqueWords = new HashSet<>();
        for (String word : words) {
            if (!uniqueWords.add(word)) {
                System.out.println("Duplicate word: " + word);
            }
        }
        System.out.println("Unique words: " + String.join(" ", uniqueWords));

	}

}
