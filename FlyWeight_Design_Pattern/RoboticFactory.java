package Design_Pattern.FlyWeight_Design_Pattern;

import java.util.HashMap;

public class RoboticFactory {
   static HashMap<String,IRobot> RoboticCache=new HashMap<>();

     public static IRobot CreateRobotics(String type){
        if(RoboticCache.get(type)!=null){
            return RoboticCache.get(type);
        }
        else if(type.equals("HUMANOID")){
            Sprite body=new Sprite();
            IRobot robot=new Humanoid(type,body);
            RoboticCache.put(type, robot);
            return robot;
        }
        else if(type.equals("ROBOTICDOG")){
            Sprite body=new Sprite();
            IRobot robot=new RoboticDog(type,body);
            RoboticCache.put(type, robot);
            return robot;
        }
        return null;
     }

}
