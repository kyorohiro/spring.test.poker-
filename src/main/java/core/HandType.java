package core;


public enum HandType {
	STRAIGHT_FLUSH("Straight Flush"),
	FOUR("Four of a Kind"),
	FULL_HOUSE("Full House"),
	FLUSH("Flush"),
	STRAIGHT("Straight"),
	THREE("Three of a Kind"),
	TWO("Two Pairs"),
	ONE("One Pairs"),
	NO_PAIRS("No Pairs");

	final private String name;
	HandType(String name){
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
}