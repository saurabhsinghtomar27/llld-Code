package Design_Pattern.Elevator_LLD;

public class InternalButtons {
   InternalDispatcher dispatcher =new InternalDispatcher();
   int []availableButtons={1,2,3,4,5,6,7,8,9,10};
   int buttonSelected;
   void pressButton(int destination,ElevatorCar elavatorCar){
      dispatcher.submitInternalRequest(destination,elavatorCar);
   }   
}
