/* Program: Date Q: 3.14
 * ITCS: 2590 (java 1)
 * Destin Mingledoff
 * 1/32/2021
 * Desc: This class takes in, stores, and returns the month, day, and year respectively, for a  Date object.
 *   It also displays the whole date through a print statement.  
 */ 
package DateClass314;

public class Date {
    private int month;
    private int day;
    private int year;
    
    public Date(int month, int day, int year){
        this.month = month;
        this.day = day;
        this.year = year;
    }
    // display Date method: Displays (prints--not returning) the month, day, and year seperated by '/'s. 
    public void displayDate(){
    
        System.out.printf("The date is: %d/%d/%d.%n",
                month, day, year);
    }
    // set methods for month, day, and year.
    
    //set month
    public void setMonth(int month){
    
        this.month = month;
    }
    // set day 
    public void setDay(int day){
        this.day = day;
    }
    // set year
    public void setYear(int year){
        this.year = year;
    }
    
    // get Date methods: Returns the stores values of day, month, and year.
    
   
    // get month
    public int getMonth(){
        return month;
    }
    
    //get day
    public int getDay(){
        return day;
    }
    
    // get year
    
    public int getYear(){
        return year;
    }
            
    
    
}
