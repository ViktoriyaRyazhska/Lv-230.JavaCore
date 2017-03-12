import java.util.ArrayList;

/**
 * Created by forest on 12.03.2017.
 */
public class Dog {
    private String name;
    private int age;
    BreedOfDogs breedOfDogs ;

    public Dog(String name, int age, BreedOfDogs breedOfDogs) {
        this.name = name;
        this.age = age;
        this.breedOfDogs = breedOfDogs;
    }

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
        this.breedOfDogs = BreedOfDogs.STRAY_DOG;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Name of dog: "+name+", age is: "+age+", breed is: "+breedOfDogs;
    }

    public static void main(String[] args) {
        ArrayList<Dog> dogArrayList = new ArrayList<>();
        Dog d1 = new Dog("Chelsea", 1, BreedOfDogs.PEMBROKE_WELSH_CORGI);
        Dog d2 = new Dog("Ema", 2, BreedOfDogs.BEAGLE);
        Dog d3 = new Dog("Topik", 6);
        Dog d4 = new Dog("Sharik", 4, BreedOfDogs.BUKKMASTIFF);
        Dog d5 = new Dog("Sharik", 3, BreedOfDogs.ALASKAN_MALAMUTE);

        dogArrayList.add(d1);
        dogArrayList.add(d2);
        dogArrayList.add(d3);
        dogArrayList.add(d4);
        dogArrayList.add(d5);


        isSameName(dogArrayList);
        oldestDog(dogArrayList);
    }

    public static void oldestDog(ArrayList<Dog> listOfDogs){
        Dog temp = listOfDogs.get(0);
        for(Dog d:listOfDogs){
            if(temp.getAge()<d.getAge()){
                temp=d;
            }
        }
        System.out.println("Oldest dog is: "+temp.getName()+", age is: "+temp.getAge());
    }

    public static void isSameName(ArrayList<Dog> listOfDogs){
        for(int i=0; i<listOfDogs.size(); i++){
            Dog temp=listOfDogs.get(i);

            for(int j=i+1; j<listOfDogs.size(); j++){
                if(temp.getName().equals(listOfDogs.get(j).getName())){
                    System.out.println(temp+" - have equal name like dog: "+listOfDogs.get(j));
                }
            }

        }
    }
}
