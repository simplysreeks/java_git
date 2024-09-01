package Generalization;

public class MainClass1 {
	
	public static void living(Employee employee) {
		employee.work();
		employee.getSalary();
		employee.takeHoliday();
		if(employee instanceof HR) {
			HR hr =(HR)employee;
			hr.hire();
		}
		else if(employee instanceof Developer) {
			Developer developer = (Developer)employee;
			developer.writeCode();
		}
		else {
			Admin admin=(Admin)employee;
			admin.configureSystem();
			
		}
	}
	public static void main(String[] args) {
		living((Employee)new Developer());
		living((Employee)new HR());
		living((Employee)new Admin());
	}

}
