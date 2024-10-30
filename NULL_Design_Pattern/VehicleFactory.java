package Design_Pattern.NULL_Design_Pattern;

public class VehicleFactory {

    Vehicle getVehicle(String vehicle){
        if(vehicle.equals("Car")){
            return new Car();
        }
        return new NullVehicle();
    }
    
}
