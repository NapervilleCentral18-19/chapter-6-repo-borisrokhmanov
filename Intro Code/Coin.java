
import java.util.Random;

public class Coin
{
   private double amount;
   private char type;
   private String nameOfCoin;

   public Coin (char typeOfCoin)
   {
        type = typeOfCoin;
        if (type == 'P'){
          amount = 0.01;
          nameOfCoin = "Penny";
        } else if (type == 'N'){
            amount = 0.05;
            nameOfCoin = "Nickel";
        } else if (type == 'D'){
            amount = 0.10;
            nameOfCoin = "Dime";
        } else {
            amount = 0.25;
            nameOfCoin = "Quarter";
        }
      
   }
   
   public double getValue()
   {
       return amount;
   }
   
   public char getType()
   {
       return type;
   }

   /**-----------------------------------------------------------------
   *  Returns the current face of the coin as a string.
        @return String
   */
   public String toString()
   {
      return (nameOfCoin + ", worth " + amount);
   }
}