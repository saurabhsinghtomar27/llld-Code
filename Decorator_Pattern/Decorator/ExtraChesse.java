package Decorator_Pattern.Decorator;
import Decorator_Pattern.Base.BasePizza;
public class ExtraChesse extends ToopingDecorator{
    BasePizza pizza;
    public ExtraChesse(BasePizza pizza){
        this.pizza = pizza;
    }
    public int cost(){
        return pizza.cost() + 50;
    }
}
