package hom3;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class DogTest {

	@Test
	public void testCompareName() {
		Dog dog1 = new Dog("Bobik", Breed.BULLDOG, 12);
		Dog dog2 = new Dog("Bobik", Breed.GERMAN_SHEPHERD, 2);
		Assert.assertTrue(dog1.compareName(dog1, dog2));
	}

}
