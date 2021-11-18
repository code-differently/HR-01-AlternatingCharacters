public class Solution {

    /*
     * Complete the 'alternatingCharacters' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts STRING s as parameter.
     */

    public int alternatingCharacters(String s) {
        // Write your code here
        //check the characters of each string and compare to the first and the next

        //write a for loop to iterate through the characters and increment the count by 1
        int count = 0;
        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) == (s.charAt(i + 1))) {
                count++;
            }
        }
            return count;
        }
    }