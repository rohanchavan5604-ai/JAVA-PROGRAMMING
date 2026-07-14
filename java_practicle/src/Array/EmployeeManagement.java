package Array;

class Employee {
	int empId;
	String empName;
	String department;
	double salary;

	Employee(int id, String name, String dept, double sal) {
		empId = id;
		empName = name;
		department = dept;
		salary = sal;
	}
}

public class EmployeeManagement {
	public static void main(String[] args) {
		Employee e[] = new Employee[5];

		e[0] = new Employee(101, "Rohan", "IT", 50000);
		e[1] = new Employee(102, "Onkar", "HR", 35000);
		e[2] = new Employee(103, "Tushar", "IT", 60000);
		e[3] = new Employee(104, "Ajay", "Sales", 45000);
		e[4] = new Employee(105, "Sanket", "IT", 55000);

		System.out.println("Employees Working in IT Department:");
		for (int i = 0; i < e.length; i++) {
			if (e[i].department.equals("IT")) {
				System.out.println(e[i].empName + " = " + e[i].salary);
			}
		}

		double total = 0;

		for (int i = 0; i < e.length; i++) {
			total = total + e[i].salary;
		}

		System.out.println("\nTotal Salary = " + total);

		Employee high = e[0];

		for (int i = 1; i < e.length; i++) {
			if (e[i].salary > high.salary) {
				high = e[i];
			}
		}

		System.out.println("\nHighest Salary Employee = " + high.empName);
		System.out.println("Salary = " + high.salary);

		for (int i = 0; i < e.length; i++) {
			for (int j = i + 1; j < e.length; j++) {
				if (e[i].salary < e[j].salary) {
					Employee temp = e[i];
					e[i] = e[j];
					e[j] = temp;
				}
			}
		}

		System.out.println("\nEmployees Sorted Salary in Descending:");

		for (int i = 0; i < e.length; i++) {
			System.out.println(e[i].empName + " = " + e[i].salary);
		}
	}
}