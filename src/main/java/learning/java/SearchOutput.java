package learning.java;

public class SearchOutput {
    public void outputResult(int index, String word, String text) {
        if (index != -1) {
            System.out.println("Слово '" + word + "' знайдено");
            System.out.println("Індекс: " + index);
        }
        else {
            System.out.println("Слово '" + word + "' не знайдено у рядку.");
        }
    }
}
