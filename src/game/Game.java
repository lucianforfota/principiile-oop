package game;

public class Game {

    public static void main(String[] args) {
//        game.Archer archer = new game.Archer("Legolas", 31, 100);
//        game.Wizard wizard = new game.Wizard("Gandalf", 75, 1000);
//        System.out.println(wizard instanceof game.Wizard);
//        System.out.println(wizard instanceof game.PlayerCharacter);
//        System.out.println(archer instanceof Object);


        PlayerCharacter player = new Archer("Legolas", 31, 100);
        player.attack();

        PlayerCharacter player2 = new Wizard("Gandalf",75,1000);
        player2.attack();

        doAllPlayerActions(player);

    }

    public static void doAllPlayerActions(PlayerCharacter playerCharacter){
        playerCharacter.speak();
        playerCharacter.attack();
    }


}