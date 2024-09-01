package Interface;

interface sample1{
	void test1();
}
class Demo1 implements sample1{
	@Override
	public void test1() {
		System.out.println("...........");
	}
}
public class MainClass1 {
	public static void main(String[] args) {
		Demo1 d= new Demo1();
		d.test1();
	}

}
