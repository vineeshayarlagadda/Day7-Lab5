package day7Lab5;
import java.util.*;

public class AgeMain {
	public static void main(String[] args) {
		ValidateAge checkAge=new ValidateAge();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the age of person : ");
		int age=sc.nextInt();
		try {
			checkAge.isValidAge(age);
		
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
}
