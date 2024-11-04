package Design_Pattern.Bridge_Design_Pattern.Abstraction;

import Design_Pattern.Bridge_Design_Pattern.Implementor.BreatheImplementor;

public class Dog extends LivingThings {

 public Dog(BreatheImplementor breatheImplementor){
    super(breatheImplementor);
 }
    @Override
   public void breathe() {
        breatheImplementor.breathe();
    }
    
}
