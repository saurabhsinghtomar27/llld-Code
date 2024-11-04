package Design_Pattern.Bridge_Design_Pattern.Implementor;

public class LandBreatheImplementation implements BreatheImplementor {

    @Override
    public void breathe() {
       System.out.println("Land");
    }
    
}
