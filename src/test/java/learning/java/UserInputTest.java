package learning.java;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;

import static org.junit.jupiter.api.Assertions.*;
class UserInputTest {
    @Test
    void testGetInput() {
        String simulatedInput = "пошук";
        System.setIn(new ByteArrayInputStream(simulatedInput.getBytes()));

        UserInput userInput = new UserInput();
        String input = userInput.getInput();

        assertEquals("пошук", input);
    }
  
}