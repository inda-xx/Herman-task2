class SpaceAdventure {

    public static void main(String[] args) {
        Player astronaut = new Player("Astronaut", 0, 0, 0);
        Enemy alien = new Enemy("Alien", 5, 5, true);

        astronaut.printInfo();
        alien.printInfo();

        astronaut.moveUp();
        astronaut.moveRight();
        astronaut.interactWithEnemy(alien); // Should not interact yet

        astronaut.setPositionX(5);
        astronaut.setPositionY(5);
        astronaut.interactWithEnemy(alien); // Should interact and attack
    }
}
