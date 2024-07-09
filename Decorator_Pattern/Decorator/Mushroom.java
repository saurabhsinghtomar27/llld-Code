package Decorator_Pattern.Decorator;
import Decorator_Pattern.Base.BasePizza;
public class Mushroom extends ToopingDecorator{
    BasePizza pizza;
    public Mushroom(BasePizza pizza){
        this.pizza = pizza;
    }
    public int cost(){
        return pizza.cost() + 40;
    }
    
}
