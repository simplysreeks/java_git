package MethodOverriding;

public class MainClass4 {
    public static void main(String[] args) {
        WildAnimal w4 = (WildAnimal) new Lion(); 
        System.out.println("----------This is Lion to WildAnimal upcasting ------- -----");
        w4.hunt(); 
        w4.roam();
        

        Animal a4 = (Animal) new WildAnimal();
        System.out.println("-------This is  WildAnimal to Animal upcasting------ -----");
        a4.roam();
        

        Lion l4 = (Lion) w4; 
        System.out.println("----------This is  Animal to Lion Down casting -----");
        l4.roam();
        l4.hunt();
        l4.ruler();
        
        
    }
}