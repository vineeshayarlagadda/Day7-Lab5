package day7Lab5;

public class ValidateAge {
	public void isValidAge(int age) throws AgeInvalidException {
		if(age>15)System.out.println("Age of the person is valid and age is : "+age+" years");
		else if(age==15)throw new AgeInvalidException("The age of person is invalid as the age is 15 years, i.e, not above 15 years as required.");
		else throw new AgeInvalidException("The age of person is invalid as the age is below 15 years.");
	}
	

}
