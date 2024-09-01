package Interface;

interface sample9{
	void test7();
}
interface sample10 extends sample9{
	void test8();
	
}
interface sample11  extends sample9{
	void test9();

	
}
class Demo5 implements sample11{

	@Override
	public void test9() {
				System.out.println("----------");
	}
	@Override
	public void test7() {
				System.out.println("********");
	}
}
class Demo6 implements sample10{

	@Override
	public void test7() {
		// TODO Auto-generated method stub
		System.out.println("...........");
		
		
	}

	@Override
	public void test8() {
		// TODO Auto-generated method stub
		System.out.println("!!!!!!!!!!!!");
		
		
	}

	
}

public class Mainclass4 {
	public static void main(String[] args)
	{
	
		Demo5 d5 = new Demo5();
		d5.test7();
		d5.test9();
		Demo6 d6 = new Demo6();
		d6.test7();
		d6.test8();
	}
}
