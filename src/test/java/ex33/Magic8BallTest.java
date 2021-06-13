package ex33;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class Magic8BallTest {

    @Test
    void printOutputYes() {
        Magic8Ball myApp = new Magic8Ball();
        ArrayList<String> responses = new ArrayList<>();
        myApp.generateResponses(responses);
        String actual = myApp.printOutput(0, responses);
        assertEquals("\nYes.", actual);
    }

    @Test
    void printOutputNo() {
        Magic8Ball myApp = new Magic8Ball();
        ArrayList<String> responses = new ArrayList<>();
        myApp.generateResponses(responses);
        String actual = myApp.printOutput(1, responses);
        assertEquals("\nNo.", actual);
    }

    @Test
    void printOutputMaybe() {
        Magic8Ball myApp = new Magic8Ball();
        ArrayList<String> responses = new ArrayList<>();
        myApp.generateResponses(responses);
        String actual = myApp.printOutput(2, responses);
        assertEquals("\nMaybe.", actual);
    }

    @Test
    void printOutputAskAgain() {
        Magic8Ball myApp = new Magic8Ball();
        ArrayList<String> responses = new ArrayList<>();
        myApp.generateResponses(responses);
        String actual = myApp.printOutput(3, responses);
        assertEquals("\nAsk again later.", actual);
    }
}