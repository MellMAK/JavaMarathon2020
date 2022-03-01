package day7.Task2;

public class Player {
    private int stamina;
    private static final int MAX_STAMINA = 100;
    private static final int MIN_STAMINA = 0;
    private static int countPlayer = 0;

    public Player(int stamina) {
        this.stamina = stamina;
        if (countPlayer<6){
            countPlayer++;
        }
    }

    public int getStamina() {
        return stamina;
    }

    public static int getCountPlayers() {
        return countPlayer;
    }

    public void run() {
        if (stamina==0){
            return;
        }
        stamina--;
        if (stamina==0){
            countPlayer--;
        }

    }

    public static void info() {
        if (countPlayer < 6) {
            System.out.printf("Teams are incomplete. There are %d vacancies \n", (6-countPlayer));
        } else {
            System.out.println("There are no vacancies on the field ");
        }
    }
}
