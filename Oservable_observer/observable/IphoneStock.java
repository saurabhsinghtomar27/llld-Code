package observable;

import java.util.ArrayList;
import observer.notificationAlert;
public class IphoneStock implements stockObservable{
    ArrayList<notificationAlert> observers = new ArrayList<notificationAlert>();
    public int stock = 0;
    public void addObserver(notificationAlert observer){
        observers.add(observer);
    }
    public void removeObserver(notificationAlert observer){
        observers.remove(observer);
    }
    public void notifyObservers(){
        for(notificationAlert observer: observers){
            observer.update();
        }
    }
    public void setStock(int newStock){
        if(stock==0){
            stock = newStock;
            notifyObservers();
        }
        stock+=newStock;
    }
    public int getStock(){
        return stock;
    }
    
}
