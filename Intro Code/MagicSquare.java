public class MagicSquare
{
    int num = 0;
    int [][] magicSquare;
    
    public MagicSquare(int [][] arr)
    {
        this.setMagicSquare(arr);
    }
    
    public boolean isMagic()
    {
        int sumRow = 0;
        int sumCol = 0;
        int sumDia1 = 0;
        int sumDia2 = 0;
        for (int row = 0; row < magicSquare.length; row++){ // checks rows to see if equal
            for (int col = 0; col < magicSquare[row].length; col++)
                sumRow += magicSquare[row][col];
            if (sumRow != num)
                return false;
            sumRow = 0;
        }

        for (int col = 0; col < magicSquare.length; col++){ // checks each column to see if equal
            for (int row=0; row < magicSquare[col].length; row++)
                sumCol += magicSquare[row][col];
            if (sumCol != num)
                return false;
            sumCol = 0;
        }
        
        for (int row = 0; row < magicSquare.length; row++) //checks first diagonal (top left to bot right)
            sumDia1 += magicSquare[row][row];
        if (sumDia1 != num)
                return false;
        
        for (int row = 0; row < magicSquare.length; row++){ //checks second diagonal (top right to bot left)
            sumDia2 += magicSquare[magicSquare.length - 1 - row][row];
        }
        if (sumDia2 != num)
                return false;
        
        return true;
    }
    
    public int getMagicNum()
    {
        return num;
    }
    
     //sets the magic square and size of square (magic num)
    public void setMagicSquare(int [][] arr)
    {
        magicSquare = arr;
        num = 0;
        for (int row = 0; row < 1; row++)
        {
            for (int col=0; col < magicSquare[row].length; col++)
                num += magicSquare[row][col];
        }  
    }
}
