package observable;
import observer.notificationAlert;
public interface stockObservable {
    void addObserver(notificationAlert observer);
    void removeObserver(notificationAlert observer);
    void notifyObservers();
    void setStock(int newStock);
    int getStock();
}
