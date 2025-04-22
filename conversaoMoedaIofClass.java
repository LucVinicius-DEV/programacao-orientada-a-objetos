public class CurrencyConverter {
  
    public static double dollarToReal(double amount, double dollarPrice) {
        
        double IOF = 0.06;
        double total = amount * dollarPrice;
        double totalWithIOF = total + (total * IOF);
      
        return  totalWithIOF;
    }
   
}
