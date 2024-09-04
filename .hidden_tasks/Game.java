class Game {
    public static void main(String[] args) {
        Player player1 = new Player("Hero", 0, 0);
        Enemy goblin = new Enemy("Goblin", 5, 5);
        Enemy orc = new Enemy("Orc", 10, 10);

        player1.move(4, 4);
        player1.increaseScore(10);
        player1.interactWithEnemy(goblin);

        player1.move(1, 1);
        player1.interactWithEnemy(orc);
    }
}
```

Note on Variable Shadowing:
To avoid variable shadowing, use the `this` keyword to explicitly refer to the instance variable of the class. For example, in the `move` method, `this.xPosition += x;` ensures you are modifying the instance variable `xPosition` rather than any local variable `xPosition` that might exist in the scope. This helps clarify which variable you intend to modify and prevents confusion when working with variables that might share the same name within different scopes.