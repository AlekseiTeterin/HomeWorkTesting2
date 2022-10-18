import org.junit.*;

import static org.junit.Assert.assertEquals;


public class Testing {

    private StringActions testStr;

    @Before
    public void setUp(){
        testStr = new StringActions();
    }

    @After
    public void tearDown(){
        testStr = null;
    }

    @org.junit.Test
    public void testPalindrome(){
        int result = testStr.CheckingForPalindrome("aa");
        assertEquals(1, result, 0);
    }
    @org.junit.Test
    public void testEntry(){
        int result = testStr.WordEntry("it was a fat fat rat and a cat not fat", "fat");
        assertEquals(3, result, 0);
    }

    @org.junit.Test
    public void testVowels(){
        int result = testStr.Vowels("it was a fat fat rat and a cat not fat");
        assertEquals(11, result, 0);
    }

    @org.junit.Test
    public void testConsonants(){
        int result = testStr.Consonants("it was a fat fat rat and a cat not fat");
        assertEquals(17, result, 0);
    }


}
