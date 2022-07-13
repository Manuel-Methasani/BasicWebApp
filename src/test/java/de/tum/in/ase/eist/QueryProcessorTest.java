package de.tum.in.ase.eist;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

class QueryProcessorTest {

	private final QueryProcessor queryProcessor = new QueryProcessor();

	@Test
	void testEmptyStringIfCannotProcessQuery() {
		assertEquals("", queryProcessor.process("test"));
	}

	@Test
	void testKnowsAboutShakespeare() {
		String actual = queryProcessor.process("Shakespeare");
		if (!actual.contains("playwright")) {
			fail("The QueryProcessor does not know about Shakespeare.");
		}
	}

	@Test
	void isNotCaseSensitive() {
		String actual = queryProcessor.process("shakespeare");
		if (!actual.contains("playwright")) {
			fail("Your QueryProcessor should not be case sensitive.");
		}
	}

	void testKnowsMyName() {
		String actual = queryProcessor.process("what is your name");
		if (!actual.contains("Manuel")) {
			fail("Your QueryProcessor does not know your name.");
		}
	}

	@Test
	void testKnowsAboutFood() {
		String actual = queryProcessor.process("food");
		if (!actual.contains("Pizza")) {
			fail("Your QueryProcessor does not know what good food is.");
		}
	}

}
