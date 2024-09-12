public class SpaceAdventure {

    public static void main(String[] args) {
        Player astronaut = new Player("Astronaut", 0, 0, 0);
        Enemy alien = new Enemy("Alien", 5, 5, true);

        astronaut.printInfo();
        alien.printInfo();

        astronaut.setScore(10);
        astronaut.setPositionX(2);
        astronaut.setPositionY(3);

        System.out.println("Player " + astronaut.getName() + " has a score of " + astronaut.getScore());

        astronaut.moveUp();
        astronaut.moveRight();

        Player anotherAstronaut = new Player("Cosmonaut", 0, 5, 5);
        anotherAstronaut.interactWithEnemy(alien);
    }
}