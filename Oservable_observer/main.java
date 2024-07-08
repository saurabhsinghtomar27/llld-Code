import observable.stockObservable;
import observer.emailAlert;
import observer.notificationAlert;
import observable.IphoneStock;
public class main{
    public static void main(String[] args) {
      stockObservable stock= new IphoneStock();
      notificationAlert observer1 = new emailAlert("saurabh@gmail.com", stock);
       notificationAlert observer2 = new emailAlert("surya@gmail.com", stock);
       notificationAlert observer3 = new emailAlert("anmol@gmail.com", stock);
         stock.addObserver(observer1);
            stock.addObserver(observer2);
            stock.addObserver(observer3);
            stock.setStock(10);
       

    }
}