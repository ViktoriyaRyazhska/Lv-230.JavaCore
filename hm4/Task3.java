public class Task3 {
    public static void main(String[] args) {
        int[] array = new int[5];
        for(int i=0; i<array.length; i++){
            array[i]=(int) (-5+Math.random()*22);
        }


        positionOfSecondPositiveNumber(array);
        min(array);
    }
    public static void positionOfSecondPositiveNumber(int[] array){
        int pos = 0;
        for(int i=0; i<array.length; i++){
                if(array[i]>0) {
                    pos++;
                    if (pos == 2) {
                        System.out.println(i + 1);
                        break;
                    }
                }
        }
    }

    public static void min(int[] array){
        int min = array[0];
        int pos = 0;
        for(int i=0; i<array.length; i++){
            if(min>array[i]){
                min = array[i];
                pos=i+1;
            }
        }
        System.out.printf("Min numb = %d, position of this number is: %d",min,pos);
    }
}
