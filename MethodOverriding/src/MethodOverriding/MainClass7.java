package MethodOverriding;

public class MainClass7 {
	public static void main(String[] args) {
		WildAnimal w7=(WildAnimal)new Lion();
		System.out.println("----------This is Lion to WildAnimal upcasting ------- -----");
		
		w7.roam();
		w7.hunt();
		Lion l7=(Lion)w7;
		System.out.println("-------This is   WildAnimal to Lion Downcasting------ -----");
		l7.roam();
		l7.hunt();
		l7.ruler();
	}

}
