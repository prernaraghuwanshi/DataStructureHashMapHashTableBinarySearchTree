package com.bridgelabz.DataStructure;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class LinkedHashMapTest {

	@Test
	public void givenASentence_whenWordsAreAddedToList_shouldReturnParanoidFrequency() {
		String sentence = "Paranoids are not paranoid because they are paranoid but because "
				+ "they keep putting themselves deliberately into paranoid avoidable situations";
		LinkedHashMap<String, Integer> myLinkedHashMap = new LinkedHashMap<>();
		String[] words = sentence.toLowerCase().split(" ");
		for (String word : words) {
			Integer value = myLinkedHashMap.get(word);
			if (value == null)
				value = 1;
			else
				value += 1;
			myLinkedHashMap.add(word, value);
		}
		int frequency = myLinkedHashMap.get("paranoid");
		assertEquals(3, frequency);
	}

}
