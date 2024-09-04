package test;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

class Game {
    public static void main(String[] args) {
        Player player = new Player("John", 0, 0);
        Enemy enemy = new Enemy(3, 2);

        player.move(1, 1);
        enemy.challenge(player);

        player.move(2, 1);
        enemy.challenge(player);
    }
}