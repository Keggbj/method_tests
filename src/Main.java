import java.util.Scanner;

public class Main {

    //class variables go here and are visible to the methods below main

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);


        sayHello(); //Prints Hello One Time
        System.out.println("\n spacer \n");
        sayHello(13);
        sayMsg("Life sucks!", 35);

        int myFav = getRangedInt(console, "Enter your favorite int", 1, 100);
        int myFavDoubled = doubleIt(myFav);
        System.out.println("Doubled is: " + myFavDoubled);

        int year = Safeinput.getInt(console, "Enter a year of birth");
        System.out.println("You said the year is: " + year);

        double salary = getDouble(console, "Enter your salary");
        System.out.println("Your salary is " + salary);

        String fName = getNonZeroLengthString(console, "Enter a non-zero length String like your name");
        System.out.println("Hello " + fName);

        String ssn = getRegExString(console, "Enter your SSN ###-##-####", "\\d{3}-\\d{2}-\\d{4}");
        System.out.println("Your ssn is " + ssn);

        String mNumber = getRegExString(console, "Enter your UC M Number M########", "(M|m)\\\\d{5}");
        System.out.println("Your ssn is " + ssn);

        String menu = getRegExString(console, "Enter your Menu Choice O, S, V, or Q", "[OoSsVvQq]");
        System.out.println("Your ssn is " + ssn);

        boolean isRaining = getYNConfirm(console, "Is it raining");
        System.out.println("You said it was raining " + isRaining);
    }

    // user define Methods go here and are static
    public static void sayHello() {
        System.out.println("Hello!");
    }

    public static void sayHello(int times) {
        for (int rep = 0; rep < times; rep++)
            System.out.println("Hello!");
    }

    public static void sayMsg(String msg, int times) {
        for (int rep = 0; rep < times; rep++)
            System.out.println(msg);
    }

    public static int doubleIt(int toBeDoubled) {
        int doubledVal = toBeDoubled * 2;

        return doubledVal;

    }

    public static int getRangedInt(Scanner pipe, String prompt, int low, int high) {
        int retVal = low - 1;
        boolean done = false;
        String trash = "";

        do {
            //favorite number 1-10
            System.out.print(prompt + "[" + low + " - " + high + "]: ");
            if (pipe.hasNextInt()) {
                retVal = pipe.nextInt();
                pipe.nextLine(); //clear the new line from the buffer
                if (retVal >= low && retVal <= high) {
                    System.out.println("\nYou said your fav num is " + retVal);
                    done = true;
                } else {
                    System.out.println("You said your fav num is " + retVal + " but that is out of range [" + low + " - " + high + "]: ");
                }
            } else // don't have an int
            {
                trash = pipe.nextLine();
                System.out.println("You must enter an integer not: " + trash);
            }
        } while (!done);

        return retVal;
    }

    /**
     * returns a user supplied int of arbitrary value
     *
     * @param pipe   the Scanner to use for the input
     * @param prompt The String prompt telling the user what to input
     * @return an arbitrary integer of any value
     */
    public static int getInt(Scanner pipe, String prompt) {
        int retVal = 0;
        boolean done = false;
        String trash = "";

        do {
            //favorite number 1 - 10
            System.out.print(prompt + ": ");
            if (pipe.hasNextInt()) {
                retVal = pipe.nextInt();
                pipe.nextLine(); // clear the newline form the buffer
                done = true;
            } else // don't have an int
            {
                trash = pipe.nextLine();
                System.out.println("You must enter an integer not " + trash);
            }
        } while (!done);

        return retVal;

    }

    /**
     * returns a user supplied double of arbitrary value
     *
     * @param pipe   the Scanner to use for the input
     * @param prompt The String prompt telling the user what to input
     * @return an arbitrary double of any value
     */

    public static double getDouble(Scanner pipe, String prompt) {
        double retVal = 0;
        boolean done = false;
        String trash = "";

        do {
            //favorite number 1 - 10
            System.out.print(prompt + ": ");
            if (pipe.hasNextDouble()) {
                retVal = pipe.nextDouble();
                pipe.nextLine(); // clear the newline form the buffer
                done = true;
            } else // don't have a double
            {
                trash = pipe.nextLine();
                System.out.println("You must enter a double not " + trash);
            }
        } while (!done);

        return retVal;

    }

    /**
     * get a double with a specified inclusive range
     *
     * @param pipe   Scanner to read the console
     * @param prompt The prompt to tell the user what to input
     * @param low    the low value for the range
     * @param high   the high value for the range
     * @return a double within the specified range
     */
    public static double getRangeDouble(Scanner pipe, String prompt, double low, double high) {
        double retVal = 0;
        boolean done = false;
        String trash = "";

        do {

            System.out.print(prompt + "[" + low + " - " + high + "]: ");
            if (pipe.hasNextDouble()) {
                retVal = pipe.nextDouble();
                pipe.nextLine(); //clear the new line from the buffer
                if (retVal >= low && retVal <= high) {
                    done = true;
                } else {
                    System.out.println("You said your fav num is " + retVal + " but that is out of range [" + low + " - " + high + "]: ");
                }
            } else // don't have a double
            {
                trash = pipe.nextLine();
                System.out.println("You must enter a double not: " + trash);
            }
        } while (!done);

        return retVal;
    }

    /**
     * gets a string with at least one character
     *
     * @param pipe   Scanner to use for input
     * @param prompt String prompt to tell the user what to input
     * @return a non zero length string
     */
    public static String getNonZeroLengthString(Scanner pipe, String prompt) {
        String retVal = "";
        boolean done = false;

        do {
            //favorite number 1 - 10
            System.out.print(prompt + ": ");
            retVal = pipe.nextLine();

            if (retVal.length() != 0) {
                done = true;
            } else // you have a zero length string
            {
                System.out.println("You must enter at least one character.");
            }
        } while (!done);

        return retVal;
    }

    /**
     * gets a string that matches a Regular Expression like ###-##-#### \d{3}-\d{2}-\d{4}
     *
     * @param pipe   Scanner to use for input
     * @param prompt String prompt to tell the user what to input
     * @return a String that matches the RegEx pattern
     */
    public static String getRegExString(Scanner pipe, String prompt, String StringRegEx) {
        String retVal = "";
        boolean done = false;

        do {
            System.out.print(prompt + ": ");
            retVal = pipe.nextLine();

            if (retVal.matches(StringRegEx)) {
                done = true;
            } else // you have a zero length string
            {
                System.out.println("What you entered does not match the pattern." + StringRegEx);
            }
        } while (!done);

        return retVal;
    }

    /**
     * Takes a Y or an N and returns true or false respectively
     *
     * @param pipe   Scanner to use for console input
     * @param prompt String
     * @return A boolean true or false based on the Y or N input
     */
    public static boolean getYNConfirm(Scanner pipe, String prompt) {
        boolean retVal = false;
        boolean done = false;
        String inputYN = "";

        do {

            System.out.print(prompt + ": [Y/N] ");
            inputYN = pipe.nextLine();
            if (inputYN.equalsIgnoreCase("Y")) {
                done = true;
                retVal = true;
            } else if (inputYN.equalsIgnoreCase("N")) {
                done = true;
                retVal = true;
            } else {
                System.out.println("You must enter Y or N:");
            }

        } while (!done);

        return retVal;
    }

    public static void prettyHeader(String msg) {
        Scanner in = new Scanner(System.in);

        {
            for (int x = 0; x <= 30; x++) {
                System.out.print(" " + x);
            }
        }
    }
    public static String centerHeader(Scanner pipe, String prompt)
    {

        pipe = new Scanner(System.in);
        System.out.print("What would you like centered?");
        String msg;
        msg = pipe.next();
        int width = 60;
        int space = (width - msg.length() - 6);
        int left;
        int right;

        if (space % 2 == 0) {
            left = space / 2;
            right = space / 2;
        }
        else
        {
            left = space / 2;
            right = space / 2 + 1;
        }

        String leftSpace = " ".repeat(Math.max(0, left));
        String rightSpace=(" ".repeat(Math.max(0, right)));

        String center = "***" + rightSpace + msg + leftSpace + "***";

        for (int x = 1; x <= 60; x++) {
            System.out.printf("*");
        }
        System.out.printf("\n");
        System.out.print(center);
        System.out.printf("\n");
        for (int x = 1; x <= 60; x++) {
            System.out.printf("*");
        }

        return msg;
    }
}
