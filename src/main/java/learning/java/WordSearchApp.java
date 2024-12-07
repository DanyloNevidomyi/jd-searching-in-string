package learning.java;

public class WordSearchApp {
    public static void main(String[] args) {
        UserInput userInput = new UserInput();
        StringCheck stringCheck = new StringCheck();
        SearchOutput searchOutput = new SearchOutput();
        StringSearch stringSearch = new StringSearch();

        String text = "Випадкове речення у якому шукатиметься слово";
        String wordToSearch = userInput.getInput();

        if (stringCheck.isNotEmpty(wordToSearch)) {
            int index = stringSearch.searchWord(text, wordToSearch);
            searchOutput.outputResult(index, wordToSearch, text);
        } else {
            System.out.println("Введіть коректне слово для пошуку.");
        }
    }
}
