//Boris Rokhmanov
//Code Word Checker

public class codeWordChecker
{
    public codeWordChecker(int intLim1, int intLim2, String strLim){
        int intLimit1 = intLim1;
        int intLimit2 = intLim2;
        String strLimit = strLim;
    }
    
    public codeWordChecker(String strLimSingle){
        int intLimit1 = 6;
        int intLimit2 = 20;
        String strLimit = strLimSingle;
    }
    
    public boolean isValid(String input, int intLimit1, int intLimit2, String strLimit){
        if(input.length() >= intLimit1 && input.length() <= intLimit2){
            if (!input.contains(strLimit)){
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }
    
    public static void main(String args[]){
        
    }
}
