package heroes;

public class Hero {
    public String name = "";
    public String standardAttack = "Punch";
    public String specialAttack = "Drop Kick";
    public String heavyAttack = "Roundhouse Kick";


    int health = 100;
    int baseHealth = 100;
    int strength = 20;
    int defense = 20;
    int agility = 20;

    int numHealthPotions = 4;
    int healthPotionHealAmount = 30;
    int healthPotionDropChance = 50; // 50 Percent chance to drop a health potion
    int levelUpChance = 50;

    //    LEVEL UP
    int baseLevel = 1000;
    int toNextLevel = 1000;
    int totalExperience = 0;
}
