package chapter4;

import java.util.Scanner;

/**
 * Takes a year and the first three letters of a month and
 * displays the number of days in the month.
 */
public class DaysOfAMonth
{
    public static void main(String[] args)
    {
        // Get input
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int year = input.nextInt();
        input.nextLine(); // eat the rest of line
        System.out.print("Enter a month (ex. \"Jan\"): ");
        String month = input.nextLine();

        boolean isLeapYear = (year % 4 == 0 && year % 100 != 0) || year % 400 == 0;
        int daysInMonth = 0;
        switch (month)
        {
            case "Jan":
            case "Mar":
            case "May":
            case "Jul":
            case "Aug":
            case "Oct":
            case "Dec":
                daysInMonth = 31;
                break;
            case "Feb":
                daysInMonth = isLeapYear ? 29: 28;
                break;
            case "Apr":
            case "Jun":
            case "Sep":
            case "Nov":
                daysInMonth = 30;
                break;
        }
        System.out.println(month + " " + year + " has " + daysInMonth + " days");
    }
}
