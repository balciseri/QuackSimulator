
public class QuackCounter implements IQuackable {
	
	IQuackable quacker;
	private static long numberOfQuack = 0;
	
	public static long getNumberOfQuack() {
		return numberOfQuack;
	}

	public QuackCounter(IQuackable quacker) {
		this.quacker = quacker;
	}

	@Override
	public void Quack() {
		numberOfQuack++;
		quacker.Quack();

	}

}
