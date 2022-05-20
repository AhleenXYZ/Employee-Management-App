package controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import model.Employee;
import repository.EmployeeRepository;

@RestController
public class EmployeeController {

	@Autowired
	private EmployeeRepository employeeRepository;

    @RequestMapping("/welcome")
    @ResponseBody
    public String welcome() {
        return "Bienvenue dans mon Employee Management App pour Limber !";
    }
		
    @RequestMapping(value = "/employees", 
        method = RequestMethod.GET, 
        produces = { MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE })
    @ResponseBody
    public List<Employee> getEmployees() {
        List<Employee> list = employeeRepository.getAllEmployees();
        return list;
    }

    @RequestMapping(value = "/employee/{employeeId}", 
        method = RequestMethod.GET, //
        produces = { MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE })
    @ResponseBody
    public Employee getEmployee(@PathVariable("employeeId") String employeeId) {
        return employeeRepository.getEmployeeById(employeeId);
    }


    @RequestMapping(value = "/employee",
        method = RequestMethod.POST, 
        produces = { MediaType.APPLICATION_JSON_VALUE,MediaType.APPLICATION_XML_VALUE })
    @ResponseBody
    public ResponseEntity<Employee> addEmployee(@RequestBody Employee emp) {
    	
    	Employee returnEmployee = employeeRepository.addEmployee(emp);
    	
    	if(returnEmployee == null)
    		return new ResponseEntity<Employee> (HttpStatus.CONFLICT);
    	
        return new ResponseEntity<Employee> (returnEmployee, HttpStatus.CREATED);
    }

    @RequestMapping(value = "/employee/{employeeId}", 
        method = RequestMethod.PUT, //
        produces = { MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE })
    @ResponseBody
    public ResponseEntity<Employee> updateEmployee(@RequestBody Employee emp, 
    	@PathVariable("employeeId") String employeeId) {
    	
    	Employee returnEmployee = employeeRepository.updateEmployee(employeeId, emp);
    	if(returnEmployee == null)
    		return new  ResponseEntity<Employee> (HttpStatus.NOT_FOUND);

        return new ResponseEntity<Employee> (returnEmployee, HttpStatus.ACCEPTED);
    }
    
    	@RequestMapping(value = "/employee/{employeeId}/{salaire}", 
            method = RequestMethod.PUT, 
            produces = { MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE })
        @ResponseBody
        public  Boolean updateEmployeeSalary( @PathVariable("employeeId") String employeeId, @PathVariable("salaire") float salary) {
        	boolean salaireModifie = true;
        	
        	Employee returnEmployee = employeeRepository.updateEmployeeSalary(employeeId, salary);
        	if(returnEmployee == null)
        		salaireModifie = false;

            return salaireModifie;
        }
    
    @RequestMapping(value = "/employee/{employeeId}",
            method = RequestMethod.DELETE, 
            produces = { MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE })
    @ResponseBody
    public void deleteEmployee(@PathVariable("employeeId") String empNo) {

        employeeRepository.deleteEmployee(empNo);
    }
}
