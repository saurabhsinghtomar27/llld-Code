package Design_Pattern.NULL_Design_Pattern;

public class NullVehicle implements Vehicle {

    @Override
    public int FuelCapacity() {
       return 0;
    }

    @Override
    public int SeatCapacity() {
        return 0;
    }
    
}
