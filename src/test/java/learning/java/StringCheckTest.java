package learning.java;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringCheckTest {
    @Test
    void testIsNotEmpty_ValidString() {
        StringCheck stringCheck = new StringCheck();
        assertTrue(stringCheck.isNotEmpty("Текст"));
    }

    @Test
    void testIsNotEmpty_EmptyString() {
        StringCheck stringCheck = new StringCheck();
        assertFalse(stringCheck.isNotEmpty(""));
    }

    @Test
    void testIsNotEmpty_NullString() {
        StringCheck stringCheck = new StringCheck();
        assertFalse(stringCheck.isNotEmpty(null));
    }

}