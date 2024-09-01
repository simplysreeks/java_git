package Interface;


interface sample4{
	void test4();
}
interface sample5 extends sample4{
	void test5();
}
interface sample6 extends sample4{
	void test6();
}
class Demo3 implements sample6{
	public void test4() {
		System.out.println("..........");
	}
	public void test5() {
		System.out.println("***********");
	}
	public void test6() {
		System.out.println("------------");
	}
public class MainClass2 {
	public static void main() {
		Demo3 d3= new Demo3();
		d3.test4();
		d3.test5();
		d3.test6();
		
	}
			
		}
	

}
