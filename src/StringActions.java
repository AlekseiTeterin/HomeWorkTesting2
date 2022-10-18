import java.util.Arrays;
import java.util.Locale;

public class StringActions {

    public int CheckingForPalindrome(String s){
        int length = s.length();
        if (length < 2)
            return 1;
        else {
            if (s.charAt(0) != s.charAt(length - 1))
                return 0;
            else
                return CheckingForPalindrome(s.substring(1, length - 1));
        }
    }

    public int WordEntry(String text,String searchingWord){
        return (int) Arrays.stream(text.split(" ")).filter(s -> s.contains(searchingWord)).count();
    }
    public int Vowels(String text){
        String s = text.toLowerCase();
        return (int)(s.chars().filter((x) -> {
           return (x == 'a' || x == 'e' || x == 'i' || x == 'o' || x == 'u');
       }).count());
    }
    public int Consonants(String text){
        char[] sentence = text.replaceAll("[^a-zA-Z]","").toLowerCase().toCharArray();
        return sentence.length - Vowels(text);
    }


}
