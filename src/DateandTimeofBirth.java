import java.util.Scanner;

public class DateandTimeofBirth {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int year = 0;
        int months = 0;
        int hours = 0;
        int minutes = 0;
        boolean done = false;
        String trash = "";
        String January = "";
        String February = "";
        String March = "";
        String April = "";
        String May = "";
        String June = "";
        String July = "";
        String August = "";
        String September = "";
        String October = "";
        String November = "";
        String December = "";
        int days = 0;

        year = Safeinput.getRangedInt(console, "Pick a year: ", 1950, 2010);
        hours = Safeinput.getRangedInt(console, "Pick an hour: ", 1, 24);
        minutes = Safeinput.getRangedInt(console, "Pick a minute: ", 1, 59);
        months = Safeinput.getRangedInt(console, "Pick a month: ", 1, 12);

        switch (months) {
            case 1:
                System.out.println("January");
                days = Safeinput.getRangedInt(console, "Pick a day: ", 1, 31 );
                break;
            case 2:
                System.out.println("February");
            days = Safeinput.getRangedInt(console, "Pick a day: ", 1, 29 );
            break;
            case 3:
                System.out.println("March");
            days = Safeinput.getRangedInt(console, "Pick a day: ", 1, 31 );
            break;
            case 4:
                System.out.println("April");
                days = Safeinput.getRangedInt(console, "Pick a day: ", 1, 30 );
                break;
            case 5:
                System.out.println("May");
                days = Safeinput.getRangedInt(console, "Pick a day: ", 1, 31 );

                break;
            case 6:
                System.out.println("June");
                days = Safeinput.getRangedInt(console, "Pick a day: ", 1, 30 );
                break;
            case 7:
                System.out.println("July");
                days = Safeinput.getRangedInt(console, "Pick a day: ", 1, 31 );
                break;
            case 8:
                System.out.println("August");
                days = Safeinput.getRangedInt(console, "Pick a day: ", 1, 31 );
                break;
            case 9:
                System.out.println("September");
                days = Safeinput.getRangedInt(console, "Pick a day: ", 1, 30 );
                break;
            case 10:
                System.out.println("October");
                days = Safeinput.getRangedInt(console, "Pick a day: ", 1, 31 );
                break;
            case 11:
                System.out.println("November");
                days = Safeinput.getRangedInt(console, "Pick a day: ", 1, 30 );
                break;
            case 12:
                System.out.println("December");
                days = Safeinput.getRangedInt(console, "Pick a day: ", 1, 31 );
                break;

        }
        System.out.println("Your birthday is " + months + "/" + days + "/" + year + " at the " + hours + " hour and " + minutes + " minutes");
    }
}