
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class SolutionTest {

    private Solution solution;

    @BeforeEach
    public void setUp(){
        solution = new Solution();
    }

    @Test
    public void alternatingCharactersTest01(){
        String input = "AAAA";
        int expected = 3;
        int actual = solution.alternatingCharacters(input);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void alternatingCharactersTest02(){
        String input = "BBBBB";
        int expected = 4;
        int actual = solution.alternatingCharacters(input);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void alternatingCharactersTest03(){
        String input = "ABABABAB";
        int expected = 0;
        int actual = solution.alternatingCharacters(input);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void alternatingCharactersTest04(){
        String input = "BABABA";
        int expected = 0;
        int actual = solution.alternatingCharacters(input);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void alternatingCharactersTest05(){
        String input = "AAABBB";
        int expected = 4;
        int actual = solution.alternatingCharacters(input);
        Assertions.assertEquals(expected, actual);
    }
}
