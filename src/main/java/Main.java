// 3.11 (Find the number of days in a month) Write a program that prompts the user to enter the month and year and displays the number of days in the month.
import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    
    // Prompt the user to enter a month
    System.out.print("Enter a month (1-12): ");
    int month = input.nextInt();
    
    // Promt the user to enter a year
    System.out.print("Enter a year: ");
    int year = input.nextInt();
    
    String monthName = "";
    int days = 0;

    // Determine the number of days in the month
    switch (month) {
      case 1:
          monthName = "January";
          days = 31;
          break;
      case 2:
        monthName = "February";
        // Determine if the year is a leap year
        days = (year % 4 == 0 && year % 100 != 0 )|| (year % 400 == 0) ? 29 : 28;
          break;
      case 3:
          monthName = "March";
          days = 31;
          break;
      case 4:
          monthName = "April";
          days = 30;
          break;
      case 5:
          monthName = "May";
          days = 31;
          break;
      case 6:
          monthName = "June";
          days = 30;
          break;
      case 7:
          monthName = "July";
          days = 31;
          break;
      case 8:
          monthName = "August";
          days = 31;
          break;
      case 9:
          monthName = "September";
          days = 30;
          break;
      case 10:
          monthName = "October";
          days = 31;
          break;
      case 11:
          monthName = "November";
          days = 30;
          break;
      case 12:  
          monthName = "December";
          days = 31;
          break;
    }
    // Print the month name, year, and number of days
     System.out.println(monthName + " " + year + " has " + days + " days");  
    }

  
}