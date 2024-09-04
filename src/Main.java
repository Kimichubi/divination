import java.util.Scanner;

public class Main {


    private static final Scanner input = new Scanner(System.in);
    private static final int min = 1;
    private static final int max = 10;
    private static int playerScore;
    private static String playerName;

    public static void game() {

        promptPlayerInfos();
        gameLoop();

    }


    public static void gameLoop() {

        int playerNumber = 0;
        int options = 0;


        do {
            int int_random = (int) (Math.random() * (max - min + 1) + min);
            System.out.println(playerName + " pontuação atual é: " + playerScore + "\nPor favor tente acertar o número de 1 a 10:");
            playerNumber = input.nextInt();

            if (playerNumber == int_random) {
                System.out.println("Parabéns " + playerName + " acertou!");
                playerScore++;
                System.out.println("Digite 0 para sair ou 1 para continuar: ");
                options = input.nextInt();

            } else {
                System.out.println("Foi quase o número era: " + int_random);
                System.out.println("Digite 0 para sair ou 1 para continuar: ");
                options = input.nextInt();
            }


        } while (options != 0);
    }


    public static void promptPlayerInfos() {
        //Player Name
        System.out.println("Por favor digite seu nome:");

        playerName = input.next();
    }

    public static void main(String[] args) {

        game();

    }
}