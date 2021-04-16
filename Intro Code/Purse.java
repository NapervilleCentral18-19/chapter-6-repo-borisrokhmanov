import java.util.ArrayList;
import java.text.NumberFormat;

public class Purse
{
    private ArrayList <Coin> change = new ArrayList();
    private NumberFormat fmt = NumberFormat.getCurrencyInstance();

    public String add (Coin addCoin){
        change.add(addCoin);
        return "Coin added succesfully\n";
    }
    
    public String remove (Coin addCoin){
        for (int i = 0; i <= change.size() - 1; i++){
            if ( change.get(i).getValue() == (addCoin.getValue())){
                change.remove(i);
                return "coin removed";
            }
        }
        return "error: coin could not be removed";
    }

    public double getTotal(){
        double coinSum = 0;
        for (int i = 0; i <= change.size() - 1; i++){
            coinSum += change.get(i).getValue();
        }
        return coinSum;
    }
    
    public int getNumberOfPennies(){
        int count = 0;
        for (int i = 0; i <= change.size() - 1; i++){
            if(change.get(i).getType() == ('P'))
                count++;
        }
        return count;
    }
    
    public int getNumberOfNickels(){
        int count = 0;
        for (int i = 0; i <= change.size() -1; i++){
            if(change.get(i).getType() == ('N'))
                count++;
        }
        return count;
    }
    
    public int getNumberOfDimes(){
        int count = 0;
        for (int i = 0; i <= change.size() - 1; i++) {
            if(change.get(i).getType() == ('D'))
                count++;
        }
        return count;
    }
    
    public int getNumberOfQuarters(){
        int count = 0;
        for (int i = 0; i <= change.size() -1; i++) {
            if(change.get(i).getType() == ('Q'))
                count++;
        }
        return count;
    }
    
    public String toString(){
        return getNumberOfPennies()  + " Pennies ($0.01 each) \n" 
             + getNumberOfNickels()  + " Nickels ($0.05 each) \n" 
             + getNumberOfDimes()    + " Dimes ($0.10 each) \n" 
             + getNumberOfQuarters() + " Quarters ($0.25 each) \n"
             + "Total: " + fmt.format(getTotal());
    }
}
