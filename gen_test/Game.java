package test;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

class Game {
    private Player player;
    private int score;
    private Enemy[] enemies;

    public Game() {
        this.player = new Player("Hero", 0, 0);
        this.score = 0;
        this.enemies = new Enemy[5];
        initializeEnemies();
    }

    private void initializeEnemies() {
        for (int i = 0; i < enemies.length; i++) {
            enemies[i] = new Enemy("Goblin", i, i + 1, 10);
        }
    }

    public void increaseScore(int points) {
        if (points < 0) {
            throw new IllegalArgumentException("Points cannot be negative");
        }
        this.score += points;
        System.out.println("Score increased! Current score: " + this.score);
    }

    public void printGameState() {
        System.out.println("Current game state:");
        System.out.println("Player: " + player.getName() + " at (" + player.getX() + ", " + player.getY() + ")");
        System.out.println("Score: " + score);
        System.out.println("Enemies: ");
        for (Enemy enemy : enemies) {
            System.out.println("- " + enemy.getType() + " at (" + enemy.getX() + ", " + enemy.getY() + ") with health " + enemy.getHealth());
        }
    }

    public Player getPlayer() {
        return player;
    }

    public int getScore() {
        return score;
    }

    public Enemy[] getEnemies() {
        return enemies;
    }

    public static void main(String[] args) {
        Game myGame = new Game();
        myGame.printGameState();

        myGame.player.move(2, 3);
        myGame.increaseScore(10);
        myGame.printGameState();

        for (Enemy enemy : myGame.enemies) {
            enemy.interact(myGame.player);
        }
    }
}