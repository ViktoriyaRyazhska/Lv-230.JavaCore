package softserve.javacore.project;

public class StartStage extends Manager implements CalculationPercent {
	private double number_of_worked_hours;
	private String partner;
	
	public StartStage(String name, BisnecRegion region, String partner, double number_of_worked_hours) {
		super(name, region);
		this.partner = partner;
		this.number_of_worked_hours = number_of_worked_hours;
	}

	@Override
	public double calculatePercent() {
		return ((this.number_of_worked_hours * 40) / 100);
	}

	@Override
	public String toString() {
		return   super.getName() +" region " + super.getRegion() +" START: "+partner; 
	}

	public String getManager() {
		return super.getName();
	}

	

}
