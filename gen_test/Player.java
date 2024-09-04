package test;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

class Player {
    private String name;
    private int score;
    private int xPosition;
    private int yPosition;

    public Player(String name, int xPosition, int yPosition) {
        this.name = name;
        this.score = 0;
        this.xPosition = xPosition;
        this.yPosition = yPosition;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getScore() {
        return score;
    }

    public void addScore(int points) {
        this.score += points;
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

    public void move(int deltaX, int deltaY) {
        this.xPosition += deltaX;
        this.yPosition += deltaY;
        System.out.println(name + " moved to (" + xPosition + ", " + yPosition + ")");
    }
}

// File: Enemy.java
package main;

public 