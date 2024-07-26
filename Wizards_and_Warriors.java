package Learnmaxxing.Assignment4;

import static Learnmaxxing.Assignment4.TravelMethod.HORSEBACK;

public class Wizards_and_Warriors {
    public static void main(String[] args) {
        GameCharacter character = new GameCharacter();
        character.setCharacterclass("Wizard");
        character.setLevel(4);
        character.setHp(28);
        System.out.println(new GameMaster().describe(character));

        Destination destination = new Destination();
        destination.setName("Muros");
        destination.setInhabitants(732);
        System.out.println(new GameMaster().describe(destination));

        System.out.println(new GameMaster().describe(TravelMethod.HORSEBACK));

        System.out.println(new GameMaster().describe(character, destination, TravelMethod.HORSEBACK));

        System.out.println(new GameMaster().describe(character, destination));
    }
}

class GameMaster{
    static String output;
    String describe(GameCharacter character){
        String charclass = character.characterclass;
        int level = character.level;
        int hp = character.hitpoints;
        output = "You're a Level "+level+" "+charclass+" with "+hp+" hitpoints.";
        return output;
    }
    String describe(Destination destination){
        output = "You've arrived at "+destination.name+", Which has "+destination.inhabitants+" inhabitants.";
        return output;
    }
    String describe(boolean modeoftravel) {
        if(modeoftravel == true){
            output = "You're traveling to your destination on horseback.";
        }
        else{
            output = "You're traveling to your destination by walking.";
        }
        return output;
    }
    String describe(GameCharacter character,Destination destination){
        output = describe(character)+describe(TravelMethod.WALKING)+describe(destination);
        return output;
    }
    String describe(GameCharacter character, Destination destination,boolean horse){
        output = describe(character)+describe(TravelMethod.HORSEBACK)+describe(destination);
        return output;
    }
}

class GameCharacter {
    public static String characterclass;
    public static int level;
    public static int hitpoints;

    void setCharacterclass(String charclass){
        characterclass = charclass;
    }
    void setLevel(int lvl){

        level = lvl;
    }
    void setHp(int hp) {
        hitpoints = hp;
    }
}
class Destination{
    static String name;
    static int inhabitants;
    public void setName(String locationname) {
        name = locationname;
    }
    public void setInhabitants(int inhab){
        inhabitants = inhab;
    }
}

class TravelMethod {
    static boolean HORSEBACK = true;
    static boolean WALKING = false;
    void describe() {
        System.out.println();
    }
}
