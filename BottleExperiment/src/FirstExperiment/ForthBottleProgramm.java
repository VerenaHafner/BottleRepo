package FirstExperiment;

//import java.util.ArrayList;
//import java.util.Iterator;
import java.util.HashSet;
//import java.util.List;
import java.util.Set;

public class ForthBottleProgramm {
	public static void main(String[] args) {
		//bei einer ArrayList kann auf ein bestimmtes Element über dessen Position in der Liste / Index zugegriffen werden
		//in Listen dürfen Elemente mehrfach auftreten
//		List<String> kasten = new ArrayList<String>();
//		Set<Bottle> korb = new HashSet<Bottle>();
//		kasten.add(0, "H");
//		kasten.add(1, "a");
//		kasten.add(2, "l");
//		kasten.add(3, "l");
//		kasten.add(4, "o");
//		kasten.clear();
		
		Set<Bottle> flaschenKorb = new HashSet<Bottle>();
		Bottle coke = new Bottle();
		coke.setVolume(1000);
		coke.setFilled(500);
		coke.setLabel("CokeBottle");
		Bottle beer = new Bottle();
		beer.setVolume(1000);
		beer.setFilled(250);
		beer.setLabel("BeerBottle");
		flaschenKorb.add(coke);
		flaschenKorb.add(beer);
		
		System.out.println(flaschenKorb);

//	for (String eachBottle : kasten) {
//		System.out.println(eachBottle);
//	}
//	
//	for (int i = kasten.size(); i >= 0; i = i-2) {
//		String eachBottle = kasten.get(i);
//		System.out.println(eachBottle);
//	}
//	
//	for (Iterator<String> iterator = kasten.iterator(); iterator.hasNext();) {
//		String string = iterator.next();
//		System.out.println(string);
//	}

}

}