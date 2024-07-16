package Proxy_design_Pattern;

public class Main {
    public static void main(String[] args) {
        try {
            proxyEmployeeDo proxy=new proxyEmployeeDo();
            proxy.create("admin", new EmployeeDo());
            proxy.create("user",new EmployeeDo());
            
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println(e.getMessage());
        }
    }
    
}
