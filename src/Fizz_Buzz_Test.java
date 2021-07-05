import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

public class Fizz_Buzz_Test {

	@Test
	public void testNombreElementAffichee() {
		
		Fizz_Buzz fb=new Fizz_Buzz();
		fb.fizzBuzzMethode();
		int size = fb.getFizzBuzzList().size();
		
		assertTrue(size==100);
	}
	
	@Test
	public void testCheckRemplacementMultipleDe3ParFizz() {
		Fizz_Buzz fb=new Fizz_Buzz();
		fb.fizzBuzzMethode();
		List <String>l= fb.getFizzBuzzList();
		
		 for (int i = 1; i <= 100; i++) {
		        if ((i % 3 == 0) && !(i % 5 == 0)) {
		        	
		        	assertEquals("Fizz", l.get(i-1));
		        }
		    }
	}
	
	@Test
	public void testCheckRemplacementMultipleDe5ParBuzz() {
		Fizz_Buzz fb=new Fizz_Buzz();
		fb.fizzBuzzMethode();
		List <String>l= fb.getFizzBuzzList();
		
		 for (int i = 1; i <= 100; i++) {
		        if (!(i % 3 == 0) && (i % 5 == 0)) {
		        	
		        	assertEquals("Buzz", l.get(i-1));
		        }
		    }
	}
	
	@Test
	public void testCheckRemplacementMultipeDe5et3ParFizzBuzz() {
		Fizz_Buzz fb=new Fizz_Buzz();
		fb.fizzBuzzMethode();
		List <String>l= fb.getFizzBuzzList();
		
		 for (int i = 1; i <= 100; i++) {
		        if ((i % 3 == 0) && (i % 5 == 0)) {
		        	
		        	assertEquals("FizzBuzz", l.get(i-1));
		        }
		    }
	}

	
	@Test
	public void testCheckNombreNonMultipleDe5et3() {
		Fizz_Buzz fb=new Fizz_Buzz();
		fb.fizzBuzzMethode();
		List <String>l= fb.getFizzBuzzList();
		
		 for (int i = 1; i <= 100; i++) {
		        if (!(i % 3 == 0) && !(i % 5 == 0)) {
		        	
		        	assertEquals(String.valueOf(i), l.get(i-1));
		        }
		    }
	}

}
