/* Program: ModifiedAccountClass Q: 3.11
 * ITCS: 2590 (java 1)
 * Destin Mingledoff
 * 1/26/2021
 * Desc: Modifying class "Account" to provide a withdraw method that takes money from an "Account."
 * Notes: Withdrawl method can not exceed account balance--If it does, it doesnt take money out, and prints a reply.
 */ 
package ModifiedAccountClass311;

public class ModifiedAccountClass {
    private String name; //instance variable
    private double balance; // instance variable
    // Account constructor that receives two parameters
    public ModifiedAccountClass(String name, double balance){
        this.name = name; // assign name to instance var name.
        // valdiate that the balance is greater than 0.0; if its not, instance var balance keeps its default initial value of 0.0.
        if (balance > 0.0){
            this.balance = balance; // assign it to instance variable balance
        }
    }
        // method that withdraws (subbtracts) only a valid amount from the balance, also prints a
        // message depending on which condition is met. 
    public void withdraw(double withdrawl){
        if (withdrawl <= balance){ // if the withdrawl Amount is valid
            
            System.out.printf("%s has withdrawn: $%.2f from their balance of $%.2f.%n", name, withdrawl, balance); // prints withdrawl approval.
            balance = balance - withdrawl; // calculates withdrawl from balance and stores
        }
        if (withdrawl > balance){ // if withdrawl is invalid
            System.out.printf("%s, your withdrawl amount of %.2f exceeded your account balance. %n", name, withdrawl); // prints invalid response.
        }

        } 
    
    // method returns a balance for the object before or after a change in its value.
    public double getBalance(){
        return balance;
    }
        // method that returns the name of the object. 
    public String getName() {
        return name;
        }
}

