package Design_Pattern.Bridge_Design_Pattern.Abstraction;

import Design_Pattern.Bridge_Design_Pattern.Implementor.BreatheImplementor;

public abstract class LivingThings {
    BreatheImplementor breatheImplementor;
    abstract void breathe();
    LivingThings(BreatheImplementor breatheImplementor){
       this.breatheImplementor=breatheImplementor;
    }
    
}
