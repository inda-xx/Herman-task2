package test;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

class has a method to retrieve the list of enemies for validation purposes
        // Check the size of the enemies list
        assertEquals(2, game.getEnemies().size());
        // Check that the added enemies exist in the game
        assertTrue(game.getEnemies().contains(enemy1));
        assertTrue(game.getEnemies().contains(enemy2));
    }

    @Test
    public void testPlayerEnemyCollision() {
        // Player collides with enemy1
        game.interact(player, enemy1);
        assertEquals(-1, player.getScore());

        // Player moves away and doesn't collide with enemy1
        player.setPositionX(1);
        player.setPositionY(1);
        game.interact(player, enemy1);
        assertEquals(-1, player.getScore()); // Score should not decrement
    }

    @Test
    public void testNoCollisionDifferentPosition() {
        player.setPositionX(1);
        player.setPositionY(1);
        game.interact(player, enemy1);

        // Since there was no collision, the score should remain the same
        assertEquals(0, player.getScore());
    }

    @Test
    public void testPositionUpdate() {
        player.setPositionX(5);
        player.setPositionY(5);
        assertEquals(5, player.getPositionX());
        assertEquals(5, player.getPositionY());
    }

    @Test(expected = NullPointerException.class)
    public void testNullPlayer() {
        game.interact(null, enemy1);
        // Expecting a NullPointerException because player is null
    }

    @Test(expected = NullPointerException.class)
    public void testNullEnemy() {
        game.interact(player, null);
        // Expecting a NullPointerException because enemy is null
    }

    @Test
    public void testConcurrentModification() {
        ArrayList<Enemy> enemiesToAdd = new ArrayList<>();
        for (int i = 0; i < 10000; i++) {
            enemiesToAdd.add(new Enemy("Goblin" + i, i, i));
        }

        for (Enemy enemy : enemiesToAdd) {
            game.addEnemy(enemy);
        }

        // Testing scalability and performance by adding multiple enemies
        assertEquals(10000, game.getEnemies().size());
    }
}