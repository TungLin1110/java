package exe10_17;

public class Car implements CarbonFootprint{
	
	private final double cf_per_km = 0.24;
	private String speed;
	private double distance;
	
	public Car(String model, double distance) {
		this.speed = speed;
		this.distance = distance;
	}

	public String getSpeed() {
		return speed;
	}

	public void setSpeed(String speed) {
		this.speed = speed;
	}

	public double getDistance() {
		return distance;
	}

	public void setDistance(double distance) {
		this.distance = distance;
	}

	
	@Override
	public String toString() {
		return String.format("%s car:", getSpeed());
	}
	
	@Override
	public double getCarbonFootprint() {
		return getDistance() * cf_per_km;
	}
}
