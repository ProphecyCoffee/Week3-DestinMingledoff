/* Program: ModifiedAccountTest Q: 3.11
 * ITCS: 2590 (java 1)
 * Destin Mingledoff
 * 1/26/2021
 * Desc: Modifying class "AccountTest" to create the withdrawl object, show the initial balances, print wether-"
 * Notes: or not the withdrawl went through, and print the final balance after.
 */ 
package ModifiedAccountClass311;
//import java.util.Scanner;

public class ModifiedAccountTest {
    public static void main(String[] args) {
        // creating account objects
        ModifiedAccountClass account1 = new ModifiedAccountClass("Jane Green", 50.00); // account object 1
        
        ModifiedAccountClass account2 = new ModifiedAccountClass("John Blue", 17.53); // account object 2
        // display initial balance of each objects
        System.out.printf("%s, your balance is %.2f.%n", account1.getName(), account1.getBalance());
        System.out.printf("%s, your balance is %.2f.%n", account2.getName(), account2.getBalance());
        
        account1.withdraw(20.00); // attempting withdrawl for account 1
        account2.withdraw(20.00); // attempting withdrawl for account 2
        
        // display final balances of objects
        System.out.printf("%s, your balance is %.2f.%n", account1.getName(), account1.getBalance());
        System.out.printf("%s, your balance is %.2f.%n", account2.getName(), account2.getBalance());
        
        
    }
    
}
