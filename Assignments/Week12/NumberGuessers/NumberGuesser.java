package Assignments.Week12.NumberGuessers;

public class NumberGuesser {
	
	protected int high;
	protected int low;
	
	private int originalHigh;
	private int originalLow;
	
	public NumberGuesser(int l, int h) {
		low = originalLow = l;
		high = originalHigh = h;
	}
	
	public int getCurrentGuess() {
		return (high + low) / 2;
	}
	
	public void higher() throws IllegalStateException {
		low = getCurrentGuess() + 1;

		if ((low - 1) >= high) {
			throw new IllegalStateException("We guessed your number already! Try again!");
		}
	}
	
	public void lower() throws IllegalStateException {
		high = getCurrentGuess() - 1;

		if ((high + 1) <= low) {
			throw new IllegalStateException("We guessed your number already! Try again!");
		}
	}
	
	public void reset() {
		low = originalLow;
		high = originalHigh;
	}
}