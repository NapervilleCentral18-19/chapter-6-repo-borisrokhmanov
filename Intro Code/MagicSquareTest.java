/********************************************************************
// Starter Code for Magic Square


import
//******************************************************************* */


import java.text.DecimalFormat;
import java.text.NumberFormat;
import javax.swing.*;
import java.util.*;

public class MagicSquareTest

   {final static int MAX = 15;

    public void magicSquare(int [][] input_square){
        
    }
    public boolean isMagic(int [][] ms){
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
      public static void main (String[] args)
   {


    // make a 2d array with an iniitalizer list.
    //If you test this and it not Magic your waving your wand wrong

    int [][] square1 = {{16,3, 2,13},
                        {5,10,11, 8},
                        {9, 6, 7,12},
                        {4,15,14, 1}};

    // magic square or not a magic square, that is the question
    int [][] square2 = {{5,9,1},
                         {7,2,6},
                         {3,4,8}};

    // Do you belive in magic?
    int [][] square3 = {{11,24, 7,20, 3},
                        { 4,12,25, 8,16},
                        {17, 5,13,21, 9},
                        {10,18, 1,14,22},
                        {23, 6,19, 2,15}};

    MagicSquare util= new MagicSquare(square1);

    if (util.isMagic())
        System.out.println("It's MAGIC!! With a sum of "+ util.getMagicNum());
    else
        System.out.println("Hello muggle");

    //change the 2D array and retest
    util.setMagicSquare(square2);

    if (util.isMagic())
            System.out.println("It's MAGIC!! With a sum of "+ util.getMagicNum());
        else
        System.out.println("Hello muggle");

        //change the 2D array and retest
        util.setMagicSquare(square3);

    if (util.isMagic())
                System.out.println("It's MAGIC!! With a sum of "+ util.getMagicNum());
            else
        System.out.println("Hello muggle");





}//end of main
}// end of class











