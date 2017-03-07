package edu.umb.cs.cs680;

import java.util.HashMap;

public class SyllableTest {
	
	protected static int countSyllables(String word) {
		// TODO: Implement this method so that you can call it from the
		// getNumSyllables method in BasicDocument (module 1) and
		// EfficientDocument (module 2).
		char wordArray[] = word.toCharArray();
		int length = word.length();
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		map.put('a', 0);
		map.put('i', 1);
		map.put('o', 2);
		map.put('u', 3);
		map.put('y', 4);
		map.put('e', 5);
		int numberOfSyllabes = 0;
		int flag = 0;
		for (int i = 0; i < length; i++) {
			
				if (map.containsKey(wordArray[i])) {
					if(flag == 0){
						numberOfSyllabes++;
						flag = 1;
					}
					
					
				}
				else{
					flag = 0;
				}
			
		}
		if (numberOfSyllabes >1) {
			if (wordArray[length - 1] == 'e' && !(map.containsKey(wordArray[length - 2]))) {
				numberOfSyllabes--;
			}
		}
		return numberOfSyllabes;
	}
	
	public static void main(String[] args) {
		String words = "sentence, with, lots, of, commas.!  (And some poaren)).  The output is: 7.5.";
		String wordsA[] = words.split(",");
		int count = 0;
		for(String s : wordsA){
			//System.out.println(countSyllables(s));
			count = count + countSyllables(s);
		}
		System.out.println(count);
	}

}
