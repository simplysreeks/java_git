package MethodOverriding;

public class Animal {
	public void roam() {
		System.out.println("Animals roam in jungle ");
	}

}
class WildAnimal extends Animal{
	public void hunt() {
		System.out.println("Wild Animal does Hunting ");
		
	}
	
}
class Lion extends WildAnimal{
	public void ruler() {
		System.out.println("Lion is the ruler of jungle");
	}
}

