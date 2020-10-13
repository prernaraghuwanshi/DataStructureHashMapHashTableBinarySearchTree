package com.bridgelabz.DataStructure;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class LinkedHashMapTest {
	LinkedHashMap<String, Integer> myLinkedHashMap;

	@Before
	public void initialize() {
		String sentence = "Paranoids are not paranoid because they are paranoid but because "
				+ "they keep putting themselves deliberately into paranoid avoidable situations";
		myLinkedHashMap = new LinkedHashMap<>();
		String[] words = sentence.toLowerCase().split(" ");
		for (String word : words) {
			Integer value = myLinkedHashMap.get(word);
			if (value == null)
				value = 1;
			else
				value += 1;
			myLinkedHashMap.add(word, value);
		}
	}

	@Test
	public void givenASentence_whenWordsAreAddedToList_shouldReturnParanoidFrequency() {
		int frequency = myLinkedHashMap.get("paranoid");
		assertEquals(3, frequency);
	}

	@Test
	public void givenASentence_whenWordIsRemoved_shouldReturnDeletedWordFrequency() {
		int frequency = myLinkedHashMap.remove("avoidable");
		assertEquals(1, frequency);
	}

}
