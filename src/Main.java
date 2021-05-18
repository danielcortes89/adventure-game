import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        Random rand = new Random();

        initialConfig();
    }

    public static void initialConfig() {
        Scanner in = new Scanner(System.in);
        Boolean finished = false;

        System.out.println("Hello and welcome to our adventure game!");
        while (!finished) {
            System.out.println("What kind of hero would you like to be?");
            System.out.println("\t1 Swordsman");
            System.out.println("\t2 Elf");
            System.out.println("\t3 Dwarf");
            String input = in.nextLine();

            if (input.equals("1")) {
                System.out.println("The swordsman is a fierce warrior. " +
                        "Relying on using their skill with a blade and " +
                        "their sturdy frame, the swordsman is known for being a pillar of valor");
                System.out.println("Play as the Swordsman? Y/N");
                String swordAns = in.nextLine();
                if(swordAns.equalsIgnoreCase("Y")){
                    System.out.println("Picked swordsman!");
                    finished = true;
                }
            } else if (input.equals("2")) {

            } else if (input.equals("3")) {

            } else {
                System.out.println("\tInvalid command.");
            }
        }

    }
}
