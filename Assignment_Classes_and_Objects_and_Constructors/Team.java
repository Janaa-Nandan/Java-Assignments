package Learnmaxxing.Assignment_Classes_and_Objects_and_Constructors;

public class Team {
    static String teamname;
    static String city;
    static String division;
    static String coach;
    public static void playGame() {
        System.out.println("Team "+ teamname +" from "+city+" city, "+division+" division is playing the game!");
    }
    public static void setCoach(String coach){
        Team.coach = coach;
        System.out.println("Coach "+coach+" hired for the team "+ teamname +"!");
    }
    public Team(String teamname, String city, String division){
        this.teamname = teamname;
        this.city = city;
        this.division = division;
    }
}
class Player extends Team{
    static String playername;
    static String position;
    static int jerseyNumber;
    static int exp = 0;
    public Player(String name,String position,int jerseyNumber, String teamname, String city, String division){
        super(teamname, city, division);
        this.playername = name;
        this.position = position;
        this.jerseyNumber = jerseyNumber;
    }
    public static void playGame(){
        System.out.println("Player "+ playername +" of team "+teamname+", from "+city+" city, "+division+" division is playing the game!");
    }
    public static void train(){
        exp+=5;
        System.out.println("Player "+ playername +" has trained, now his exp level is "+exp);
    }
}
