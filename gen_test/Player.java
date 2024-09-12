package test;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

class Player {
    private String name;
    private int score;
    private int xPosition;
    private int yPosition;

    public Player(String name, int score, int xPosition, int yPosition) {
        if (name == null || score < 0 || xPosition < 0 || yPosition < 0) {
            throw new IllegalArgumentException("Invalid player information.");
        }
        this.name = name;
        this.score = score;
        this.xPosition = xPosition;
        this.yPosition = yPosition;
    }
  
    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name != null) {
            this.name = name;
        } else {
            throw new IllegalArgumentException("Name cannot be null");
        }
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        if (score >= 0) {
            this.score = score;
        } else {
            throw new IllegalArgumentException("Score cannot be negative");
        }
    }

    public int getXPosition() {
        return xPosition;
    }

    public void setXPosition(int xPosition) {
        this.xPosition = xPosition;
    }

    public int getYPosition() {
        return yPosition;
    }

    public void setYPosition(int yPosition) {
        this.yPosition = yPosition;
    }

    public void printInfo() {
        System.out.println("Name: " + name);
        System.out.println("Score: " + score);
        System.out.println("Position: (" + xPosition + ", " + yPosition + ")");
    }

    public void move(int x, int y) {
        this.xPosition = x;
        this.yPosition = y;
        System.out.println("New Position: (" + xPosition + ", " + yPosition + ")");
    }

    public void increaseScore(int points) {
        this.score += points;
        System.out.println("New Score: " + score);
    }

    public void attack(Enemy enemy) {
        int randomPoints = (int)(Math.random() * 10) + 1;
        increaseScore(randomPoints);
        System.out.println(name + " attacked " + enemy.getType() + " and gained " + randomPoints + " points!");
    }
}