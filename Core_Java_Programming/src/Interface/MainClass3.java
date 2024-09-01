package Interface;

interface sample7{
	void test4();

	void test5();
}
interface sample8 extends sample7{
	void test5();
}
interface sample9 extends sample7{
	void test6();
}
class Demo4 implements sample9{

	@Override
	public void test5() {
		// TODO Auto-generated method stub
		System.out.println("*******");
		
	}

	@Override
	public void test4() {
		// TODO Auto-generated method stub
		System.out.println(",,,,,,,");
		
	}

	@Override
	public void test6() {
		// TODO Auto-generated method stub
		System.out.println("--------");
		
	}
	
}
public class MainClass3 {
	
	public static void main(String[] args) {
		Demo4 d4 = new Demo4();
		d4.test4();
		d4.test5();
		d4.test6();
	}

}
