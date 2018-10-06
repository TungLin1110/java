package exe10_17;

public class Bicycle implements CarbonFootprint{
	
	private final double cf_per_wheelcycle = 0.05;
	private String color;
	private double wheelcycle;
	
	public Bicycle(String color, double wheelcycle) {
		this.color = color;
		this.wheelcycle = wheelcycle;
	}


	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getWheelcycle() {
		return wheelcycle;
	}

	public void setWheelcycle(double wheelcycle) {
		this.wheelcycle = wheelcycle;
	}
	
	@Override
	public String toString() {
		return String.format("%s bicycle:", getColor());
	}
	
	@Override
	public double getCarbonFootprint() {
		return getWheelcycle() * cf_per_wheelcycle;
	}
}
