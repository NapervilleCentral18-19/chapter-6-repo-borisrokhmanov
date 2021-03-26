import java.util.*;

public class storeDemo
{
   public Store(){
       
    }
    
   public static void main(String[] args)
   {
      Store myStore = new Store();

      Scanner in = new Scanner(System.in);
      boolean done = false;
      int i = 0;

      while (!done)
      {
         System.out.println("Enter the price: ");
         double d = in.nextDouble();
         if (d == 0)
         {
            done = true;
         }
         else
         {
            // supply your code
         }
      }


      System.out.println("Best customer's name "
            + myStore.nameOfBestCustomer());
   }
}
