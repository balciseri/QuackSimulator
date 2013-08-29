
public class GooseAdapter implements IQuackable {

	Goose adaptee;
	
	
	public GooseAdapter(Goose adaptee) {
		this.adaptee = adaptee;
	}


	@Override
	public void Quack() {
		adaptee.Honk();

	}

}
