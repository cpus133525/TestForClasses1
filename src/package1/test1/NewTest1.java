package package1.test1;

public class NewTest1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int a,b,c;
		a=1;
		b=2;
		c=NewClass.abc(a, b);
		double d,e,f;
		d=1.5;
		e=5.6;
		f=NewClass.abc(d, e);
		System.out.println("c="+c+" f="+f);

	}

}

class NewTest2 {
	public int add(int a, int b) {
		return a + b;
	}
	class InnerClass {
		int a = 1;
		public void dosth() {
			System.out.println(add(a,a));
		}
	}
}