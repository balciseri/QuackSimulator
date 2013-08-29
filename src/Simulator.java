
public class Simulator {
		public static void main(String[] args) {
			
			IQuackable q1 = new MallardDuck();
			IQuackable q2 = new RedHeadDuck();
			IQuackable q3 = new RubberDuck();
			IQuackable q4 = new DuckCall();
			
			System.out.println("DUCK SIMULATOR");
			
			q1.Quack();
			q2.Quack();
			q3.Quack();
			q4.Quack();
			
		}
}
