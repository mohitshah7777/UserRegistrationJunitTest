import java.util.Scanner;
import java.util.regex.*;

public class UserRegistration{

	static Scanner input = new Scanner(System.in);

	//UC1 Firstname starts with cap and has min 3 characters
	public static void userFirstName() {

		while(true)
		{
			String firstName = input.nextLine();
			boolean result = Pattern.matches("^[A-Z]{1}[a-z]{2,14}$",firstName);
			if (result == true)
			{
				System.out.println("Entered First Name is Valid: " +firstName);
				break;
			}
			else
			{
				System.out.println("Invalid First Name! Please Re-enter The First Name:");
			}
		}
	}

	//UC2 Lastname starts with cap and has min 3 characters
	public static void userLastName() {

		while(true)
		{
			String lastName = input.nextLine();
			boolean result = Pattern.matches("^[A-Z]{1}[a-z]{2,14}$",lastName);
			if (result == true)
			{
				System.out.println("Entered Last Name is Valid: " +lastName);
				break;
			}
			else 
			{
				System.out.println("Invalid Last Name! Please Re-enter The Last Name:");
			}
		}
	}

	//UC3 Email has 3 mandatory parts (abc, bl & co) and 2 optional (xyz & in) with precise @ and . positions
	public static void userEmail() {

		while(true)
		{
			String email = input.nextLine();
			boolean result = Pattern.matches("^[A-Za-z0-9+-]+(\\.[A-Za-z0-9-]+)*@" + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$", email);
			if (result == true)
			{
				System.out.println("Entered Email is Valid: " +email);
				break;
			}
			else
			{
				System.out.println("Invalid Email! Please Re-enter The Email:");
			}
		}
	}

	//UC4 Mobile Format - E.g. 91 9919819801 - Country code follow by space and 10 digit number
	public static void userMobileNumber() {

		while(true)
		{
			String mobileNumber = input.nextLine();
			boolean result = Pattern.matches("^[0-9]{2}[ ][6-9]{1}[0-9]{9}$", mobileNumber);
			if (result == true)
			{
				System.out.println("Entered Mobile Number is Valid: " +mobileNumber);
				break;
			}
			else
			{
				System.out.println("Invalid Mobile Number! Please Re-enter The Mobile Number:");
			}
		}
	}

	//UC5 Rule1– minimum 8 Characters
	//UC6 Rule2- Atleast 1 Uppercase
	//UC7 Rule3- Atleast 1 numeric value
	//UC8 Rule4- Atleast 1 special character
	public static void userPassword() {

		while(true)
		{
			String password = input.nextLine();
			boolean result = Pattern.matches("^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@$!%*?&])[A-Za-z\\d@$!%*?&]{8,}$", password);
			if (result == true)
			{
				System.out.println("Entered Password is Valid");
				break;
			}
			else
			{
				System.out.println("Invalid Password! Please Re-enter The Password: ");
			}
		}
	}

	public static void main(String[] args){

		System.out.print("Enter First Name = ");
		userFirstName();
		System.out.print("Enter Last Name = ");
		userLastName();
		System.out.print("Enter Email ID = ");
		userEmail();
		System.out.print("Enter Mobile Number = ");
		userMobileNumber();
		System.out.print("Enter Password = ");
		userPassword();

   }
}
