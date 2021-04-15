import java.util.*;

public class WordPairList
{
    // instance variables - replace the example below with your own
    private ArrayList<WordPair> allPairs;

    /**
     * Constructs a WordPairList object as described in part (a).
     * Precondition: words.length >= 2
     */
    public WordPairList(String[] words)
    {
        // to be completed as part (a)
        for (int i = 0; i < words.length; i++)
        {
            for (int j = i + 1; j < words.length; j++)
            {
                WordPair wordPair = new WordPair(words[i], words[j]);
                allPairs.add(wordPair);
            }
        }
    }

    /**
     * Returns the number of matches as described in part (b).
     */
    public int numMatches()
    {
        // to be completed as part (b)
        int matches = 0;
        for(int w = 0; w < allPairs.length; w++)
        {
            if (allPairs.get(w).getFirst().equals(allPairs.get(w).getSecond()))
                matches++;
        }
        return matches;
    }
}