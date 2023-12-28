package birthday;
import java.util.*;

/**
 * December 6, 2017
 * @author Caelan Kimball
 * birthday.java
 */
public class Birthday {
    enum Month { January, Febuary, March, April, May, June, July, August, September, October, November, December};
    enum Weekday {Saturday, Sunday, Monday, Tuesday, Wednesday, Thursday, Friday};

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        int year;
        int month;
        int day;
        
        System.out.print("Enter your birth date (mm/dd/yyyy): ");
        String bDay = input.nextLine();
        String[] date = bDay.split("/");
        month = Integer.parseInt(date[0]);
        day = Integer.parseInt(date[1]);
        year = Integer.parseInt(date[2]);
        
        int last2Digits = year % 100; //find the last two digits of the year
        int result = last2Digits / 4;// step 1 and 2
        result += last2Digits;//step 3
        result += day;//step 4
        
        if(month == Month.January.ordinal() + 1 ||
                month == Month.October.ordinal() + 1)
            result += 1;
        if(month == Month.Febuary.ordinal() + 1 ||
                month == Month.March.ordinal() + 1 ||
                month == Month.November.ordinal() + 1)
        {
            result += 4;
        } 
        if(month == Month.May.ordinal() + 1)
            result += 2;
        if(month == Month.June.ordinal() + 1)
            result += 5;
        if(month == Month.August.ordinal() + 1)
            result += 3;
        if(month == Month.September.ordinal() + 1 ||
                month == Month.December.ordinal() + 1)
            result += 6;
        
        
        //leap year
        boolean isLeapYear = year % 4 == 0 && year % 400 == 0;
        
        if(isLeapYear == true)
        {
            if (month == Month.January.ordinal() + 1 || 
                    month == Month.Febuary.ordinal() + 1)
                result -= 1;
        }
        switch(result % 7)
        {
            case 0:
                System.out.println("You were born on " + Weekday.Saturday);
                break;
            case 1:
                System.out.println("You were born on " + Weekday.Sunday);
                break;
            case 2:
                System.out.println("You were born on " + Weekday.Monday);
                break;
            case 3:
                System.out.println("You were born on " + Weekday.Tuesday);
                break;
            case 4:
                System.out.println("You were born on " + Weekday.Wednesday);
                break;
            case 5:
                System.out.println("You were born on " + Weekday.Thursday);
                break;
            case 6:
                System.out.println("You were born on " + Weekday.Friday);
                break;
                
        }
        System.out.println();
        
    }
    
}
