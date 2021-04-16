//Boris Rokhmanov
//Purse Lab Client Code

import java.util.Scanner;
import java.util.ArrayList; 

public class PurseClientCode
{
    public static void main(String[] args)
    {
      Scanner scan = new Scanner(System.in);
      Purse myPurse = new Purse();
      char coinchar;
      
      myPurse.add(new Coin ('Q')); //populates purse with 3 quarters and 4 dimes
      myPurse.add(new Coin ('Q'));
      myPurse.add(new Coin ('Q'));
      myPurse.add(new Coin ('D'));
      myPurse.add(new Coin ('D'));
      myPurse.add(new Coin ('D'));
      myPurse.add(new Coin ('D'));
      
      boolean loop = true;
      while (loop == true){
          System.out.println("1. Add a coin, 2. Remove a coin, 3. Display Purse, 4. Exit ");
          int choice = scan.nextInt();
          if (choice == 1){
              System.out.println("what type of coin? (P,N,D,Q)");
                coinchar = scan.next().charAt(0);
                Coin coinToAdd = new Coin(coinchar);
                System.out.println(myPurse.add(coinToAdd));
            } else if (choice == 2){
                System.out.println("what type of coin? (P,N,D,Q)");
                coinchar = scan.next().charAt(0);
                Coin coinToRemove = new Coin(coinchar);
                System.out.println(myPurse.remove(coinToRemove));
            } else if (choice == 3){
                System.out.println(myPurse);
            } else {
                System.out.println("exiting program...");
                System.exit(-1);
            }
      }
    }
}


/*
 * 1. Add a coin, 2. Remove a coin, 3. Display Purse, 4. Exit 
3
0 Pennies ($0.01 each) 
0 Nickels ($0.05 each) 
4 Dimes ($0.10 each) 
3 Quarters ($0.25 each) 
Total: $1.15
1. Add a coin, 2. Remove a coin, 3. Display Purse, 4. Exit 
1
what type of coin? (P,N,D,Q)
P
Coin added succesfully

1. Add a coin, 2. Remove a coin, 3. Display Purse, 4. Exit 
1
what type of coin? (P,N,D,Q)
N
Coin added succesfully

1. Add a coin, 2. Remove a coin, 3. Display Purse, 4. Exit 
3
1 Pennies ($0.01 each) 
1 Nickels ($0.05 each) 
4 Dimes ($0.10 each) 
3 Quarters ($0.25 each) 
Total: $1.21
1. Add a coin, 2. Remove a coin, 3. Display Purse, 4. Exit 
2
what type of coin? (P,N,D,Q)
D
coin removed
1. Add a coin, 2. Remove a coin, 3. Display Purse, 4. Exit 
2
what type of coin? (P,N,D,Q)
D
coin removed
1. Add a coin, 2. Remove a coin, 3. Display Purse, 4. Exit 
3
1 Pennies ($0.01 each) 
1 Nickels ($0.05 each) 
2 Dimes ($0.10 each) 
3 Quarters ($0.25 each) 
Total: $1.01
1. Add a coin, 2. Remove a coin, 3. Display Purse, 4. Exit 
4
exiting program...
 */