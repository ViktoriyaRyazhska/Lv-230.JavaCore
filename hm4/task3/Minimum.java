

public class Minimum {

	public static void main(String[] args)  {
		
		int numbers[] = new int[5];
		
		for(int i=0; i<numbers.length; i++){
			numbers[i]=(int) (-5+Math.random()*22);
		}
		positionOfSecondPositive(numbers);
		minimum(numbers);
	}
		
		public static void positionOfSecondPositive(int[] numbers){
			int position = 0;
			for(int i=0; i < numbers.length;i++){
			if(numbers[i]>0){
				position++;
				if(position==2){
					System.out.println("The second positive numer is " + i+1);
					break;
				}
			}
			}
		}
			public static void minimum(int[] numbers){
				int minimum = numbers[0];
				int position = 0;
				for(int i = 0;i<numbers.length;i++){
					if(minimum>numbers[i]){
						minimum = numbers[i];
						position = i+1;
						
					}
				}
				System.out.println("The minimum number is " + minimum + " and his position is " + position);
				
				
			}

}
	


