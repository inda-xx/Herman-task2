class Enemy {

    private String name;
    private int health;
    private int strength;

    public Enemy(String name, int health, int strength) {
        this.name = name;
        this.health = health;
        this.strength = strength;
    }

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getStrength() {
        return strength;
    }
}
```

This solution meets the requirements outlined in your task description. You have separate classes for `Player` and `Enemy`, with each having instance fields, constructors, getters, setters, and specific methods for the game's functionality.

The `Game` class, on the other hand, initializes these characters and starts a basic game loop. It prints a welcome message and manages the player's actions such as moving and attacking. 

The `Player` 