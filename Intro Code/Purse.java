//Boris Rokhmanov
//Purse lab

import java.util.*;
public class Purse
{
    private ArrayList <Coin> contents;
    
   public Purse(ArrayList <Coin> contents){
       this.contents = contents;
   }
   
   public double getTotal(){
       int totalVal = 0;
       for (int i = 0; i < contents.size(); i++){
           totalVal += contents.get(i).getVal();
       }
       return totalVal;
   }
   
   public int getNumberofDimes(){
       int dimeVal = 0;
       for (int i = 0; i < contents.size(); i++){
           if (contents.get(i).getType() == 'D')
               dimeVal++;
       }
       return dimeVal;
   }
   
   public int getNumberofPenny(){
       int pennyVal = 0;
       for (int i = 0; i < contents.size(); i++){
           if (contents.get(i).getType() == 'P')
               pennyVal++;
       }
       return pennyVal;
   }
   
   public int getNumberofNickels(){
       int nickelVal = 0;
       for (int i = 0; i < contents.size(); i++){
           if (contents.get(i).getType() == 'N')
               nickelVal++;
       }
       return nickelVal;
   }
   
   public int getNumberofQuarters(){
       int quarterVal = 0;
       for (int i = 0; i < contents.size(); i++){
           if (contents.get(i).getType() == 'Q')
               quarterVal++;
       }
       return quarterVal;
   }
   
   public String toString(){
       int pennyVal = this.getNumberofPenny();
       int nickelVal = this.getNumberofNickels();
       int dimeVal = this.getNumberofDimes();
       int quarterVal = this.getNumberofQuarters(); //gets amount of each + total val of all coins
       double total = this.getTotal();
       
       return pennyVal + " Penny    0.01\n"
       + nickelVal + "Nickel    0.05\n"
       + dimeVal + " Dime    0.10\n"
       + quarterVal + " Quarter    0.25\n" //prints values out
       + "Total $" + total;
   }
   
   public static void main(String args){
        Scanner scan = new Scanner(System.in);
       
        ArrayList <Coin> contents = new ArrayList <Coin>();
        Coin coin1 = new Coin(0.25, 'Q');
        Coin coin2 = new Coin(0.25, 'Q');
        Coin coin3 = new Coin(0.25, 'Q');
        Coin coin4 = new Coin(0.25, 'Q');
        Coin coin5 = new Coin(0.25, 'Q');
        contents.add(coin1);
        contents.add(coin2);
        contents.add(coin3);
        contents.add(coin4); //defines the 5 initial coins and adds them to purse ArrayList
        contents.add(coin5);
        
        boolean loop = true;
        while (loop){
            System.out.println("A - Add a coin\n"
            + "R - Remove a coin\n"
            + "? - Display Purse\n"
            + "E - Exit");
            System.out.println("Option: ");
            String choice = scan.nextLine();
            
        }
   }
}
