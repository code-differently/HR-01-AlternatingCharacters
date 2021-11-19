import java.util.Scanner;

public class Solution {

    /*
     * Complete the 'alternatingCharacters' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts STRING s as parameter.
     */

    public int alternatingCharacters(String s) {
        /*Scanner stu = new Scanner(System.in);
        int t = stu.nextInt();
        stu.nextLine();
        while (t-- > 0) {
            int count = 0;
            String str = stu.nextLine();
            for (int i = 1; i < str.length(); i++) {
                if (str.charAt(i) == str.charAt(i - 1)) {
                    count++;
                }
            }
            System.out.println(count);*/

        int deletions = 0;
        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) == s.charAt(i+1)) {
                deletions++;
            }
        }
        return deletions;
    }
}
            // create a loop to go through every char
            // find every copy next to an original
            // remove each copy that is direct;y next to an original
            // return statement w/o copies