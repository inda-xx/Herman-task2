import java.util.Set;

public class Enemy {
    private String type;
    private int xPosition;
    private int yPosition;

    // Constructor
    public Enemy(String type, int xPosition, int yPosition) {
        this.type = type;
        this.xPosition = xPosition;
        this.yPosition = yPosition;
    }

    // Getters and Setters
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
}