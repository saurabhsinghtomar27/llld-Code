package Design_Pattern.Bridge_Design_Pattern;

import Design_Pattern.Bridge_Design_Pattern.Abstraction.Dog;
import Design_Pattern.Bridge_Design_Pattern.Implementor.LandBreatheImplementation;

public class main {
    public static void main(String[] args) {
        Dog dog=new Dog(new LandBreatheImplementation());
        dog.breathe();
    }
}
