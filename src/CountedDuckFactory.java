
public class CountedDuckFactory extends AbstractDuckFactory {

	@Override
	public IQuackable CreateMallarDuck() {
		return new QuackCounter(new MallardDuck());
	}

	@Override
	public IQuackable CreateRedHeadDuck() {
		return new QuackCounter(new RedHeadDuck());
	}

	@Override
	public IQuackable CreateRubberDuck() {
		return new QuackCounter(new RubberDuck());
	}

	@Override
	public IQuackable CreateDuckCall() {
		return new QuackCounter(new DuckCall());
	}

}
