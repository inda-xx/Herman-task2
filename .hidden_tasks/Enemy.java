class Enemy {

    private String name;
    private int strength;
    private int[] position; // position[0] for x, position[1] for y

    // Constructor
    public Enemy(String name, int strength, int[] position) {
        this.name = name;
        this.strength = strength;
        this.position = position;
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int[] getPosition() {
        return position;
    }

    public void setPosition(int[] position) {
        this.position = position;
    }
}
```

`Game.java`
```java
public 