package Decorator_Pattern;
import Decorator_Pattern.Base.*;
import Decorator_Pattern.Decorator.*;
public class Main {
    public static void main(String[] args) {
        BasePizza pizza = new Mushroom(new ExtraChesse(new FarmHouse()));
        System.out.println(pizza.cost());
    }
    
}
