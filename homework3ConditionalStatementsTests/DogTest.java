package homework3;

import static org.junit.Assert.*;

import org.junit.Test;

//Tests for methods of the class "Dog"

public class DogTest {

	@Test
	public void testSameNameCheckNegative() {
		Dog dog1 = new Dog("Rassie", Breed.AiredaleTerrier, 3);
		Dog dog2 = new Dog("White Fang", Breed.AlaskanMalamute, 3);
		assertFalse(dog1.sameNameCheck(dog2));
	}
	
	@Test
	public void testSameNameCheckPositive() {
		Dog dog1 = new Dog("Rassie", Breed.AiredaleTerrier, 3);
		Dog dog2 = new Dog("Rassie", Breed.AlaskanMalamute, 3);
		assertTrue(dog1.sameNameCheck(dog2));
	}
	
	@Test
	public void testSameAgeCheckNegative() {
		Dog dog1 = new Dog("Rassie", Breed.AiredaleTerrier, 3);
		Dog dog2 = new Dog("Rassie", Breed.AlaskanMalamute, 5);
		assertFalse(dog1.sameAgeCheck(dog2));
	}
	
	@Test
	public void testSameAgeCheckPositive() {
		Dog dog1 = new Dog("Rassie", Breed.AiredaleTerrier, 3);
		Dog dog2 = new Dog("Rassie", Breed.AlaskanMalamute, 3);
		assertTrue(dog1.sameAgeCheck(dog2));
	}
	
	@Test
	public void testGogAgeComparrisonNegative() {
		Dog dog1 = new Dog("Rassie", Breed.AiredaleTerrier, 3);
		Dog dog2 = new Dog("Rassie", Breed.AlaskanMalamute, 5);
		assertFalse(dog1.dogAgeComparrison(dog2));
	}
	
	@Test
	public void testDogAgeComparrisonPositive() {
		Dog dog1 = new Dog("Rassie", Breed.AiredaleTerrier, 5);
		Dog dog2 = new Dog("Rassie", Breed.AlaskanMalamute, 3);
		assertTrue(dog1.dogAgeComparrison(dog2));
	}

}
