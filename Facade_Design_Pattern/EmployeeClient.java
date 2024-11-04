package Design_Pattern.Facade_Design_Pattern;

public class EmployeeClient {
    public static void main(String[] args) {
        EmployeeFacade employeeFacade=new EmployeeFacade();
        employeeFacade.GetEmployee();
    }
}
