
public class Simulator {
		public static void main(String[] args) {
			
			IQuackable q1 = new MallardDuck();
			IQuackable q2 = new RedHeadDuck();
			
			System.out.println("DUCK SIMULATOR");
			
			q1.Quack();
			q2.Quack();
			
		}
}
