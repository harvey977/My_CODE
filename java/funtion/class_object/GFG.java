import java.util.*;

// Main class
public class GFG {

    // Main driver method
    public static void main(String args[]) {

        // Input strings
        String mydelim = " : ";
        String mystr = "JAVA : Code : String : Tokenizer : Geeks";

        // Use of Constructor 2
        // Here we are passing Delimiter - "mydelim"
        StringTokenizer geeks3 = new StringTokenizer(mystr, mydelim);

        // Printing count of tokens and tokens
        // using countTokens() method
        int count = geeks3.countTokens();
        System.out.println("Number of tokens : " + count + "\n");

        // Iterating to get the tokens
        for (int i = 0; i < count; i++)
            System.out.println("token at [" + i + "] : "
                    + geeks3.nextToken());

        // checks for more tokens using hasMoreTokens() method
        // which holds true till there is single element remaining
        while (geeks3.hasMoreTokens())

            // Returning the next token
            // using nextToken() method
            System.out.println(geeks3.nextToken());
    }
}