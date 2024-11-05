package Design_Pattern.Command_Design_Pattern;

public class TurnOnAc implements IOCommand {
    AirCondintioner airCondintioner;
    TurnOnAc(AirCondintioner airCondintioner){
        this.airCondintioner=airCondintioner;
    }

    @Override
    public void exceute() {
        airCondintioner.TurnOnAc();
    }

    @Override
    public void undo() {
       airCondintioner.TurnOffAc();
    }
    
}
