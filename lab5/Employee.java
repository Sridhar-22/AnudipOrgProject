public class Employee {
	   
	    static int number = 112244;
	    static String companyName = "Anudip Foundation";

	    int eid;
	    String ename;
 
	    EmployeeIDCard(String ename) {
	        this.eid = number;
	        this.ename = ename;
	    }

	    static void displayEmployeeDetails(EmployeeIDCard emp) {
	        System.out.println("Employee ID: " + emp.eid);
	        System.out.println("Employee Name: " + emp.ename);
	        System.out.println("Company Name: " + companyName);
	  
	    }

	    public static void main(String[] args) {
	        
	        Employee emp = new Employee("Max Mayfield");

	        
	        displayEmployeeDetails(emp);
	    }
	}
