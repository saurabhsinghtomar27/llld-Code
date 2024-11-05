package Design_Pattern.Command_Design_Pattern;

public class TurnOffAc implements IOCommand{
   AirCondintioner airCondintioner;
    TurnOffAc(AirCondintioner airCondintioner){
        this.airCondintioner=airCondintioner;
    }

    @Override
    public void exceute() {
       airCondintioner.TurnOffAc();
    }

    @Override
    public void undo() {
        airCondintioner.TurnOffAc();
    }
    
}
