package test;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

class KnightQuest {
    private int playerPosition;
    private int score;
    private int enemiesDefeated;

    public KnightQuest() {
        this.playerPosition = 0;
        this.score = 0;
        this.enemiesDefeated = 0;
    }

    public int getPlayerPosition() {
        return playerPosition;
    }

    public void setPlayerPosition(int playerPosition) {
        this.playerPosition = playerPosition;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public int getEnemiesDefeated() {
        return enemiesDefeated;
    }

    public void setEnemiesDefeated(int enemiesDefeated) {
        this.enemiesDefeated = enemiesDefeated;
    }

    public void printStatus() {
        System.out.println("Current Position: " + playerPosition);
        System.out.println("Score: " + score);
        System.out.println("Enemies Defeated: " + enemiesDefeated);
    }

    public static void main(String[] args) {
        KnightQuest game = new KnightQuest();
        game.setPlayerPosition(5);
        game.setScore(100);
        game.setEnemiesDefeated(2);
        game.printStatus();
    }
}

