import java.awt.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Persons {

	public static void main(String[] args) {
		
		Map<String, String> peoples = new HashMap<String, String>();
		peoples.put("Andriy", "Yurkiv");
		peoples.put("Mykola", "Malius");
		peoples.put("Orest", "Oliynuk");
		peoples.put("Oleg", "Ozhibko");
		peoples.put("John", "Sailor");
		peoples.put("John", "Jackson");
		peoples.put("Oleg", "Pan`kiv");
		peoples.put("Petro", "Zibrov");
		peoples.put("Viktor", "Yushchenko");
		peoples.put("Lesuk", "Fedorenko");
		peoples.put("Oleg", "Poll");
		
		System.out.println(peoples);
		
                peoples.remove("Orest");
	        System.out.println(peoples + " Without Orest");
	        
		// i dont know----
		//There are at less two persons with the same firstName among these 10 people?
		



        
 
 
        
 
			
		
	}
}
	


