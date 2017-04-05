package softserve.javacore.project;

public class EndStage extends Manager implements CalculationPercent {
	private double number_of_worked_hours;
	private String partner;
	
	public EndStage(String name, BisnecRegion region, String partner, double number_of_worked_hours) {
		super(name, region);
		this.partner = partner;
		this.number_of_worked_hours = number_of_worked_hours;
	}

	@Override
	public double calculatePercent() {
		
		return ((this.number_of_worked_hours * 80) / 100);
	}
	
	@Override
	public String toString() {
		return   super.getName() +" region " + super.getRegion() +" END: "+partner; 
	}

	public String getManager() {
		return super.getName();
	}
}
