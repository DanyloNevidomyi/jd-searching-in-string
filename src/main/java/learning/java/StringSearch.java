package learning.java;

public class StringSearch {

    // пошук слова в рядку
    public int searchWord(String text, String word) {
        if (text == null || word == null || text.isEmpty() || word.isEmpty()) {
            return -1;
        }
        return text.indexOf(word);
    }

    // перевірка чи містить рядок слово
    public boolean containsWord(String text, String word) {
        return text.contains(word);
    }
}
