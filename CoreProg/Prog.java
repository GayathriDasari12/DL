
public class Prog {
int a =10;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.out.println(new Prog().a);
	    new Prog().m1();
	    System.out.println(new Prog().add(165, 20));
	}

	public void m1() {
		System.out.println("M1 method");
	}
	
	public Prog() {
		System.out.println("Default constructor");
	}
	
	public int add(int a, int b) {
		return a+b;
	}
	
	
}
