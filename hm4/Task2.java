public class Task2 {
    public static void main(String[] args) {
        int[] array = new int[10];
        for(int i=0; i<array.length; i++){
            array[i]=(int) (-5+Math.random()*22);
        }

        sum(array);
    }
    public static void sum(int[] array){
        int sum = 0;
        for(int i=0; i<array.length; i++) {
            if (array[i] >= 0) {
                if (i == 4){
                    System.out.println("Sum is = "+sum);
                    break;
                }
                sum += array[i];
            }else {
                product(array);
                break;
            }
        }
    }
    public static void product(int[] array){
        int product = 1;
        for(int i=5; i<array.length; i++) {
            product*=array[i];
        }
        System.out.println("Product = "+product);
    }

    }
