package me.potato.democoupledcontainer.lec02.wayofspring.games;

public class CounterStrike implements Game {
    public void launch() {
        System.out.println("Launching CounterStrike Creed...");
        loadGame();
        keyUp();
        keyDown();
        keyLeft();
        keyRight();
    }

    private void loadGame() {System.out.println("Loading CounterStrike...");}

    private void keyUp() {System.out.println("Move forward...");}

    private void keyDown() {System.out.println("Move backward...");}

    private void keyLeft() {System.out.println("Move left...");}

    private void keyRight() {System.out.println("Key right...");}

}
