package Design_Pattern;
class Car{
    private String engine;
    private int seats;
    private boolean sunroof;
    private boolean gps;
    private Car(CarBuilder builder){
        this.engine=builder.engine;
        this.seats=builder.seats;
        this.sunroof=builder.sunroof;
        this.gps=builder.gps;
    }
    public String getEngine(){
        return engine;
    }
    public int getSeats(){
        return seats;
    }
    public boolean hasSunroof(){
        return sunroof;
    }
    public boolean hasGps(){
        return gps;
    }
public static class CarBuilder{
    private String engine;
    private int seats;
    private boolean sunroof;
    private boolean gps;
    public CarBuilder(String engine,int seats){
        this.engine=engine;
        this.seats=seats;
    }
    public CarBuilder setSunroof(boolean sunroof){
        this.sunroof=sunroof;
        return this;
    }
    public CarBuilder setGPS(boolean gps){
        this.gps=gps;
        return this;
    }
    public Car build(){
        return new Car(this);
    }
}
}
public class BuilderP {
    public static void main(String args[]){
      Car car=new Car.CarBuilder("v3", 2).setSunroof(true).build();
      System.out.println(car.getEngine()+" "+car.hasSunroof());

    }
}
