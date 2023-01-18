import java.util.Random;


public class Die {

	public int getRoll() {
		Random rand = new Random();
		int face = 1+rand.nextInt(6);
		return face;
	}
}

