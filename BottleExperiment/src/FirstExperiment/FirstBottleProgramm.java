package FirstExperiment;

public class FirstBottleProgramm {
	
/**
 * @param 
 */
public static void main(String[] args) {
	Bottle smallBottle; 
	Bottle bigBottle;
	
	smallBottle = new Bottle();
	bigBottle = new Bottle("BIG");
	
	bigBottle.setVolume(1000);
	smallBottle.setVolume(250);

	
	for (int water = 1; water < 10; water++) {
		if (water < 5) {
			smallBottle.fill(water);
		}
		else {
			bigBottle.fill(water);
		} 
	}
	
	System.out.println(String.format("The small bottle is filled with %d ml of water.", smallBottle.getFilled()));
	System.out.println(String.format("The big bottle is filled with %d ml of water.", bigBottle.getFilled()));
}

}

