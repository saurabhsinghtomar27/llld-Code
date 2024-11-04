package Design_Pattern.Adapter_Design_Pattern;

import Design_Pattern.Adapter_Design_Pattern.Adapte.WeightMAchineForBabies;
import Design_Pattern.Adapter_Design_Pattern.Adapter.WeightMachineAdapter;
import Design_Pattern.Adapter_Design_Pattern.Adapter.WeightMachineImp;

public class Main {
    public static void main(String[] args) {
        WeightMachineAdapter weightMachineAdapter=new WeightMachineImp(new WeightMAchineForBabies());
        System.out.println(weightMachineAdapter.WeightInKg());
        
    }
}
