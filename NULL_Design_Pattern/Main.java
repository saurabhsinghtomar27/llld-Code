package Design_Pattern.NULL_Design_Pattern;

public class Main {
    public static void main(String[] args) {
        Vehicle vehicle=new VehicleFactory().getVehicle("Car");
        System.out.println("Fuel Capacity: "+vehicle.FuelCapacity());
        System.out.println("Seat Capacity: "+vehicle.SeatCapacity());
    }
}
