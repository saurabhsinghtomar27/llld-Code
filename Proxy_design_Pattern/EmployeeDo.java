package Proxy_design_Pattern;

public class EmployeeDo implements EmployeeDao{
   public void create(String client,EmployeeDo obj) throws Exception{
       System.out.println("Employee created");
   }
    public void delete(String client,int EmployeeId) throws Exception{
         System.out.println("Employee deleted");
    }
    public EmployeeDo get(String client,int EmployeeId) throws Exception{
        System.out.println("Employee fetched");
        return new EmployeeDo();
    }
}
