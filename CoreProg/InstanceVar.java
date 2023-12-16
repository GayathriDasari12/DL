
public class InstanceVar {
 int a=10;
 int b=20;
 static int c = 30;
 
 
 public void m1() {
	 System.out.println("Instance Block");

	 System.out.println(a);
	 System.out.println(b);

	 System.out.println(c);

 }
 
 public static void m2() {
	 System.out.println("Static Block");

	 System.out.println(c);
 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new InstanceVar().m1();
m2();
	}

}
