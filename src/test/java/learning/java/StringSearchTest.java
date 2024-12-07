package learning.java;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringSearchTest {
    @Test
    void testSearchWord_Found() {
        StringSearch stringSearch = new StringSearch();
        String text = "Ця програма демонструє пошук слова в рядку.";
        String word = "пошук";

        int result = stringSearch.searchWord(text, word);
        assertEquals(23, result);
    }

    @Test
    void testSearchWord_NotFound() {
        StringSearch stringSearch = new StringSearch();
        String text = "Ця програма демонструє пошук слова в рядку.";
        String word = "відсутнє";

        int result = stringSearch.searchWord(text, word);
        assertEquals(-1, result);
    }

    @Test
    void testSearchWord_EmptyText() {
        StringSearch stringSearch = new StringSearch();

        int result = stringSearch.searchWord("", "пошук");
        assertEquals(-1, result);
    }

    @Test
    void testSearchWord_EmptyWord() {
        StringSearch stringSearch = new StringSearch();

        int result = stringSearch.searchWord("Ця програма", "");
        assertEquals(-1, result);
    }

    @Test
    void testContainsWord_Found() {
        StringSearch stringSearch = new StringSearch();
        String text = "Ця програма демонструє пошук слова в рядку.";
        String word = "пошук";

        boolean result = stringSearch.containsWord(text, word);
        assertTrue(result);
    }

    @Test
    void testContainsWord_NotFound() {
        StringSearch stringSearch = new StringSearch();
        String text = "Ця програма демонструє пошук слова в рядку.";
        String word = "відсутнє";

        boolean result = stringSearch.containsWord(text, word);
        assertFalse(result);
    }

}