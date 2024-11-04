package Design_Pattern.Adapter_Design_Pattern.Adapter;

import Design_Pattern.Adapter_Design_Pattern.Adapte.WeightMachine;

public class WeightMachineImp implements WeightMachineAdapter {

    WeightMachine weight;
    public WeightMachineImp(WeightMachine w){
        this.weight=w;
    }

    @Override
    public double WeightInKg() {
       double weightInPounds=weight.weightInPounds();

       return weightInPounds*0.45;
    }
    
}
