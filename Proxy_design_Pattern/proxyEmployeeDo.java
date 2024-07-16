package Proxy_design_Pattern;

public class proxyEmployeeDo {
    EmployeeDo emp;
    proxyEmployeeDo(){
        emp=new EmployeeDo();
    }
    public void create(String client,EmployeeDo obj) throws Exception{
        if(client.equals("admin")){
            emp.create(client,obj);
        }
        else{
            throw new Exception("You are not authorized to create employee");
        }
    }
    public void delete(String client,int EmployeeId) throws Exception{
        if(client.equals("admin")){
            emp.delete(client,EmployeeId);
        }
        else{
            throw new Exception("You are not authorized to delete employee");
        }
    }
    public EmployeeDo get(String client,int EmployeeId) throws Exception{
        if(client.equals("admin") || client.equals("user")){
            return emp.get(client,EmployeeId);
        }
        else{
            throw new Exception("You are not authorized to get employee");
        }
    }
    
}
