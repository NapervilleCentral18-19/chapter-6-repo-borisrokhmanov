//Boris Rokhmanov
//coin class for purse lab

public class Coin
{
    private double value;
    private char type;
    
    public Coin(double value, char type){
        this.value = value;
        this.type = type;
    }
    
    public String toString(){
        return type + " "+ value;
    }
    
    public double getVal(){
        return value;
    }
    
    public int getType(){
        return type;
    }
}
