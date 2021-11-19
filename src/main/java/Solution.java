public class Solution {
    /*
     * Complete the 'alternatingCharacters' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts STRING s as parameter.
     */

    public Integer alternatingCharacters(String s) {
        Integer collection = 0;
        for(int i = 1; i < s.length(); i++){
            if(s.charAt(i) == s.charAt(i - 1)) {
                collection++;
            }
        }
        return collection;
    }
}
