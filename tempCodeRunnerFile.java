import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class stringTest {

    @Test
    void testCharacterAtIndex() {
        String str1 = "harsh chouksey";
        char expectedChar = 'h'; // The character at index 5 in "harsh chouksey"
        assertEquals(expectedChar, str1.charAt(5), "The character at index 5 should be 'h'");
    }
}