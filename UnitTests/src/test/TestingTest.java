package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import main.Testing;

class TestingTest {
	
	Testing testing = new Testing();	
	
	
	@Test // metoda testująca, dla silnika testującego oznacza to, że ta metoda jest testem, bez tego metoda nie będzie uruchomiona
	void testAddition() {
		int x = 2;
		int y = 2;
			
		assertEquals(4, testing.addition(x, y));
		
	}
	 
	@Test
	void testCheckTheRangeTrue () {
		
		int min = 3;
		int max = 7;
		int number = 4;
		
		assertTrue(testing.checkTheRange(min, max, number));
		
		// dane poprawne to takie dane, których uzycie w tym przypadku zwraca true;
		//przez dane niepoprawne należy rozumieć takie dane wejściowe, których uzycie spowoduje zwrócenie
		//przez metodę wartości false
		// testy 	
		}
	
	@Test
	 void testCheckTheRangeFalse1() {
		int min = 3;
		int max = 7;
		int num = 2;
		
		assertFalse(testing.checkTheRange(min, max, num));
		
	}
	
	
	@Test
	@Disabled // rezygnacja z przeprowadzenia testu
	 void testCheckTheRangeFalse2() {
		int min = 3;
		int max = 7;
		int num = 9;
		
		assertFalse(testing.checkTheRange(min, max, num));
		
	}
}

