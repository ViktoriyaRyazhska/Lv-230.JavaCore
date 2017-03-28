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
	        
		Set<String> set = new HashSet(peoples.values());
		 if(peoples.values().size()-set.size()>=2){
			 System.out.println("yes-there*re 2 or more persons with the same last names");
			 
		 }
		



        
 
 
        
 
			
		
	}
}
	


