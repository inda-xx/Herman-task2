class ShadowExample {
    private int score = 100; // I want this score to be printed :(

    public void printScore() {
        int score = 50;
        System.out.println(score); // Local variable score shadows the instance field
    }

    public static void main(String[] args) {
        new ShadowExample().printScore();
    }
}
```

These Java classes implement the basic game mechanics including player movement, scoring, and interaction with enemies. The `ShadowExample` 