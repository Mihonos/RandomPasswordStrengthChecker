import org.apache.commons.lang.RandomStringUtils;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class RandomPasswordStrengthTest {

    public static void printsRandomPasswordAndStrength(String input)
    {
        // Checking lower alphabet in string
        int n = input.length();
        boolean hasLower = false, hasUpper = false,
                hasDigit = false, specialChar = false;
        Set<Character> set = new HashSet<Character>(
                Arrays.asList('!', '@', '#', '$', '%', '^', '&',
                        '*', '(', ')', '-', '+'));
        for (char i : input.toCharArray())
        {
            if (Character.isLowerCase(i))
                hasLower = true;
            if (Character.isUpperCase(i))
                hasUpper = true;
            if (Character.isDigit(i))
                hasDigit = true;
            if (set.contains(i))
                specialChar = true;
        }

        // Strength of password
        System.out.println("Strength of random password is:- ");
        if (hasDigit && hasLower && hasUpper && specialChar
                && (n >= 8))
            System.out.println(" Strong");
        else if ((hasLower || hasUpper || specialChar)
                && (n >= 6))
            System.out.println(" Moderate");
        else
            System.out.println(" Weak");
    }
    //Driver Code
    public static void main(String[] args)
    {
        String input = RandomStringUtils.randomAscii(8);
        printsRandomPasswordAndStrength(input);
        System.out.println("Random password is: " + input);

    }


}
// contributed by Ashish Chhabra

