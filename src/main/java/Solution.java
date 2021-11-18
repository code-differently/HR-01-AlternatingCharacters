public class Solution {

    /*
     * Complete the 'alternatingCharacters' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts STRING s as parameter.
     */

    public int alternatingCharacters(String s) {
        int count = 0;
        for(int i = 0; i<s.length()-1; i++){
            if(s.charAt(i) == s.charAt(i+1)) {
                count++;
            }
        }
        return count;

    }
}
