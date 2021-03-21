/* Program: Invoice Q: 3.12
 * ITCS: 2590 (java 1)
 * Destin Mingledoff
 * 1/28/2021
 * Desc: Represents an Invoice for items sold at a store: Should gather, and calculate the ammount due, the quantity of each item ordered-
 * what was ordered, the total of each item ordered is, and the unit price. 
 */ 
package InvoiceClass312;

/**
 *
 * @author desmi
 */
public class InvoiceTest {
    public static void main(String[] args){
        Invoice order1 = new Invoice("0023", "'SimRay gun for CosPlay'", 3, 350.97 );
            // 1t object to be created, this is from Sims 4 as well, the scientist career. You can freeze people with this, and even make them dance
            //against their will!
        Invoice order4 = new Invoice("0024", "This is a replica of the Sims 4 CowPlant", 5, 200.98); 
            // 4th object
           
        Invoice order3 = new Invoice("0025", "This is a replica of Thor's Hammer, totally not stolen from Marvel Studios!", 900, 200); 
            // ^^^ 3rd object
        Invoice order2 = new Invoice("0026", "This is a copy of Bill Gates secret journal to getting rich!", 10, 3097.54 ); 
            // 4th object which will work as well without being reset to 0, hopefully 10 lucky people actually find worth in this...
            // sca-*cough* book of well written advice! 
            // printing invoices
            //invoice 1 printing
        System.out.printf("This is part number: #%s\t\t Description: %s\nQuantity: %d\t\t\t\t Unit Price: $%.2f%nOrder Amount: $%.2f%n"
                + "---------------------------------------------------------------------"
                + "--------------------------------------------------------------%n",
                order1.getPartNumber(), order1.getPartDescription(),
                order1.getItemQty(), order1.getUnitPrice(), order1.getInvoiceAmount());
        
        // invoice 4 printing (out of order I know)
        System.out.printf("This is part number: #%s\t\t Description: %s\nQuantity: %d\t\t\t\t Unit Price: $%.2f%nOrder Amount: $%.2f%n"
                + "---------------------------------------------------------------------"
                + "--------------------------------------------------------------%n",
                order4.getPartNumber(), order4.getPartDescription(),
                order4.getItemQty(), order4.getUnitPrice(), order4.getInvoiceAmount());
        // invoice 3 printing (out of order)
        System.out.printf("This is part number: #%s\t\t Description: %s\nQuantity: %d\t\t\t\t Unit Price: $%.2f%nOrder Amount: $%.2f%n"
                + "---------------------------------------------------------------------"
                + "--------------------------------------------------------------%n",
                order3.getPartNumber(), order3.getPartDescription(),
                order3.getItemQty(), order3.getUnitPrice(), order3.getInvoiceAmount());
        // invoice 2 printing
        System.out.printf("This is part number: #%s\t\t Description: %s\nQuantity: %d\t\t\t\t Unit Price: $%.2f%nOrder Amount: $%.2f%n"
                + "---------------------------------------------------------------------"
                + "--------------------------------------------------------------%n",
                order2.getPartNumber(), order2.getPartDescription(),
                order2.getItemQty(), order2.getUnitPrice(), order2.getInvoiceAmount());
        
        // reconfiguring objects on Invoices
        // order 1 
        order1.setItemQty(20);
        order1.setPartDescription("Zeus' Lightning");
        order1.setPartNumber("2021");
        order1.setUnitPrice(9234.45);
        // order 2
        order2.setItemQty(30);    
        order2.setPartDescription("Gucci Belt");
        order2.setPartNumber("2020");
        order2.setUnitPrice(-9400.90);
        // order 3
        order3.setItemQty(10);    
        order3.setPartDescription("Dinoysus' Ipad and wineglass");
        order3.setPartNumber("2023");
        order3.setUnitPrice(20000.93);
        // order 4
        order4.setItemQty(-90);    
        order4.setPartDescription("Bottle of Stress");
        order4.setPartNumber("2025");
        order4.setUnitPrice(90);
        
        // printing invoices
        //adding some spacing
        System.out.println("");
        System.out.println("New Invoice Order");
        System.out.println("");
            //invoice 1 printing
        System.out.printf("This is part number: #%s\t\t Description: %s\nQuantity: %d\t\t\t\t Unit Price: $%.2f%nOrder Amount: $%.2f%n"
                + "---------------------------------------------------------------------"
                + "--------------------------------------------------------------%n",
                order1.getPartNumber(), order1.getPartDescription(),
                order1.getItemQty(), order1.getUnitPrice(), order1.getInvoiceAmount());
        
        // invoice 4 printing (out of order I know)
        System.out.printf("This is part number: #%s\t\t Description: %s\nQuantity: %d\t\t\t\t Unit Price: $%.2f%nOrder Amount: $%.2f%n"
                + "---------------------------------------------------------------------"
                + "--------------------------------------------------------------%n",
                order4.getPartNumber(), order4.getPartDescription(),
                order4.getItemQty(), order4.getUnitPrice(), order4.getInvoiceAmount());
        // invoice 3 printing (out of order)
        System.out.printf("This is part number: #%s\t\t Description: %s\nQuantity: %d\t\t\t\t Unit Price: $%.2f%nOrder Amount: $%.2f%n"
                + "---------------------------------------------------------------------"
                + "--------------------------------------------------------------%n",
                order3.getPartNumber(), order3.getPartDescription(),
                order3.getItemQty(), order3.getUnitPrice(), order3.getInvoiceAmount());
        // invoice 2 printing
        System.out.printf("This is part number: #%s\t\t Description: %s\nQuantity: %d\t\t\t\t Unit Price: $%.2f%nOrder Amount: $%.2f%n"
                + "---------------------------------------------------------------------"
                + "--------------------------------------------------------------%n",
                order2.getPartNumber(), order2.getPartDescription(),
                order2.getItemQty(), order2.getUnitPrice(), order2.getInvoiceAmount());
        
    
    
    
    }
    
    
}
