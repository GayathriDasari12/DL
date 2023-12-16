
public class Expli {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double d = 90.0;
		float f = (float)d;
		char ch2 = (char)f;
		System.out.println(ch2);

		long l = 69;
		char ch1 = (char)l;
		System.out.println(ch1);

		int i = (int)l;
		char ch3 = (char)i;
		System.out.println(ch3);

		
		short s = (short)i;
		byte b = (byte)s;
		
		
		System.out.println(d);
		System.out.println(f);
		System.out.println(l);
		System.out.println(i);
		System.out.println(s);
		System.out.println(b);
		
		
		char ch = 'b';
		int i1 = ch;
		long l1 = ch;
		float f1 = ch;
		System.out.println(i1);
		System.out.println(l1);
		System.out.println(f1);


		
	}

}
