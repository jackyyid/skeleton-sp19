import org.junit.Test;
import static org.junit.Assert.*;

public class TestPalindrome {
    // You must use this palindrome, and not instantiate
    // new Palindromes, or the autograder might be upset.
    static Palindrome palindrome = new Palindrome();

    @Test
    public void testWordToDeque() {
        Deque dd = palindrome.wordToDeque(null);
        Deque d = palindrome.wordToDeque("persiflage");
        String actual = "";
        for (int i = 0; i < "persiflage".length(); i++) {
            actual += d.removeFirst();
        }
        assertEquals("persiflage", actual);
    }

    @Test
    public void testIsPalindrome() {
        assertTrue(palindrome.isPalindrome(null));
        assertTrue(palindrome.isPalindrome("a"));
        assertFalse(palindrome.isPalindrome("aA"));
        assertFalse(palindrome.isPalindrome("aaaab"));
        assertTrue(palindrome.isPalindrome("AaA"));
        assertTrue(palindrome.isPalindrome("racecar"));
        assertTrue(palindrome.isPalindrome("racecarracecarracecarracecar"));
    }

    @Test
    public void testIsPalindromeCC() {
        CharacterComparator cc = new OffByOne();
        assertTrue(palindrome.isPalindrome("flake", cc));
        assertTrue(palindrome.isPalindrome("cyoz&)%ypxd", cc));
        assertTrue(palindrome.isPalindrome("a", cc));
        assertTrue(palindrome.isPalindrome(null,cc));
        assertFalse(palindrome.isPalindrome("abccba", cc));
        assertFalse(palindrome.isPalindrome("FLake", cc));
        assertFalse(palindrome.isPalindrome("aBbA", cc));
        assertFalse(palindrome.isPalindrome("AabBcBbaA", cc));
    }
}