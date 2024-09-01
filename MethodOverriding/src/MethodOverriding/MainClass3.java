package MethodOverriding;

public class MainClass3 {
	public static void main(String[] args) {
		WildAnimal w1=(WildAnimal) new Lion();
		System.out.println("----------This is Lion to WildAnimal upcasting ------- -----");
		w1.hunt();
		w1.roam();
		
		Animal a=(Animal) new WildAnimal();
		 System.out.println("-------This is  WildAnimal to Animal upcasting------ -----");
		a.roam();
		
		WildAnimal w2=(WildAnimal)a;
		System.out.println("-------This is  Animal to WildAnimal Downcasting------ -----");
		w2.hunt();
		w2.roam();
		Lion l1=(Lion)w1;
		System.out.println("-------This is   WildAnimal to Lion Downcasting------ -----");
		l1.roam();
		l1.hunt();
		l1.ruler();
		
	
		
	}

}
