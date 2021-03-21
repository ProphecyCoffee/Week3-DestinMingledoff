/* Program: Invoice Q: 3.12
 * ITCS: 2590 (java 1)
 * Destin Mingledoff
 * 1/28/2021
 * Desc: Class for making Invoice Objects: Holds methods for Get and Set and calculate the ammount due, the quantity of each item ordered-
 * 
 */ 
package InvoiceClass312;

public class Invoice {
    private String partNumber; // part number
    private String partDescription; // description
    private int itemQty; // num of items (not part num, tis quantity)
    double unitPrice; // price per item
    public Invoice(String partNumber, String partDescription, int itemQty, double unitPrice){ // initializing instance vars
        this.partNumber = partNumber;
        this.partDescription = partDescription;
        this.itemQty = itemQty;
        this.unitPrice = unitPrice;
       
    } 
    public double getInvoiceAmount(){ // calculating and returning Invoice Amount 
        double value = itemQty*unitPrice;
        return value; 
        }
    public  void setPartNumber(String partNumber){ // setting part number
        this.partNumber = partNumber;
         
        }
    public  void setPartDescription(String partDescription){ // seting part description
        this.partDescription = partDescription;
         
        }
    public  void setItemQty(int itemQty){ // setting item quantity will not set negative parameters
        this.itemQty = itemQty;
        if (itemQty<0){
            this.itemQty = 0;
        }
        if (unitPrice<0){
            this.unitPrice = 0.0;
        }
         
        } 
    public  void setUnitPrice(double unitPrice){ // setting unit price will not set negative parameters
        this.unitPrice = unitPrice;
        if (unitPrice<0){
            this.unitPrice = 0.0;
        }
        } 
        public  String getPartNumber(){ // fetching part number 
        return partNumber;
         
        }
    public  String getPartDescription(){ // fetching part description
        return partDescription;
         
        }
    public  int getItemQty(){ // fetching item quantity
        return itemQty;
         
        } 
    public double getUnitPrice(){ // fetching unit price per item
        return unitPrice;
    }
        
    }

    

