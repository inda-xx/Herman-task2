package test;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

class Enemy {
    private String type;
    private int xPosition;
    private int yPosition;

    public Enemy(String type, int xPosition, int yPosition) {
        if (type == null || xPosition < 0 || yPosition < 0) {
            throw new IllegalArgumentException("Invalid arguments for enemy.");
        }
        this.type = type;
        this.xPosition = xPosition;
        this.yPosition = yPosition;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
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
        System.out.println("Type: " + type);
        System.out.println("Position: (" + xPosition + ", " + yPosition + ")");
    }
}

package main;

public 