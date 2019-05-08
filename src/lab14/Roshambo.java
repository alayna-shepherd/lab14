package lab14;

public enum Roshambo {

	ROCK, PAPER, SCISSORS;
	public String toString() {
		switch (this) {
		case ROCK:
			return "rocc";
		case PAPER:
			return "paperr";
		case SCISSORS:
			return "sza";
		default:
			return "who?? what??";
		}
}
}