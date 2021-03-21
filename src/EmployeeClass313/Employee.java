/* Program: Employee Q: 3.13
 * ITCS: 2590 (java 1)
 * Destin Mingledoff
 * 1/28/2021
 * Desc: sets and gives an employees salary, first name, and last name info
 * 
 */ 
package EmployeeClass313;

public class Employee {
    private String firstName; // first Name
    private String lastName; // last Name
    double salary; // monthly Salary Note: The class is going to output the monthly, the Test has
                   // to calculate the yearly salary, as well as calculate and send in any montly raises. 
    public Employee(String firstName, String lastName, double salary){ // constructor initializing first, last names, and monthly salary.
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
        
    } 
    public  void setFirstName(String firstName){ // to rename first name
        this.firstName = firstName;
        }
    
    public  void setLastName(String lastName){ // to rename last name
        this.lastName = lastName;     
        }
    
    public void setSalary(double salary){ // to set salary, will not set values below 0
        this.salary = salary;
        if (salary<0){
            // nothing happens
        }
        if (salary>0){
            this.salary = salary;
        }
    }
    
    public String getFirstName(){ // to retrive first name when called
        return firstName;  
    }
        
    public String getLastName(){ // to retrive last name when called
        return lastName;        
        }
    
    public double getSalary(){ // to retrive salary when called 
        return salary;
    }
        
} // end of class
  