package day7Lab5;

import java.util.Scanner;

public class EmployeeNameMain {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the name of the employee : ");
		String name=sc.nextLine();
		String fullName[]=name.split(" ");
		try {
			if(fullName[0].equals("_") && fullName[1].equals("_"))throw new InvalidNameException("The first name and last name are blank, so the employee name is invalid.");
			else System.out.println("The employee name is valid.");
		}
		catch(Exception e) {
			System.out.println(e);
		}		
}
	

}
