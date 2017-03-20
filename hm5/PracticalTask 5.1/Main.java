
public class Main {

	public static void main(String[] args) {
		Animal[] arr = new Animal[4];
		arr[0] = new Dog("Lonk");
        arr[1] = new Cat("Janky");
        arr[2] = new Dog("D-dog");
        arr[3] = new Cat("Qiwi");
       
       
        for(Animal a : arr){
        	
        	System.out.println(a);
        	a.feed();
        	a.voice();
      
        
        }
	}

}
