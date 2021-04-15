package day7Lab5;
import java.util.*;

public class EmployeeSalaryMain {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the salary of the employee : ");
		int salary=sc.nextInt();
		CheckEmployeeSalary checkSalary=new CheckEmployeeSalary();
		try {
			checkSalary.checkingSalary(salary);
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}

}