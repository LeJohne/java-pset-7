public class ProblemSet7 {
    public static void main(String[] args) {}

    /*
     * Exercise 1.
     *
     * Given two strings, return a new string built by surrounding in with the first
     * and last two characters of out.
     */
    public static String surroundMe(String in, String out) {
        if(in == null || out == null || out.length() != 4){
            return in;
        }else {
            return out.substring(0, 2) + in + out.substring(2,4);
        }
    }

    /*
     * Exercise 2.
     *
     * Given a string and an integer, return a new string that represents the first
     * and last n characters of text (overlapping, as needed).
     */
    public String endsMeet(String text, int n) {
        if (text == null || 1 > text.length() || text.length() > 10 || n < 1 || n > text.length()) {
            return text;
        } else {
            return text.substring(0, n) + text.substring(text.length() - n, text.length());
        }
    }
    /*
     * Exercise 3.
     *
     * Given a string, return a new string using the middle three characters of text.
     */
    public String middleMan(String text) {

        if (text == null || text.length()%2 == 0 || text.length() < 3){
            return text;
        } else{
            double n = Math.ceil(text.length() / 2);
            int number = (int)n;

            String first = text.substring(number - 1, number);
            String middle = text.substring(number, number + 1);
            String last = text.substring(number + 1, number + 2);

            text = first.concat(middle);
            text = text.concat(last);

            return text;
        }
    }

    /*
     * Exercise 4.
     *
     * Given two strings, determine whether or not target is equivalent to the middle
     * three characters of text.
     */
    public boolean isCentered(String text, String target) {
        if(text == null || text.length() % 2 == 0 || target == null || target.length() != 3){
            System.out.print(false);
        }else {
            double n = Math.ceil(text.length() / 2);
            int l = (int) n;
            String first = text.substring(l - 1, l);
            String mid = text.substring(l, l + 1);
            String last = text.substring(l + 1, l + 2);
            text = first.concat(mid);
            text = text.concat(last);

            System.out.print(target.equals(text)); ;
        }
    }

    /*
     * Exercise 5.
     *
     * Given a string and a character, compute the number of words that end in suffix.
     */
    public int countMe(String text, char suffix) {


        
    }

    /*
     * Exercise 6.
     *
     * Given a string, compute the number of triplets in text.
     */
    public int triplets(String text) {}

    /*
     * Exercise 7.
     *
     * Given a string, compute the sum of the digits in text.
     */
    public long addMe(String text) {}

    /*
     * Exercise 8.
     *
     * Given a string, compute the length of the longest sequence.
     */
    public long sequence(String text) {}

    /*
     * Exercise 9.
     *
     * Given two strings, return a new string built by intertwining each of the
     * characters of a and b.
     */
    public String intertwine(String a, String b) {}

    /*
     * Exercise 10.
     *
     * Given a string, determine whether or not it is a palindrome.
     */
    public boolean isPalindrome(String text) {}
}
