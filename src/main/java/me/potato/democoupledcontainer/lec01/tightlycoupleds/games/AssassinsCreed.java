package me.potato.democoupledcontainer.lec01.tightlycoupleds.games;

public class AssassinsCreed {
    public void launch() {
        System.out.println("Launching Assassins Creed...");
        loadGame();
        keyUp();
        keyDown();
        keyLeft();
        keyRight();
    }

    private void loadGame() {System.out.println("Loading Assassins Creed...");}

    private void keyUp() {System.out.println("Move forward...");}

    private void keyDown() {System.out.println("Move backward...");}

    private void keyLeft() {System.out.println("Move left...");}

    private void keyRight() {System.out.println("Key right...");}

}
