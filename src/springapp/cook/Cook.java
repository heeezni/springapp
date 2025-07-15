package springapp.cook;

public class Cook {
	Fripan pan;

	public Cook() {
		pan = new Fripan();
	}

	// 음식을 만드는 행위
	public void makeFood() {
		pan.boil();
	}
}
