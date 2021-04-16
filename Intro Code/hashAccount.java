import java.util.*;  
public class hashAccount
{  
    public static void main (String[] args)
    {
        Account p1 = new Account ("Homer Simpson", 0001, 1090.45, 1);
        Account p2 = new Account ("Homer Simpson", 0002, 786.54, 2);
        Account p3 = new Account ("Bart Simpson", 1564, 4571.60, 1);
        Account p4 = new Account ("Liz Wilson", 1349, 2034.52, 2);
        Account p5 = new Account ("Jack Hagested", 2389, 280.67, 1);
        Account p6 = new Account ("Jack Hagested", 2391, 1008.53, 2);
        Account p7 = new Account ("Emy Hayes", 3598, 1260.84, 1);
        Account p8 = new Account ("Doug Dralle", 4562, 5783.90, 1);
        Account p9 = new Account ("Eric Willhelm", 3208, 3420.75, 1);
        Account p10 = new Account ("Julie Noris", 4568, 9041.49, 2);
        
        Account[] people = {p1,p2,p3,p4,p5,p6,p7,p8,p9,p10};

        for (int i = 1; i < people.length; i++){
           Account key = people[i];
           int j = i;
           while (j > 0 && people[j-1].compareTo(key) > 0){
               people[j] = people[j-1];
               j--;
           }
           people[j] = key;
        }

        System.out.println("Accounts in array:");
        for (Account person : people){
           System.out.println(person);
        }
        
        Hashtable <Integer,Account> hashtable = new Hashtable<>();
        for (int i = 1; i < people.length; i++){
           hashtable.put(people[i].getAccountNumber(), people[i]);
        }
        System.out.println("Hashtable Accounts:");
        System.out.println(hashtable);
    }
}