
public class Simulator {
		public static void main(String[] args) {
			
			AbstractDuckFactory fact = new CountedDuckFactory();
			
			
			IQuackable q1 = fact.CreateMallarDuck();		//pattern abstractfactory
			IQuackable q2 = fact.CreateRedHeadDuck();		//''
			IQuackable q3 = fact.CreateRubberDuck();		//''
			IQuackable q4 = fact.CreateDuckCall();			//''
			IQuackable q5 = new GooseAdapter(new Goose());	//pattern adapter 
			
//ega
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
