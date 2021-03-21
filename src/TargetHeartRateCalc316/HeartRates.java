/* Program: Heart Rate Q: 3.16
 * ITCS: 2590 (java 1)
 * Destin Mingledoff
 * 1/31/2021
 * Desc: class for Heart Rate objects, creates, sets, and gets a persons date of birth, first and last name
 * , maximum heart Rate, age in years, and target heart rate. It also returns maximum heart rate, age in years, and target heart rate.
 */ 
package TargetHeartRateCalc316;


public class HeartRates {
    private String firstName;
    private String lastName;
    private int month;
    private int day;
    private int yearOfBirth;
    public HeartRates(String firstName, String lastName, int month, int day, int yearOfBirth){ // initializing instance variables in consturctor
        this.firstName = firstName;
        this.lastName = lastName;
        this.month = month;
        this.day = day;
        this.yearOfBirth = yearOfBirth;
    }
    public double calculateAge(){ // calculating age subtracting from the 31st of january 2021
        double ageLength = (2021+(31*1)/365) - (yearOfBirth+((day*month)/365));
        return ageLength;
    }
    public double calculateMaxHeartRate(){ // max heart rate calculator
        double maxHeartRate = (220-((2021+(31*1)/365) - (yearOfBirth+((day*month)/365))));
        return maxHeartRate;
    }
    public String calculateTargHeartRate(){ // target heart rate calculator
        double tarHeaRateMin = ((220-((2021+(31*1)/365) - (yearOfBirth+((day*month)/365))))*.5);
        double tarHeaRateMax = ((220-((2021+(31*1)/365) - (yearOfBirth+((day*month)/365))))*.85);
        String targetHeartRate = tarHeaRateMin + "%-" + tarHeaRateMax + "%";
        return targetHeartRate;
    }
    
    // set name info
    
    public  void setFirstName(String firstName){ // to rename first name
        this.firstName = firstName;
        }
    
    public  void setLastName(String lastName){ // to rename last name
        this.lastName = lastName;     
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
    public void setYearOfBirth(int yearOfBirth){
        this.yearOfBirth = yearOfBirth;
    }
    
    
    // get name info

    
    public String getFirstName(){ // to retrive first name when called
        return firstName;  
    }
        
    public String getLastName(){ // to retrive last name when called
        return lastName;        
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
    
    public int getYearOfBirth(){
        return yearOfBirth;
    }
    
    
}
