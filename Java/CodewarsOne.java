

public class CodewarsOne {
    public static void main(String[] args){


        System.out.println(validPhoneNumber("(123) 456-7890"));
        System.out.println(validPhoneNumber("(1111)555 2345"));
        System.out.println(validPhoneNumber("(098) 123 4567"));

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
}
