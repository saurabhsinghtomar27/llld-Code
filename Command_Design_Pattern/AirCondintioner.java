package Design_Pattern.Command_Design_Pattern;

public class AirCondintioner {
    protected boolean isOn;
    int temperature;
   public void TurnOnAc(){
        this.isOn=true;
        System.out.println(isOn);
    }
    public void TurnOffAc(){
        isOn=false;
        System.out.println(isOn);
    }
    public void SetTemperature(int temperature){
        this.temperature=temperature;
    }
}
