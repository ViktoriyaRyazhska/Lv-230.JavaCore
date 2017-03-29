
public class Main {

	public static void main(String[] args) {
		   try {
			      Plants[] pl = new Plants[5];
			      pl[0] = new Plants("roses","blue", 3);
			      pl[1] = new Plants("marigold","red", 3);
			      pl[2] = new Plants("chamomile","white", 3);
			      pl[3] = new Plants("roses","red", 3);
			      pl[4] = new Plants("chamomile","blue", 3);
			      for(Plants a : pl){
			    	  System.out.println(a);
			      }
			      
			   } catch (ColorException | TypeException e) {
			      System.err.println(e.getMessage() + "\n");
			      e.printStackTrace();
			   }


	}

}
