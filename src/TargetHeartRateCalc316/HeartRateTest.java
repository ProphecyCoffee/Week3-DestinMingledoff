/* Program: HeartRateTest Q: 3.16
 * ITCS: 2590 (java 1)
 * Destin Mingledoff
 * 1/31/2021
 * Desc: Instantiates an object of class HeartRates, prompts the user for information regarding their heart rate, and prints
 * the information for that object: User's first and last name, date of birth. Calculates and prints the person's age in years,
 * maximum heart rate and target-heart-rate range. 
 */ 
package TargetHeartRateCalc316;
import java.util.Scanner; 

public class HeartRateTest {
    
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        
        // inputing first name
        System.out.println("Enter your first name:  ");
        String fName = in.next();
        // inputing last name
        System.out.println("Enter your first name:  ");
        String lName = in.next();
        
        
        // inputing month of birth
        System.out.println("Enter your month of birth:  ");
        int month = in.nextInt();
        // inputing day of birth
        
        System.out.println("Enter your day of birth:  ");
        int day = in.nextInt();
        
        // inputing year of birth
        System.out.println("Enter your year of birth:  ");
        int yOB = in.nextInt();
        
// initializing HeartRates objects for user 1        
        HeartRates user1HR = new HeartRates(fName, lName, month, day, yOB);
        System.out.printf("%s %s:%nThese results are based on the age we have calculated for you based on your info%nAge: %.2f%n"
                + "Max heart rate: %.2f%nTarget heart rate: %s.%n", user1HR.getFirstName(), user1HR.getLastName(),
                user1HR.calculateAge(), user1HR.calculateMaxHeartRate(), user1HR.calculateTargHeartRate());
        //
        
        
        
        
        
        
        
        
        // changing user1HR object
        System.out.println("Enter someone elses info below.");
        
        
        // inputing first name
        System.out.println("Enter a first name:  ");
        String fName2 = in.next();
        user1HR.setFirstName(fName2);
        // inputing last name
        System.out.println("Enter a last name:  ");
        String lName2 = in.next();
        user1HR.setLastName(lName2);
        
        
        // inputing month of birth
        System.out.println("Enter a month of birth:  ");
        int month2 = in.nextInt();
        user1HR.setMonth(month2);
        // inputing day of birth
        
        System.out.println("Enter a day of birth:  ");
        int day2 = in.nextInt();
        user1HR.setDay(day2);
        
        // inputing year of birth
        System.out.println("Enter a year of birth:  ");
        int yOB2 = in.nextInt();
        user1HR.setYearOfBirth(yOB2);
        
        
        //fetching info of each new change
        System.out.printf("First name: %s%nLast name: %s%nBirth Day: %d%nBirth Month: %d%nBirth Year: %d%n", user1HR.getFirstName(),
                user1HR.getLastName(), user1HR.getDay(),
                user1HR.getMonth(),
                user1HR.getYearOfBirth());
                
    
    }
    
    
    
}
