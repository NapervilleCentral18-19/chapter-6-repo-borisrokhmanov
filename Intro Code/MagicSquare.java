
import java.text.DecimalFormat;
import java.text.NumberFormat;
import javax.swing.*;
import java.util.*;

public class MagicSquare
{
    public MagicSquare(int magicnum){
        int [] [] magicSquareArray = new int[magicnum] [magicnum];
    }
    
    public boolean isMagic(int[] [] ms){
        int initVal = 0;
        for (int i= 0; i < ms[0].length; i++) //gets sum of first row to create general value to compare to
            initVal += ms[0][i];
            
        int temp = 0;
        for (int i = 0; i < ms.length; i++){ //compares rows
            for (int j = 0; i < ms[i].length; i++)
                temp += ms[i][j];
            if (temp != initVal){
                return false;
            }
            temp = 0;
        }
        
        for (int i = 0; i < ms.length; i++){ //compares columns
            for (int j = 0; i < ms.length; i++)
                temp += ms[j][i];
            if (temp != initVal){
                return false;
            }
            temp = 0;
        }
        
        for (int i = 0; i < ms.length; i++){ //compares both diagonals
            temp += ms[i][i];
            if (temp != initVal){
                return false;
            }
            temp = 0;
        }
        
        return true;
    }
    
    public void main(String args){
        
    }
}
