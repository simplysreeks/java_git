package MethodOverriding;

public class MainClass8 {
	public static void main(String[] args) {
		Animal a8=(Animal) new WildAnimal();
		System.out.println("-----------WildAnimal to Animal UpperCasting--------------");
		a8.roam();
		WildAnimal w8=(WildAnimal) a8;
		System.out.println("-----------Animal to WildAnimal DownCasting---------------");
		w8.roam();
		w8.hunt();
	}

}
