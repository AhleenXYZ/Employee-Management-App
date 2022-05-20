
package model;

/**
 * @author AhleenMC
 * Cette classe représente un Objet Employee
 * Employee refere à un(e) employe(e)
 *
 */
public class Employee {
	
	    private int employeeId;
	    private String employeefirstName;
	    private String employeelastName;
	    private String employeeEmail;
	    private float employeeSalary;
	    private String employeePhoneNumber;
	    private String employeePosition;
	    
	    
	    /** 
	     * Employee default constructor, sans paramètres
	     * sert a créer un objet Employee avec valeurs nulles
	     */
	    public Employee() {

	    }
	    
	    /** 
		 * Employee constructor, avec parametre
		 * sert à initialiser un object Employee et prend comme parametres:
		 * @param empId l'identifiant
		 * @param empfName le prenom de l'employe
		 * @param emplName le nom de l'employe
		 * @param email email de l'employé
		 * @param salary le salaire de l'employe
		 * @param phoneNumber le numero de telephone de l'employé
		 * @param position le poste qu'occupe l'employe
		 * 
		 */
	    public Employee(int empId, String empfName, String emplName, String email, float salary, String phoneNumber, String position) {
	    	employeeId = empId;
	    	employeefirstName = empfName;
	    	employeelastName = emplName;
	    	employeeEmail = email;
	    	employeeSalary = salary;
	    	employeePhoneNumber = phoneNumber;
	    	this.employeePosition = position;
	    }
	    
	    /**
	     * getEmployeeId
	     * Cette méthode retourne l'identifiant d'un Employé
	     * @return employeeID
	     */
	    public int getEmployeeId() {
	        return employeeId;
	    }
	    
	    /**
		 * setEmployeeId
		 * change l'identifiant d'un Employé
		 * @param newEmpId nouvel identifiant
		 */
	    public void setEmployeeId(int newEmpId) {
	        this.employeeId = newEmpId;
	    }
	    
	        
	    /**
		 * getEmployeeSalary
		 * @return the employeeSalary
		 */
		public float getEmployeeSalary() {
			return employeeSalary;
		}
		
		/**
		 * setEmployeeSalary
		 * @param employeeSalary the employeeSalary to set
		 */
		public void setEmployeeSalary(float employeeSalary) {
			this.employeeSalary = employeeSalary;
		}
		
		/**
		 * getEmployeeEmail
		 * @return the employeeEmail
		 */		
		public String getEmployeeEmail() {
			return employeeEmail;
		}
		
		/**
		 * @param employeeEmail the employeeEmail to set
		 */
		public void setEmployeeEmail(String employeeEmail) {
			this.employeeEmail = employeeEmail;
		}

		/**
		 * @return the employeePhoneNumber
		 */
		public String getEmployeePhoneNumber() {
			return employeePhoneNumber;
		}

		/**
		 * @param employeePhoneNumber the employeePhoneNumber to set
		 */
		public void setEmployeePhoneNumber(String employeePhoneNumber) {
			this.employeePhoneNumber = employeePhoneNumber;
		}		

		/**
		 * @return the employeePosition
		 */
		public String getEmployeePosition() {
			return employeePosition;
		}

		/**
		 * @param employeePosition the employeePosition to set
		 */
		public void setEmployeePosition(String employeePosition) {
			this.employeePosition = employeePosition;
		}
		
		/**
		 * equals()
		 * voir si deux objets Employee sont similaires
		 * @param employeePosition the employeePosition to set
		 */
		public boolean equals(Employee employee) {
			    boolean temp = false;
				if (this.employeeId == employee.getEmployeeId() && this.employeeEmail == employee.getEmployeeEmail()
						&& this.employeefirstName == employee.getEmployeefirstName() && this.employeelastName == employee.getEmployeelastName() && this.employeePhoneNumber == employee.getEmployeePhoneNumber()
						&& this.employeePosition == employee.getEmployeePosition() )
					temp = true;
				return temp;
		}

		/**
		 * @return the employeefirstName
		 */
		public String getEmployeefirstName() {
			return employeefirstName;
		}

		/**
		 * @param employeefirstName the employeefirstName to set
		 */
		public void setEmployeefirstName(String employeefirstName) {
			this.employeefirstName = employeefirstName;
		}

		/**
		 * @return the employeelastName
		 */
		public String getEmployeelastName() {
			return employeelastName;
		}

		/**
		 * @param employeelastName the employeelastName to set
		 */
		public void setEmployeelastName(String employeelastName) {
			this.employeelastName = employeelastName;
		}

}
