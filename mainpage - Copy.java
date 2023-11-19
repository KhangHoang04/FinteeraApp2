import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class mainpage {
    public static void main(String args[]) {
        ArrayList<player> players = new ArrayList<>();
        Scanner in = new Scanner(System.in);
        Scanner num = new Scanner(System.in);
        while (true) { // Fille ArrayList with usernames
            System.out.print("Enter your username! ");
            player username = new player(in.nextLine());
            players.add(username);
            System.out.print("Add more usernames? y/n: ");
            if (!in.nextLine().equals("y")) {
                break;
            }
        }

        // choose player instead of case 1

        player focus = new player(); // If cases 2-4 are chosen, then a default player will be used
        int menu_num = 0;
        while (true) { // Something wrong with try and catch block, but code works if right case
                       // numbers are entered
            try {
                System.out.println(
                        "\nMenu:\n1: Select Player\n2: View Player Coins\n3: View Player EXP\n4: View Player Information\n5: Exit");
                menu_num = num.nextInt();
                switch (menu_num) {
                    case 1:
                        System.out.print("\nEnter username: ");
                        String name = in.nextLine();
                        for (int x = 0; x < players.size(); x++) {
                            player p = players.get(x);
                            if (name.equals(p.getName())) {
                                focus = p;
                            }
                        }
                        break;

                    case 2:
                        System.out.println("\n" + focus.getCoins() + " coins");
                        break;
                    case 3:
                        System.out.println("\n" + focus.getExp() + " xp");
                        break;
                    case 4:
                        System.out.println("\n" + focus.toString());
                        break;
                    case 5:
                        in.close();
                        num.close();
                        System.out.print("\nPlayer names: ");
                        for (int x = 0; x < players.size() - 1; x++) {
                            System.out.print(players.get(x).getName() + ", ");
                        }
                        System.out.println(players.get(players.size() - 1).getName() + "\n");
                        System.exit(0);
                }
            } catch (InputMismatchException e) {
                System.out.println("\nWrong Menu Input");
            }
        }
    }
}
