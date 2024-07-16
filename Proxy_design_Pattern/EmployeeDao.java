package Proxy_design_Pattern;

public interface EmployeeDao {
    public void create(String client,EmployeeDo obj) throws Exception;
    public void delete(String client,int EmployeeId) throws Exception;
    public EmployeeDo get(String client,int EmployeeId) throws Exception;
    
}
