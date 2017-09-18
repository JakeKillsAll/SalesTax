import javax.swing.JOptionPane;

public class SalesTax
{
   public static void main(String[] args)
   {
      //Sets all constants required contants for tax rates
      final double STATE_TAX = 0.04;
      final double COUNTY_TAX = 0.02;
     
      //Prompts for the end user to enter the purchase amount
      double purchaseAmnt = Double.parseDouble(JOptionPane.showInputDialog(null, "Please enter your purchase amount."));
      
      //Does all required calculations for the output and rounds to two places if applicable
      double totalStateTax = round(purchaseAmnt * STATE_TAX,2);
      double totalCountyTax = round(purchaseAmnt * COUNTY_TAX,2);
      double totalSalesTax = round(totalStateTax + totalCountyTax,2);
      double saleTotal = round(totalSalesTax + purchaseAmnt,2);
      
      //Sets the format for the output
      String output = "Purchase: \t$" + purchaseAmnt + '\n' +
                      "State Tax: \t$" + totalStateTax + '\n' +
                      "County Tax: \t$" + totalCountyTax + '\n'+
                      "Sales Tax: \t$" + totalSalesTax + '\n' + 
                      "Sale Total: \t$" + saleTotal;
                      
      //Creates a popup with the output above
      JOptionPane.showMessageDialog(null, output);
                
      //Ends the thread      
      System.exit(0);
   }
   
   //This method returns a rounded value if the values is longer than 2 decimals
   public static double round(double value, int places) 
   {
       if (places < 0) return value;
   
       long factor = (long) Math.pow(10, places);
       value = value * factor;
       long tmp = Math.round(value);
       return (double) tmp / factor;
   }
}