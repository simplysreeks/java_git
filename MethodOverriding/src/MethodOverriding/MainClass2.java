package MethodOverriding;


  abstract  class Contact {
        public void ringtone() {
            System.out.println("Original company ringtone");
        }
    }
    class MotherContact extends Contact{
    	@Override
      public void ringtone() {
          System.out.println("pedeve palikina matalone teeyani mate amma ..");
      }
  }
    class OtherContact extends Contact{
    
    	
     
  }
   

    class FriendContact extends Contact {
    	@Override
        public void ringtone() {
            System.out.println("Dosthi..........");
        }
    }

     

        

       
        
    
public class MainClass2 {

    public static void main(String[] args) {
        MotherContact mc = new MotherContact();
        OtherContact oc = new OtherContact();
        FriendContact fc= new FriendContact();
        mc.ringtone();
        oc.ringtone();
        fc.ringtone();
        
        
    }
    
}
