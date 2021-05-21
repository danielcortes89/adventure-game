import heroes.Dwarf;
import heroes.Elf;
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
        if(player == null){
           return;
        }

        introScroll(player);

        System.out.println("You enter the swamp.");

        swampLoop(player);
        System.out.println("Ready for next");
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
                    player = new Swordsman();
                    player.name = name + " the Swordsman";
                    finished = true;
                }
            } else if (input.equals("2")) {
                System.out.println("The Elf is a mystic being. " +
                        "By being in tune with nature, working with it rather than " +
                        "against it, the elf is nimble and swift");
                System.out.println("Play as the Elf? Y/N");
                String swordAns = in.nextLine();
                if(swordAns.equalsIgnoreCase("Y")){
                    player = new Elf();
                    player.name = name + " the Elf";
                    finished = true;
                }

            } else if (input.equals("3")) {
                System.out.println("The Dwarf is born of the earth. " +
                        "Tough as stone, while being a stone breaker " +
                        ", the dwarf can dish it out and take in equal measure");
                System.out.println("Play as the Dwarf? Y/N");
                String swordAns = in.nextLine();
                if(swordAns.equalsIgnoreCase("Y")){
                    player = new Dwarf();
                    player.name = name + " the Dwarf";
                    finished = true;
                }

            } else if(input.equals("4")){
                System.out.println("Maybe next time.");
                return player;
            } else {
                System.out.println("\tInvalid command.");
            }
        }

        return player;
    }

    public static void javaSetTimeout(Runnable runnable, int wait) {
        new Thread(() -> {
            try {
                Thread.sleep(wait);
                runnable.run();
            }
            catch (Exception e){
                System.err.println(e);
            }
        }).start();
    }

    public static void introScroll(Hero player) {
        Scanner in = new Scanner(System.in);
        String name = "";

        javaSetTimeout(() -> System.out.println("Welcome to the land of Arda"), 1000);
        Hero finalPlayer = player;
        javaSetTimeout(() -> System.out.println("You are " + finalPlayer.name + "!"), 3000);
        javaSetTimeout(() -> System.out.println("You must travel to the tower of Bara dur and slay Sauron"), 5000);
        javaSetTimeout(() -> System.out.println("The journey will be long and arduous"), 7000);
        javaSetTimeout(() -> System.out.println("You must steel yourself for the task ahead"), 9000);
        javaSetTimeout(() -> System.out.println("Let's Begin"), 11000);
    }

    public static void swampLoop(Hero player) {
        Boolean isRunning = true;
        int yAxis = 1;
        int xAxis = 3;

        while(isRunning){
            System.out.println("You enter the sawmp of the dead");
            System.out.println("What will you do?");
            swampOptions("start");
            isRunning = false;
        }

    }

    public static void swampOptions(String position) {
        if(position.equals("start")){
            System.out.println("1 - Proceed North");
            System.out.println("2 - Proceed West");
            System.out.println("3 - Proceed East");
        }
        return;
    }
}
