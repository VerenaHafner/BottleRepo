package FirstExperiment;

public class SecondBottleProgramm {

public static void main(String[] args) {
	Bottle firstBottle;
	Bottle secondBottle;
	
	firstBottle = new Bottle();
	secondBottle = new Bottle();
	
	firstBottle.setVolume(1000);
	secondBottle.setVolume(1500);
	
	firstBottle.setFilled(0);
	secondBottle.setFilled(0);
	
	firstBottle.fill(secondBottle);
	
	System.out.println(String.format("The first bottle is filled with %d ml of water.", firstBottle.getFilled()));
	System.out.println(String.format("The second bottle is filled with %d ml of water.", secondBottle.getFilled()));
}
	
}
