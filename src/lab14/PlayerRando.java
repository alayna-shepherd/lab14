package lab14;

public abstract class PlayerRando extends Player {

	@Override
	public void getRoshambo() {
		for (int i = 0; i < 3; i++) {
			int randomNum = (int) (Math.random() * 10);

		}

	}
}