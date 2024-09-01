package Abstract;

abstract class Kavacha{
	abstract public void getPowerOfAsthra();
}
class Karna extends Kavacha{
	@Override
	public void getPowerOfAsthra() {
		System.out.println("get default power first");
	}
	
}
class Indra extends Kavacha{
	@Override
	public void getPowerOfAsthra() {
		System.out.println("got powers by cheating karna");
	}
	
}
public class MainClass2 {
	public static void main(String[] args) {
		
		Karna k= new Karna();
		k.getPowerOfAsthra();
		Indra i = new Indra();
		i.getPowerOfAsthra();
	}

}
