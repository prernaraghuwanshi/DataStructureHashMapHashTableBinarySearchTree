package com.bridgelabz.DataStructure;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class HashMapTest {
	@Test
	public void givenASentence_whenWordsAreAddedToList_shoudReturnWordFrequency() {
		String sentence = "To be or not to be";
		HashMap<String, Integer> myHashMap = new HashMap<>();
		String[] words = sentence.toLowerCase().split(" ");
		for (String word : words) {
			Integer value = myHashMap.get(word);
			if (value == null)
				value = 1;
			else
				value += 1;
			myHashMap.add(word, value);
		}
		int frequency = myHashMap.get("be");
		myHashMap.printHashMap();
		assertEquals(2, frequency);
	}
}
