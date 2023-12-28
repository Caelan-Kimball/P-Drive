package timedisplay;

/**
 * October 19, 2017
 * @author Caelan Kimball
 * TimeDisplay.java
 */
public class TimeDisplay {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Declare variables
        int seconds = 10000;
        int hours = seconds/3600;
        //another way to do int leftOverSeconds = seconds % 3600
        int leftOverSeconds = seconds - 3600 * hours;
        int minutes = leftOverSeconds/60;
        leftOverSeconds = leftOverSeconds - 60 * minutes;
        //Begin Output
        System.out.println("Lab 06, 80 point version");
        System.out.println("Starting second: " + seconds);
        System.out.println("Hours:           " + hours);
        System.out.println("Minutes:         " + minutes);
        System.out.println("Seconds:         " + leftOverSeconds);
        //Begin 100 point output
        seconds = 10000;
        int milliSeconds = 10000123;
        int milliHours = milliSeconds/3600000;
        int milliLeftOverSeconds = milliSeconds % 3600_000;
        int milliMinutes = milliLeftOverSeconds/60_000;
        milliLeftOverSeconds = milliLeftOverSeconds % 60_000;
        int milliMilliSeconds = milliLeftOverSeconds/10_00;
       
        
        System.out.println("Lab06Text02, 100 Point Version");
        System.out.println("Starting milli-seconds: " + milliSeconds);
        System.out.println("Hours:                  " + milliHours);
        System.out.println("Minutes:                " + milliMinutes);
        System.out.println("Seconds:                " + milliMilliSeconds);
        milliMilliSeconds = milliLeftOverSeconds % 1000;
        System.out.println("MilliSeconds:           " + milliMilliSeconds);
        
        
        
        
    }
    
}
