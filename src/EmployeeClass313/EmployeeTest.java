/* Program: EmployeeTest Q: 3.13
 * ITCS: 2590 (java 1)
 * Destin Mingledoff
 * 1/28/2021
 * Desc: creates 2 employee objects, prints out the objects information such as their salalries, sends in a %10 raised salary, prints and
 * calculates the yearly salary based off of the instance value saved in the object. Changes the employees names as well.  
 * 
 */ 
package EmployeeClass313;

public class EmployeeTest {
    public static void main(String[] args){
        // creating 2 employee objects
        Employee staff1 = new Employee("Struggle II", "Hardinson", 1798.80);
        Employee staff2 = new Employee("Richard III", "SwallowedInWealth", 20000.00);
        
        
        // Calculating and printing yearly salaries
        //
        // Staff 1 printing
        System.out.printf("The yearly salary of %s %s is:  $%.2f%n", 
                staff1.getFirstName(),
                staff1.getLastName(),
                (staff1.getSalary()*12));
        // Staff 2 printing
        System.out.printf("The yearly salary of %s %s is:  $%.2f%n%n", 
                staff2.getFirstName(),
                staff2.getLastName(),
                (staff2.getSalary()*12));
        
        // second phase, setting their yearly saleries to 10% raises
        
        
        // staff1's raise after 1 year printed
        staff1.setSalary(staff1.getSalary()+(staff1.getSalary()*.10));
        System.out.printf("The yearly salary (with a 10%% raise) of %s %s is:  $%.2f%n", 
                staff1.getFirstName(),
                staff1.getLastName(),
                (staff1.getSalary()*12));
        
        // staff2's raise after 1 year printed
        staff2.setSalary(staff2.getSalary()+(staff2.getSalary()*.10));
        System.out.printf("The yearly salary (with a 10%% raise) of %s %s is:  $%.2f%n%n", 
                staff2.getFirstName(),
                staff2.getLastName(),
                (staff2.getSalary()*12));
        
        // changing names
        System.out.println("\nBoth employees have now legally changed their name, thus so must the system here!\n");
        
        // staff 1's name change
        staff1.setFirstName("Alphonse");
        staff1.setLastName("Louivioux");
        
        // staff 2's name change
        staff2.setFirstName("Augustine");
        staff2.setLastName("Valtine");
        
        // staff1's raise after 1 year printed
        staff1.setSalary(staff1.getSalary()+(staff1.getSalary()*.10));
        System.out.printf("The yearly salary of %s %s is:  $%.2f%n", 
                staff1.getFirstName(),
                staff1.getLastName(),
                (staff1.getSalary()*12));
        
        // staff2's raise after 1 year printed
        staff2.setSalary(staff2.getSalary()+(staff2.getSalary()*.10));
        System.out.printf("The yearly salary of %s %s is:  $%.2f%n", 
                staff2.getFirstName(),
                staff2.getLastName(),
                (staff2.getSalary()*12));
        
        
        
        
        
        
    }
}
