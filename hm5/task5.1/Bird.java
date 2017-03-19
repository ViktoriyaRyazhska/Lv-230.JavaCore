
public abstract class Bird {

	private String feathers;
	private String layeggs;
	
	public abstract void fly();


public Bird(String feathers,String layeggs){
	this.feathers = feathers;
    this.layeggs = layeggs;

}
	
public String getFeathers(){
	return feathers;
}
public void setFeathers(String feathers){
	this.feathers = feathers;
}

public String getLayEggs(){
	return layeggs;
}
public void setLayEggs(String layeggs){
	this.layeggs = layeggs;
}



@Override
public String toString(){
	return getClass().getName()+" - "+getFeathers()+", "+getLayEggs()+". ";
}



}

