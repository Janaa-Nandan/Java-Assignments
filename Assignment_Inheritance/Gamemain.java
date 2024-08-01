package Learnmaxxing.Assignment_Inheritance;

//Question5 Wizards and Warriors.
public class Gamemain {
    static Warrior warrior = new Warrior();
    static Wizard wizard = new Wizard();

    public static void main(String[] args) {
        System.out.println(warrior.toString());
        System.out.println(wizard.toString());
        System.out.println(warrior.isVulnerable());
        System.out.println(wizard.isVulnerable());
        System.out.println(warrior.getDamagePoints(wizard));
        wizard.prepareSpell();
        System.out.println(wizard.isVulnerable());
        System.out.println(wizard.getDamagePoints(warrior));
    }
}
abstract class Fighter {
    abstract public boolean isVulnerable();
    abstract public String toString();
    abstract public int getDamagePoints(Fighter fighter);
}

class Warrior extends Fighter {
    public String toString(){
        return "Fighter is a Warrior";
    }
    public boolean isVulnerable(){
        return false;
    }
    public int getDamagePoints(Fighter fighter){
        int DamagePoints;
        if (fighter.isVulnerable()) DamagePoints = 10;
        else DamagePoints = 6;
        return DamagePoints;
    }
}

class Wizard extends Fighter {
    public String toString(){
        return "Fighter is a Wizard";
    }
    public boolean isVulnerable(){
        if (spellprepared)return false;
        return true;
    }
    public int getDamagePoints(Fighter fighter){
        int DamagePoints;
        if (spellprepared) DamagePoints = 12;
        else DamagePoints = 3;
        return DamagePoints;
    }
    private static boolean spellprepared = false;
    public static void prepareSpell(){
        spellprepared = true;
    }

}