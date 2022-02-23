package day7.Task2;
/*Street football.

It takes 6 people (3x3) to play football. Class Player, contains the following fields:
- field "stamina", different for each instance;
- constants "MAX_STAMINA" with the value 100 and “MIN_STAMINA with a value of 0, the same for all instances;
- static field "countPlayers" , which counts the number of players on football field (initially there are 0, entering
the field is considered to be the creation instance of the class, leaving - when the player is tired).
- getter for the field “stamina”;

and the following methods:
run() - The player runs when this method is called. This method reduces stamina by 1 for a single call. When stamina
reaches 0, the player needs to rest, and he leaves the field.
info() - displays a message depending on the number of players on the field. If less than 6 players, then displays
the message: “Teams are incomplete. There are ... vacancies”, otherwise: “There are no vacancies on the field”.

Task: Create a Player class according to the above template. An instance of the class when
creation must have a stamina value between 90 and 100 (generate inside
constructor). Create 6 players, call the info() method. When trying to create 7.8...
n player, the number of players on the field should not change,
check it out.
Run the run() method on the player until they are completely exhausted (negative endurance value is not allowed).
Display the number of players on the field.*/
public class Task2 {
    public static void main(String[] args) {
        Player player1 = new Player(90);
        Player player2 = new Player(98);
        Player player3 = new Player(95);

        Player.info();
        Player player4 = new Player(100);
        Player player5 = new Player(99);
        Player player6 = new Player(91);

        Player.info();

        Player player7 = new Player(99);
        System.out.println(Player.getCountPlayer());


        for (int i = 0; i <100 ; i++) {
            player4.run();
        }

        Player player8 = new Player(59);

        Player.info();
        System.out.println(Player.getCountPlayer());

    }
}
