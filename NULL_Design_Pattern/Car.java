package Design_Pattern.NULL_Design_Pattern;

public class Car implements Vehicle{

    @Override
    public int FuelCapacity() {
        return 40;
    }

    @Override
    public int SeatCapacity() {
       return 5;
    }
    
}
