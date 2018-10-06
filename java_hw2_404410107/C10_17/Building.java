package exe10_17;

public class Building implements CarbonFootprint{

	private final double cf_per_Watt = 0.623;
	private double watt;
	private String type;
	
	
	public Building(double watt, String type) {
		this.watt = watt;
		this.type = type;
	}


	public double getWatt() {
		return watt;
	}



	public void setWatt(double watt) {
		this.watt = watt;
	}



	public String getType() {
		return type;
	}



	public void setType(String type) {
		this.type = type;
	}



	@Override
	public String toString() {
		return String.format("%s building:", getType());
	}
	
	@Override
	public double getCarbonFootprint() {
		return getWatt() * cf_per_Watt;
	}
}
