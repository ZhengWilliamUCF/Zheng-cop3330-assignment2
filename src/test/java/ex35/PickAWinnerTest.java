package ex35;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class PickAWinnerTest {

    @Test
    void printWinnerChoice0() {
        PickAWinner myApp =  new PickAWinner();
        ArrayList<String> contestants = new ArrayList<>();
        addContestants(contestants);
        String actual = myApp.printWinner(0, contestants);
        assertEquals("The winner is... Homer.", actual);
    }

    @Test
    void printWinnerChoice1() {
        PickAWinner myApp =  new PickAWinner();
        ArrayList<String> contestants = new ArrayList<>();
        addContestants(contestants);
        String actual = myApp.printWinner(1, contestants);
        assertEquals("The winner is... Bart.", actual);
    }

    @Test
    void printWinnerChoice2() {
        PickAWinner myApp =  new PickAWinner();
        ArrayList<String> contestants = new ArrayList<>();
        addContestants(contestants);
        String actual = myApp.printWinner(2, contestants);
        assertEquals("The winner is... Lisa.", actual);
    }

    @Test
    void printWinnerChoice3() {
        PickAWinner myApp =  new PickAWinner();
        ArrayList<String> contestants = new ArrayList<>();
        addContestants(contestants);
        String actual = myApp.printWinner(3, contestants);
        assertEquals("The winner is... Moe.", actual);
    }

    @Test
    void printWinnerChoice4() {
        PickAWinner myApp =  new PickAWinner();
        ArrayList<String> contestants = new ArrayList<>();
        addContestants(contestants);
        String actual = myApp.printWinner(4, contestants);
        assertEquals("The winner is... Maggie.", actual);
    }

    void addContestants(ArrayList<String> contestants){
        contestants.add("Homer");
        contestants.add("Bart");
        contestants.add("Lisa");
        contestants.add("Moe");
        contestants.add("Maggie");
    }
}