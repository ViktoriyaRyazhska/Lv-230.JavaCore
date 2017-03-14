package hom3;

import org.junit.Assert;
import org.junit.Test;

public class DogTest {

	@Test
	public void testCompareName() {
		Dog dog1 = new Dog("Bobik", Breed.BULLDOG, 12);
		Dog dog2 = new Dog("Bobik", Breed.GERMAN_SHEPHERD, 2);
		Assert.assertEquals(true, dog1.compareName(dog1, dog2));

	}

	@Test
	public void testCompareAge() {
		Dog dog1 = new Dog("Bobik", Breed.BULLDOG, 12);
		Dog dog2 = new Dog("Bobik", Breed.GERMAN_SHEPHERD, 2);
		Assert.assertEquals(dog1, dog1.compareAge(dog1, dog2));
	}
}
