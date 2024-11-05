package Design_Pattern.FlyWeight_Design_Pattern;

public class Main {
      public static void main(String[] args) {
        
        IRobot humanoidRobot1 = RoboticFactory.CreateRobotics("HUMANOID");
        humanoidRobot1.display(1,2);


        IRobot humanoidRobot2 = RoboticFactory.CreateRobotics("HUMANOID");
        humanoidRobot2.display(10,30);

        IRobot roboDog1 = RoboticFactory.CreateRobotics("ROBOTICDOG");
        roboDog1.display(2,9);

        IRobot roboDog2 = RoboticFactory.CreateRobotics("ROBOTICDOG");
        roboDog2.display(11,19);
 
    }
}

