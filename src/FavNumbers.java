import java.util.Scanner;

public class FavNumbers
    {
        public static void main (String[]args)
        {
        Scanner console = new Scanner(System.in);

        int smellyInt = 0;
        double getDouble = 0;

        smellyInt = Safeinput.getInt(console, "Your favorite integer is ");
        getDouble = Safeinput.getDouble(console, "Your favorite double is ");
    }
}