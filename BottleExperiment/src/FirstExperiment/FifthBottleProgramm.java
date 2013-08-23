package FirstExperiment;

import java.util.ArrayList;
import java.util.Collections;
//import java.util.Iterator;
import java.util.List;
import java.util.SortedSet;

public class FifthBottleProgramm {
	public static void main(String[] args) {

		List<Bottle> kasten = new ArrayList<Bottle>();
		Bottle wasser = new Bottle();
		wasser.setVolume(1000);
		wasser.setFilled(500);
		wasser.setLabel("Wasser");
		kasten.add(wasser);
		Bottle saft = new Bottle();
		saft.setVolume(1000);
		saft.setFilled(300);
		saft.setLabel("Saft");
		kasten.add(saft);
		Bottle milch = new Bottle();
		milch.setVolume(700);
		milch.setFilled(200);
		milch.setLabel("Milch");
		kasten.add(milch);

		System.out.println("Im Kasten: " + kasten.toString());
		System.out.println("Sortiert (von Hand): " + sortBottlesByHand(kasten));
		
		Collections.sort(kasten);
		System.out.println("Sortiert (automatisch): " + kasten);
		

	}

	/**
	 * Sorts the given list of bottles by size: First by volume (ascending) and
	 * (if volume is equal) by filled.
	 * 
	 * @param bottles
	 *            the bottles to sort
	 * @return a list of bottles sorted by size (see above)
	 */
	private static List<Bottle> sortBottlesByHand(List<Bottle> bottles) {
		List<Bottle> sortedBottles = new ArrayList<Bottle>(bottles.size());
		List<Bottle> bottlesToSort = new ArrayList<Bottle>(bottles);

		while (bottlesToSort.size() > 0) {
			// find smallest bottle in bootlesToSort
			int smallest = 0;
			Bottle smallestBottle = bottlesToSort.get(0);
			for (int i = 0; i < bottlesToSort.size(); i++) {
				Bottle currentBottle = bottlesToSort.get(i);
				int smallestVolume = smallestBottle.getVolume();
				int currentVolume = currentBottle.getVolume();
				if (currentVolume < smallestVolume ||
						(currentVolume == smallestVolume && currentBottle.getFilled() < smallestBottle.getFilled())) {
					smallestBottle = currentBottle;
					smallest = i;
				}
			}

			// remove smallest from bottles to sort and and to sorted list
			bottlesToSort.remove(smallest);
			sortedBottles.add(smallestBottle);
		}

		return sortedBottles;
	}
}