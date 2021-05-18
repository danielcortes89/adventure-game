import heroes.Hero;
import heroes.Swordsman;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Hero player = null;
        Random rand = new Random();

        player = initialConfig(player);
        System.out.println(player.standardAttack);
    }

    public static Hero initialConfig(Hero player) {
        Scanner in = new Scanner(System.in);
        Boolean finished = false;

        System.out.println("Hello and welcome to our adventure game!");
        System.out.println("What is your name?");

        String name = in.nextLine();
        while (!finished) {
            System.out.println("Hello " + name);
            System.out.println("What kind of hero would you like to be?");
            System.out.println("\t1 Swordsman");
            System.out.println("\t2 Elf");
            System.out.println("\t3 Dwarf");
            System.out.println("\t4 I don't want to play");
            String input = in.nextLine();

            if (input.equals("1")) {
                System.out.println("The Swordsman is a fierce warrior. " +
                        "Relying on using their skill with a blade and " +
                        "their sturdy frame, the swordsman is known for being a pillar of valor");
                System.out.println("Play as the Swordsman? Y/N");
                String swordAns = in.nextLine();
                if(swordAns.equalsIgnoreCase("Y")){
                    System.out.println("Welcome " + name + " the Swordsman!");
                    player = new Swordsman();
                    player.name = name + " the Swordsman!";
                    System.out.println(player.standardAttack);
                    finished = true;
                }
            } else if (input.equals("2")) {
                System.out.println("The Elf is a mystic being. " +
                        "By being in tune with nature, working with it rather than " +
                        "against it, the elf is nimble and swift");
                System.out.println("Play as the Elf? Y/N");
                String swordAns = in.nextLine();
                if(swordAns.equalsIgnoreCase("Y")){
                    System.out.println("Welcome " + name + " the Elf!");
                    finished = true;
                }

            } else if (input.equals("3")) {
                System.out.println("The Dwarf is born of the earth. " +
                        "Tough as stone, while being a stone breaker " +
                        ", the dwarf can dish it out and take in equal measure");
                System.out.println("Play as the Dwarf? Y/N");
                String swordAns = in.nextLine();
                if(swordAns.equalsIgnoreCase("Y")){
                    System.out.println("Welcome " + name + " the Dwarf!");
                    finished = true;
                }

            } else if(input.equals("4")){
                System.out.println("Maybe next time.");
                return player;
            } else {
                System.out.println("\tInvalid command.");
            }
        }
//        System.out.println(player.name);
        return player;

    }
}
