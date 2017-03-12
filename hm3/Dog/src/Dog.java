
public class Dog {
private String name;
private int age;
private String breed;

public Dog(){
	
}
public Dog(String name){
	this.name = name;
}
public String getName(){
	return name;
}
public void setName(String name){
	this.name = name;
}
public String getBreed(){
	return breed;
}
public void setBreed(String breed){
	this.breed = breed;
}
public int getAge(){
	return age;
}
	public void setAge(String age){
	this.age = Integer.parseInt(age);
}
	public boolean oldestDog(Dog dog) {
		
		return this.getAge() > dog.getAge();
				
		}









}
