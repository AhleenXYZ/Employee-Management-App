package repository;

import org.springframework.stereotype.Repository;

import model.Employee;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class EmployeeRepository {


	    private static final Map<String, Employee> empMap = new HashMap<String, Employee>();

        public EmployeeRepository() {
        	initialiseEmps();
        }
	    
	    public static void initialiseEmps() {
	        
    	   	
	    	Employee emp1 = new Employee(1, "Steven","King", "steven.king@sqltutorial.org", 44000.0f, "+1 (404) 940-6358","Chef de projet" );
	        Employee emp2 = new Employee(0, "Anna","Khia", "anna.khia@sqltutorial.org", 60000.0f, "+33 08-08-40-63-58","Analyste de Finance" );
	        Employee emp3 = new Employee(3, "Gabin"," Tagne", "Gabin.Tagne@sqltutorial.org", 36000.0f, "+1 (657) 457-4514","Junior Developper" );
	        Employee emp4 = new Employee(2, "Jhabil","Lanin", "jhabilt06@sqltutorial.org", 100000.0f, "+44 152-457-4514","CEO" );
	        
	        
	        empMap.put(String.valueOf(emp1.getEmployeeId()), emp1);
	        empMap.put(String.valueOf(emp2.getEmployeeId()), emp2);
	        empMap.put(String.valueOf(emp3.getEmployeeId()), emp3);
	        empMap.put(String.valueOf(emp4.getEmployeeId()), emp4);
	    }

       
       
	    
	    public Employee getEmployeeById(String employeeId) {
	        return empMap.get(employeeId);
	    }
	    
	    
		public Employee addEmployee(Employee emp) {
			Employee existEmp = empMap.get(String.valueOf(emp.getEmployeeId()));
			if(existEmp != null)
				return null;
			
	        empMap.put(String.valueOf(emp.getEmployeeId()), emp);
	        return emp;
	    }
	    
	    
	    public Employee updateEmployee(String employeeId, Employee emp) {
	    	Employee empOld = empMap.get(String.valueOf(employeeId));
	    	if(empOld == null)
	    		return null;
	    	
	    	empMap.replace(String.valueOf(employeeId), emp);
	        return emp;
	    }
	    
	    public Employee updateEmployeeSalary(String employeeId, float salary) {
	    	Employee empOld = this.getEmployeeById(employeeId);
	    	if(empOld == null)
	    		return null;
	    	empOld.setEmployeeSalary(salary);
	        return empOld;
	    }
	    
	    
	    public void deleteEmployee(String empNo) {
	        empMap.remove(empNo);
	    }
	    
	    	    
	    public List<Employee> getAllEmployees() {
	        Collection<Employee> c = empMap.values();
	        List<Employee> list = new ArrayList<Employee>();
	        list.addAll(c);
	        return list;
	    }
}
