package FirstExperiment;

public class Bottle implements Comparable<Bottle> {
	private int volume;
	private int filled;
	private String label;

	public Bottle() {
		volume = 250;
	}

	public Bottle(String xxx) {
		label = xxx;
	}

	public void empty() {
		filled = 0;
	}
	
	/**
	 * The bottle gets filled with the water of a given bottle until this bottle is full or the given bottle is empty.
	 * @param source defines the bottle of which the water is taken to fill this bottle
	 */
	public void fill(Bottle source) {
		int newFilled = filled + source.getFilled();
		filled = newFilled;
		if (newFilled > volume){
			filled = volume;
		}
		else { 
			setFilled(newFilled);
		}
		source.setFilled(newFilled - filled);
	}

	public int fill(int amount) {
		filled = filled + amount;
		if (filled > volume) {
			filled = volume; 
		}
//		filled = Math.min(filled + amount, volume);
		return filled;
	}

	public void fill() {
		filled = volume;
	}

	public int getVolume() {
		return volume;
	}

	public void setVolume(int volume) {
		this.volume = volume;
	}

	@Override
	public String toString() {
		return String.format("%s: %d/%d", label, filled, volume);
	}

	public int getFilled() {
		return filled;
	}

	public void setFilled(int filled) {
		this.filled = filled;
	}

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	/**
	 * Compares this bottle to a given bottle. This bottle is smaller, if this volume is smaller than the other's volume. In case of equality, filled is used to decide.
	 * @param o the bottle to compare this bottle to
	 * @return -1, 0, 1 depending on result
	 */
	@Override
	public int compareTo(Bottle other) {
		if (this.volume < other.volume) {
			return -1;
		}
		else if(this.volume == other.volume) {
			if (this.filled < other.filled) {
				return -1;
			}
			else if(this.filled == other.filled) {
				return 0;
			}
			else {
				return 1;
			}
		}
		else {
			return 1;
		}
	}

}