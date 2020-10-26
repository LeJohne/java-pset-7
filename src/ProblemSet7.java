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
            return false;
        }else {
            double n = Math.ceil(text.length() / 2);
            int l = (int) n;
            String first = text.substring(l - 1, l);
            String mid = text.substring(l, l + 1);
            String last = text.substring(l + 1, l + 2);
            text = first.concat(mid);
            text = text.concat(last);

            return target.equals(text);
        }
    }

    /*
     * Exercise 5.
     *
     * Given a string and a character, compute the number of words that end in suffix.
     */
    public int countMe(String text, char suffix) {
        String suffix1 = Character.toString(suffix);
        int counter = 0;

        if(text == null || !Character.isLetter(suffix) || text.length() == 0){
            return -1;
        } else{
            String [] array;
            array = text.split(" ", 1000);

            for (String word : array) {
                if (word.endsWith(suffix1)) {
                    counter++;
                }
            }

            return counter;
        }
    }

    /*
     * Exercise 6.
     *
     * Given a string, compute the number of triplets in text.
     */
    public int triplets(String text) {
        if (text == null){
            return -1;

        } else {
            int counter = 0;
            for(int x = 1; x < text.length()-1; x++){
                if(text.charAt(x) == text.charAt(x+1) && text.charAt(x) == text.charAt(x-1)){
                    counter++;
                }
            }
            return counter;
        }
    }

    /*
     * Exercise 7.
     *
     * Given a string, compute the sum of the digits in text.
     */
    public long addMe(String text) {

        int sum = 0;
        if (text == null){
            return -1;
        }else {
            for(int x = 0; x < text.length(); x++){
                if(Character.isDigit(text.charAt(x))){
                    sum += Character.getNumericValue(text.charAt(x));
                }
            }
            return sum;
        }

    }

    /*
     * Exercise 8.
     *
     * Given a string, compute the length of the longest sequence.
     */
    public long sequence(String text) {
        int count = 1;
        int end = 1;
        if(text == null){
            return -1;
        } else if (text == ""){
            return 0;
        } else {
            for(int x = 0; x < text.length() - 1; x++){
                if(text.charAt(x) == text.charAt(x + 1)){
                    count++;
                    if (count > end){
                        end = count;
                    }
                } else {
                    count = 1;
                }
            }
            return end;
        }
    }

    /*
     * Exercise 9.
     *
     * Given two strings, return a new string built by intertwining each of the
     * characters of a and b.
     */
    public String intertwine(String a, String b) {

        String c = "";
        if(a == null || b == null){
            return null;
        }else {
            if(a.length() >= b.length()){
                for (int x = 0; x < b.length(); x++ ){
                    c += a.charAt(x);
                    c += b.charAt(x);
                }
                c += a.substring(b.length());
            } else{
                for(int x = 0; x < a.length (); x++ ){
                    c += a.charAt(x);
                    c += b.charAt(x);
                }
                c += b.substring(a.length());
            }
            return c;
        }


    }

    /*
     * Exercise 10.
     *
     * Given a string, determine whether or not it is a palindrome.
     */
    public boolean isPalindrome(String text) {

        String backward = "";
        int number = 0;
        if(text == null){
            return false;
        }else{
            number = text.length() - 1;
            for(int x = number; x >= 0; x--){
                backward += "" + text.charAt(x);
            }
            return backward.equals(text);
        }

    }
}
