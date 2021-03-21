/* Program: Date Q:3.14
 * ITCS: 2590 (java 1)
 * Destin Mingledoff
 * 1/28/2021
 * Desc: Demonstrates the abilities of the Date class through objects running the set, get, and displayDate methods.
 */ 
package DateClass314;

public class DateTest {
    public static void main(String[] args){ // main method
        Date date = new Date(4,1,2023); // initializing and creating new date object
    
        // displaying the date stores for date object
        date.displayDate(); 
        
        //configuring a new month, day, and year. 
        System.out.println("!Warning: Reconfiguring date!");
        date.setMonth(8);
        date.setDay(9);
        date.setYear(2045);
        
        // displaying new date configurations respectively.
        System.out.printf("The month is the: %d%n", date.getMonth());
        System.out.printf("The day is: %d%n", date.getDay());
        System.out.printf("The year is: %d%n", date.getYear());
         
        // printing new date configuration through displayDate methods
        date.displayDate();
       
        
           
    }
    
}
