package Design_Pattern.FlyWeight_Design_Pattern;

public class RoboticDog implements IRobot {
    private String type;
    private Sprite body;
    RoboticDog(String type,Sprite body){
        this.body=body;
        this.type=type;
    }

    public String getType(){
        return type;
    }
    public Sprite getBody(){
        return body;
    }

    @Override
    public void display(int x, int y) {
       System.out.println(body+" "+x+" "+y);
    }
    
}
