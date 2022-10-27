import java.util.Scanner;

public class GetUserName
{
        public static void main(String[] args)
        {
            Scanner in = new Scanner(System.in);
            String firstName = "";
            String lastName = "";
            firstName = Safeinput.getNonZeroLengthString(in, "Enter your first name");
            lastName = Safeinput.getNonZeroLengthString(in, "Enter your last name");
            System.out.println("\nYour full name is: " + firstName + " " + lastName);
        }
    }
