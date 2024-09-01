package Interface;

interface sample12{
	void test10();

	void test12();
}
interface sample13{
	void test11();
}
interface sample14 extends sample12,sample13{
	void test12();
}
class Demo7 implements sample12{
	@Override
	public void test10() {
		System.out.println("@@@@@@@");
		
	}
	public void test11() {
		System.out.println("--------");
	}
	@Override
	public void test12() {
		System.out.println("&&&&&&&&&");		
	}
	
}
public class MainClass5 {
	public static void main(String[] args) {
		Demo7 d7 = new Demo7();
		d7.test10();
		d7.test11();
		d7.test12();
	}

}
