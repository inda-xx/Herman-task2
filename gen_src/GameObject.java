class GameObject {
    
    private String name;
    private int x;
    private int y;
    
    public GameObject(String name, int x, int y) {
        this.name = name;
        this.x = x;
        this.y = y;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void printInfo() {
        System.out.println("Name: " + name + ", X: " + x + ", Y: " + y);
    }
    
    public static void main(String[] args) {
        GameObject player = new GameObject("Player", 0, 0);
        player.printInfo();
    }
}

// Player.java
public 