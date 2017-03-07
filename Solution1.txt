            /*
             * To change this license header, choose License Headers in Project Properties.
             * To change this template file, choose Tools | Templates
             * and open the template in the editor.
             */
            package solution1;

            import java.io.BufferedReader;
            import java.io.IOException;
            import java.io.InputStreamReader;
            import java.util.Random;

            /**
             *
             * @author Admin
             */
            public class Solution1 {

                /**
                 * @param args the command line arguments
                 */
                public static void main(String[] args) throws IOException{ 

                     BufferedReader br = new BufferedReader( new InputStreamReader(System.in));

                    // Flower bed is shaped like a circle. Calculate the perimeter and area by entering the radius. Output obtained results.
                    //Square of the cicle compute with formula PI*radius*radius

                     System.out.println("Input radius");
                     double radius = Double.parseDouble(br.readLine());
                     double area = Math.PI*radius*radius;
                     System.out.println("Square of the cicle: "+area);

                     //Perimeter of the cicle compute with formula 2*PI*radius
                     double per = 2*Math.PI*radius;
                     System.out.println("Perimeter of the cicle: "+per);

                     //Define string variable name and integer value age. Output question "What is your name?" 
                     //Read the value name and output next question: “Where are you live, (name)?". Read address and write whole information.
                     String name;
                     int age;
                     System.out.println("What is your name?");
                     name = br.readLine();
                     System.out.println("Where are you live, "+name+"?");
                     String address = br.readLine();
                     System.out.println("I live at the address "+address);

                    //Phone calls from three different countries are ñ1, ñ2 and ñ3 standard units per minute.
                    //Talks continued t1, t2 and t3 minutes. How much computer will count for each call separately and all talk together?
                    //Input all source data from console, make calculations and output to the screen. 
                    double total=0;

                    double[] massC = new double[3];
                    double[] massT = new double[3];
                    double[] massRes = new double[3];

                    Random random = new Random();
                    for (int i = 0; i < 3; i++) {
                        massC[i] = (random.nextDouble());
                        massT[i] = (random.nextDouble());
                       try{
                        massRes[i] = massC[i] * massT[i]; 
                        System.out.println((i+1)+" phone calls is "+massC[i]+" units per minute, talks continued "+massT[i]+" minutes.Count for call "+massRes[i]);
                             total = total + massRes[i];}
                            catch(ArithmeticException e){}
                    }
                        System.out.println("All talk together are "+total);
                }
            }
