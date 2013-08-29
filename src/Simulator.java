
public class Simulator {
		public static void main(String[] args) {
			
			IQuackable q1 = new MallardDuck();
			IQuackable q2 = new RedHeadDuck();
			IQuackable q3 = new RubberDuck();
			IQuackable q4 = new DuckCall();
			IQuackable q5 = new GooseAdapter(new Goose());
			
			System.out.println("DUCK SIMULATOR");
			
			Simulate(q1);
			Simulate(q2);
			Simulate(q3);
			Simulate(q4);
			Simulate(q5);
			
			
		}
		
		
		static void Simulate(IQuackable q){
			q.Quack();
		}
}
