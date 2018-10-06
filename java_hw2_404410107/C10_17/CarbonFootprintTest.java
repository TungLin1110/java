package exe10_17;

import java.util.ArrayList;

public class CarbonFootprintTest {

	public static void main(String[] args) {

		ArrayList<CarbonFootprint> fpGenerator = new ArrayList<>();
		
		fpGenerator.add(new Bicycle("Yellow", 1000));
		fpGenerator.add(new Car("slow", 50));
		fpGenerator.add(new Building(80, "tall"));
		
		for (CarbonFootprint gen : fpGenerator){
			System.out.println(gen);
			System.out.printf("Footprint is %.2f%n", gen.getCarbonFootprint());
		}
	}
}
