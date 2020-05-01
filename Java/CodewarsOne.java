

public class CodewarsOne {
    public static void main(String[] args){


        System.out.println(validPhoneNumber("(123) 456-7890"));
        System.out.println(validPhoneNumber("(1111)555 2345"));
        System.out.println(validPhoneNumber("(098) 123 4567"));


        System.out.println(presses("LOL"));

    }




    //Write a function that accepts a string, and returns true if it is in the form of a phone number.
    //Assume that any integer from 0-9 in any of the spots will produce a valid phone number.
    //
    //Only worry about the following format:
    //(123) 456-7890 (don't forget the space after the close parentheses)
    //
    //Examples:
    //
    //validPhoneNumber("(123) 456-7890")  =>  returns true
    //validPhoneNumber("(1111)555 2345")  => returns false
    //validPhoneNumber("(098) 123 4567")  => returns false

    public static boolean validPhoneNumber(String phoneNumber){

        return phoneNumber.matches("\\(\\d{3}\\) \\d{3}-\\d{4}");

    }


    //  If you have completed the Tribonacci sequence kata, you would know by now that mister Fibonacci has at least a bigger brother.
    //  If not, give it a quick look to get how things work.
    //  Well, time to expand the family a little more: think of a Quadribonacci starting with a signature of 4 elements and each following element is the sum of the 4 previous, a Pentabonacci (well Cinquebonacci would probably sound a bit more italian, but it would also sound really awful) with a signature of 5 elements and each following element is the sum of the 5 previous, and so on.
    //  Well, guess what? You have to build a Xbonacci function that takes a signature of X elements - and remember each next element is the sum of the last X elements - and returns the first n elements of the so seeded sequence.

    public double[] xbonacci(double[] signature, int n) {

        double[] result = new double[n];
        for (int i = 0; i < n; i++) {
            if (i < signature.length) {
                result[i] = signature[i];
            } else {
                for (int j = 1; j <= signature.length; j++) {
                    result[i] += result[i-j];
                }
            }
        }
        return result;
    }

//    Codwars Multi-tap Keypad Text Entry on an Old Mobile Phone
//    Prior to having fancy iPhones, teenagers would wear out their thumbs sending SMS messages on candybar-shaped feature phones with 3x4 numeric keypads.
//
//            ------- ------- -------
//            |     | | ABC | | DEF |
//            |  1  | |  2  | |  3  |
//            ------- ------- -------
//            ------- ------- -------
//            | GHI | | JKL | | MNO |
//            |  4  | |  5  | |  6  |
//            ------- ------- -------
//            ------- ------- -------
//            |PQRS | | TUV | | WXYZ|
//            |  7  | |  8  | |  9  |
//            ------- ------- -------
//            ------- ------- -------
//            |     | |space| |     |
//            |  *  | |  0  | |  #  |
//            ------- ------- -------
//    Prior to the development of T9 (predictive text entry) systems, the method to type words was called "multi-tap" and involved pressing a button repeatedly to cycle through the possible values.
//
//    For example, to type a letter "R" you would press the 7 key three times (as the screen display for the current character cycles through P->Q->R->S->7). A character is "locked in" once the user presses a different key or pauses for a short period of time (thus, no extra button presses are required beyond what is needed for each letter individually). The zero key handles spaces, with one press of the key producing a space and two presses producing a zero.
//
//    In order to send the message "WHERE DO U WANT 2 MEET L8R" a teen would have to actually do 47 button presses. No wonder they abbreviated.
//
//    For this assignment, write a module that can calculate the amount of button presses required for any phrase. Punctuation can be ignored for this exercise. Likewise, you can assume the phone doesn't distinguish between upper/lowercase characters (but you should allow your module to accept input in either for convenience).
//
//    Hint: While it wouldn't take too long to hard code the amount of keypresses for all 26 letters by hand, try to avoid doing so! (Imagine you work at a phone manufacturer who might be testing out different keyboard layouts, and you want to be able to test new ones rapidly.)

    private final static char[][] keys = {
            {'1'}, {'A', 'B', 'C', '2'}, {'D', 'E', 'F', '3'},
            {'G', 'H', 'I', '4'}, {'J', 'K', 'L', '5'}, {'M', 'N', 'O', '6'},
            {'P', 'Q', 'R', 'S', '7'}, {'T', 'U', 'V', '8'}, {'W', 'X', 'Y', 'Z', '9'},
            {'*'}, {' ', '0'}, {'#'},
    };

    public static int presses(String phrase) {
        int presses = 0;
        phrase:
        for (final char letter : phrase.toCharArray()) {
            final char upperLetter = Character.toUpperCase(letter);
            for (final char[] key : keys) {
                for (int i = 0; i < key.length; i++) {
                    if (upperLetter == key[i]) {
                        presses += i + 1;
                        continue phrase;
                    }
                }
            }
        }
        return presses;

    }

    // TODO: Problem 1
// Return true if the given string begins with "mix", except the 'm' can be anything, so "pix", "9ix" .. all count.

    public static boolean mixStart(String str) {
        if (str.length() < 3) return false;
        String two = str.substring(1, 3);
        if (two.equals("ix")) {
            return true;
        } else {
            return false;
        }
    }

    // TODO: Problem 2
// Given two temperatures, return true if one is less than 0 and the other is greater than 100.

    public static boolean icyHot(int temp1, int temp2) {
        if ((temp1 < 0 && temp2 > 100) || (temp1 > 100 && temp2 < 0)) {
            return true;
        } else {
            return false;
        }
    }

    // TODO: Problem 3
// Given three int values, a b c, return the largest.

    public static int intMax(int a, int b, int c) {
        int max;
        if (a > b) {
            max = a;
        } else {
            max = b;
        }
        if (c > max) {
            max = c;
        }
        return max;
    }

}
