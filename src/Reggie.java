import java.util.Scanner;

public class Reggie {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String ssn = "";
        String mNumber = "";
        String menu = "";

        {
ssn = Safeinput.getRegExString(console, "Enter your SSN ###-##-####", "\\d{3}-\\d{2}-\\d{4}");
            System.out.println("Your ssn is: " + ssn);

            mNumber = Safeinput.getRegExString(console, "Enter your UC M Number M########", "(M|m)\\d{8}");
           System.out.println("Your UC M Number is " + mNumber);

            menu = Safeinput.getRegExString(console, "Enter your Menu Choice O, S, V, or Q", "[OoSsVvQq]");

            if (menu.equalsIgnoreCase("O"))
            System.out.println("Open Menu");
            if (menu.equalsIgnoreCase("S"))
                System.out.println("Save Menu");
            if (menu.equalsIgnoreCase("V"))
                System.out.println("View Menu");
            if (menu.equalsIgnoreCase("Q"))
                System.out.println("Quit Menu");
            }
        }
    }
