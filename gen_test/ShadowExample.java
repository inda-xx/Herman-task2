package test;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

class ShadowExample {
    private int score = 10;

    public void displayScore() {
        int score = 50;
        System.out.println(score);
    }

    public static void main(String[] args) {
        ShadowExample example = new ShadowExample();
        example.displayScore();
    }
}