import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

public class FizzBuzzTest {

	@Test
	public void testNombreElementAffichee() {

		FizzBuzz fb = new FizzBuzz();
		int size = fb.getFizzBuzzList().size();

		assertTrue(size == 100);
	}

	@Test
	public void testCheckRemplacementMultipleDe3ParFizz() {

		FizzBuzz fb = new FizzBuzz();
		List<String> listeFizzBuzz = fb.getFizzBuzzList();

		for (int i = 1; i <= 100; i++) {
			if ((i % 3 == 0) && !(i % 5 == 0)) {

				assertEquals("Fizz", listeFizzBuzz.get(i - 1));
			}
		}
	}

	@Test
	public void testCheckRemplacementMultipleDe5ParBuzz() {

		FizzBuzz fb = new FizzBuzz();
		List<String> listeFizzBuzz = fb.getFizzBuzzList();

		for (int i = 1; i <= 100; i++) {
			if (!(i % 3 == 0) && (i % 5 == 0)) {

				assertEquals("Buzz", listeFizzBuzz.get(i - 1));
			}
		}
	}

	@Test
	public void testCheckRemplacementMultipeDe5et3ParFizzBuzz() {

		FizzBuzz fb = new FizzBuzz();
		List<String> listeFizzBuzz = fb.getFizzBuzzList();

		for (int i = 1; i <= 100; i++) {
			if ((i % 3 == 0) && (i % 5 == 0)) {

				assertEquals("FizzBuzz", listeFizzBuzz.get(i - 1));
			}
		}
	}

	@Test
	public void testCheckNombreNonMultipleDe5et3() {

		FizzBuzz fb = new FizzBuzz();
		List<String> listeFizzBuzz = fb.getFizzBuzzList();

		for (int i = 1; i <= 100; i++) {
			if (!(i % 3 == 0) && !(i % 5 == 0)) {

				assertEquals(String.valueOf(i), listeFizzBuzz.get(i - 1));
			}
		}
	}

}
