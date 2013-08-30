
public class Simulator {
		public static void main(String[] args) {
			
			IQuackable q1 = new QuackCounter( new MallardDuck() );		//pattern decorator
			IQuackable q2 = new QuackCounter( new RedHeadDuck() );		//''
			IQuackable q3 = new QuackCounter( new RubberDuck() );		//''
			IQuackable q4 = new QuackCounter( new DuckCall() );			//''
			IQuackable q5 = new GooseAdapter(new Goose());				//pattern adapter 
			
			System.out.println("DUCK SIMULATOR");
			
			Simulate(q1);
			Simulate(q2);
			Simulate(q3);
			Simulate(q4);
			Simulate(q5);
			
			System.out.println("Ho sentito " + QuackCounter.getNumberOfQuack() + " quack!");
			
			
		}
		
		
		static void Simulate(IQuackable q){
			q.Quack();
		}
}
