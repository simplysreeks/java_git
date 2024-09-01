package MethodOverriding;

public class MainClass5 {
	public static void main(String[] args) {
		Animal a5=(Animal) new Lion(); //upcasting
		System.out.println("----------This is Lion to WildAnimal upcasting ------- -----");
		a5.roam();
		WildAnimal w5 = (WildAnimal) a5;
		 System.out.println("-------This is Animal to WildAnimal downcasting------ -----");
		
		w5.roam();
		w5.hunt();
		Lion l5=(Lion)a5;
		System.out.println("----------This is  WildAnimal to Lion Down casting -----");
		l5.roam();
		l5.hunt();
		l5.ruler();
	}

}
