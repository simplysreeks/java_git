package Abstract;

abstract class A {
	abstract public void test();
}
class B extends A{
	public void test() {
		System.out.println(" test Completed ..");
	}
}
public class MainClass1 {
	public static void main(String[] args) {
		B b=new B();
		b.test();
	}

}
