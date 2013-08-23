package FirstExperiment;

public class thirdBottleProgramm {

public static void main(String[] args) {
	Bottle firstBottle;
	Bottle secondBottle;
	Bottle thirdBottle;
	
	firstBottle = new Bottle();
	secondBottle = new Bottle();
	thirdBottle = new Bottle();
	
	firstBottle.setVolume(3000);
	secondBottle.setVolume(5000);
	thirdBottle.setVolume(5000);
	
	firstBottle.setFilled(3000);
	secondBottle.setFilled(5000);
	thirdBottle.setFilled(5000);
	
	firstBottle.empty();
	firstBottle.fill(secondBottle);
	firstBottle.empty();
	firstBottle.fill(thirdBottle);
	secondBottle.fill(thirdBottle);
	
	System.out.println(String.format("The second bottle is filled with %d ml of water.", secondBottle.getFilled()));
}
	
}
