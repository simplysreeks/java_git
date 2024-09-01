package MethodOverriding;

public class MainClass6 {
	public static void main(String[] args) {
		Animal a6=(Animal) new Lion();
		System.out.println("---------Lion to Animal UpperCasting----------");
		a6.roam();
		Lion l6=(Lion)a6;
		System.out.println("---------Animal to Lion  DownCasting-----------");
		l6.roam();
		l6.hunt();
		l6.ruler();
		
	}

}
