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
      double totalStateTax = round(purchaseAmnt * STATE_TAX);
      double totalCountyTax = round(purchaseAmnt * COUNTY_TAX);
      double totalSalesTax = round(totalStateTax + totalCountyTax);
      double saleTotal = round(totalSalesTax + purchaseAmnt);
      
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
   
   //This method returns a rounded value to two decimal places
   public static double round(double value) 
   {
      return(double) Math.round(value * 100) / 100;
   }
}