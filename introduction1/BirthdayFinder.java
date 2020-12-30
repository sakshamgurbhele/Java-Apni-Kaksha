package introduction1;

import java.time.LocalDate;
import java.time.Month;

public class BirthdayFinder{
   public static void main(String args[]) {

    // declare variables for birthday
    int birthDate = 29;
    Month birthMonth = Month.NOVEMBER;

    // get current date
    LocalDate currentDate = LocalDate.now();
    System.out.println("Todays Date: " + currentDate);

    // get current date and month
    int date = currentDate.getDayOfMonth();
    Month month = currentDate.getMonth();

    if(date == birthDate && month == birthMonth) {
      System.out.println("HAPPY BIRTHDAY TO YOU !!");
    }
    else {
      System.out.println("Today is not my birthday.");
    }
   }
}