public class Main {

    /**
     * #1: Print the number of integers in an array that are above the given input and the number that are below, 
     * e.g. for the array [1, 5, 2, 1, 10] with input 6, print “above: 1, below: 4”.
     * 
     */
    public static void printIntegersAboveBelow(int arr[], int inputNum) {
        int above = 0;
        int below = 0;

        for (int n : arr) {
            if (inputNum < n) {
                below++;
            }
            else if (inputNum > n) {
                above++;
            }
        }

        System.out.printf("above: %d, below: %d\n", above, below);
    }

    /** 
     * #2: Rotate the characters in a string by a given input and have the overflow appear at the beginning, 
     * e.g. “MyString” rotated by 2 is “ngMyStri”.
     * 
     */
    public static String rotateString(String str, int dist) {
        String head, tail;

        if (dist < 0) {
            dist = Math.abs(dist) % str.length();
        } else {
            dist = str.length() - dist % str.length();
        }

        head = str.substring(dist);
        tail = str.substring(0, dist);

        return head.concat(tail);
    }


    /**
     * #3: My favorite framework is Laravel. If I could change one thing about it, I'd make the ORM more efficient for complex queries. 
     * While it's possible to query using raw sql, additional database requests are still required to make use of Laravel's models 
     * once the data has been retrieved.
     * 
     */

    public static void main(String args[]) {

        int array[] = { 1, 5, 2, 1, 10};
        printIntegersAboveBelow(array, 6);

        System.out.println("");

        String str = "MyString";  
        System.out.printf("Input: %s\n", str);
        int rotateN[] = {2, -3, 12, -9, 0};
        for (int n : rotateN) {
            System.out.printf("Rotate(%d): %s\n", n, rotateString(str, n));
        }
    }

}