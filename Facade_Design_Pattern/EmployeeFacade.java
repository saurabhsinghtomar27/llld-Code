package Design_Pattern.Facade_Design_Pattern;

public class EmployeeFacade {
    EmployeeDAO employeeDAO;
    EmployeeFacade(){
      this.employeeDAO=new EmployeeDAO();
    }
    public void insert(){
        employeeDAO.insert();
    }
    public void GetEmployee(){
        employeeDAO.Get();
    }
}
