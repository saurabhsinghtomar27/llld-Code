package Design_Pattern.Command_Design_Pattern;

public class Main {
    public static void main(String[] args) {
        AirCondintioner airCondintioner=new AirCondintioner();
        MyRemoteControl myRemoteControl=new MyRemoteControl();
        myRemoteControl.setCommands(new TurnOffAc(airCondintioner));
        myRemoteControl.pressButton();
        myRemoteControl.undo();
    }
}
