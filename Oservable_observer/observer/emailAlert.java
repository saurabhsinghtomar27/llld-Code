package observer;
import observable.stockObservable;
public class emailAlert implements notificationAlert{
    String email;
    stockObservable stock;
    public emailAlert(String email, stockObservable stock){
        this.email = email;
        this.stock = stock;
    }
    @Override
    public void update(){
        System.out.println("Email Alert: Stock has been updated");
    }
    private void sendEmail(){
        System.out.println("Email sent to: "+email);
    }
}
