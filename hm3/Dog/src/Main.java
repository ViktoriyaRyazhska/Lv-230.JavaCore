
public class Main {

	public static void main(String[] args) {
		Dog dog1 = new Dog();
		dog1.setName("Blind");
        dog1.setAge("15");
        dog1.setBreed("shepherd");
       Dog dog2 = new Dog();
       dog2.setName("Jack");
       dog2.setBreed("pug");
       dog2.setAge("10");
        Dog dog3 = new Dog();
        dog3.setName("Crazy");
        dog3.setBreed("Dalmatian");
        
        System.out.println(dog1.getName() + " is the oldest dog?");
        System.out.println(dog1.oldestDog(dog2) && dog1.oldestDog(dog2));
       
        System.out.println("The oldest dog name is " + dog1.getName() +"." + " His breed is  " + dog1.getBreed() + " and his age is " + dog1.getAge() + " age");
     
        }
		

	}


