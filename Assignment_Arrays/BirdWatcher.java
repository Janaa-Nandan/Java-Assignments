package Learnmaxxing.Assignment_Arrays;

public class BirdWatcher {
    private static int[] birdsPerDay = new int[7];
    public BirdWatcher(int[] birdsPerDay){
        this.birdsPerDay = birdsPerDay;
    }
    static int[] getLastWeek(){
        return birdsPerDay;
    }
    static int getToday(){
        return birdsPerDay[birdsPerDay.length-1];
    }
    static void incrementTodaysCount(){
        birdsPerDay[birdsPerDay.length-1]++;
    }
    static boolean hasDayWithoutBirds(){
        for (int i : birdsPerDay){
            if (i==0)return true;
        }
        return false;
    }
    static int getCountForFirstDays(int n){
        int result = 0;
        for (;n>0;n--){
            result += birdsPerDay[n-1];
        }
        return result;
    }
    static int getBusyDays(){
        int result = 0;
        for (int i : birdsPerDay){
            if (i>=5) result++;
        }
        return result;
    }
    public static void main(String[] args) {
        int[] birdsPerDay = { 2, 5, 0, 7, 4, 1 };  // Example data
        BirdWatcher birdWatcher = new BirdWatcher(birdsPerDay);
        System.out.println("Bird counts for the last week : ");

        for (int count : BirdWatcher.getLastWeek()) {
            System.out.print(count + " ");
        }
        System.out.println();
        System.out.println("Birds counted today : " + BirdWatcher.getToday());
        BirdWatcher.incrementTodaysCount();
        System.out.println("Birds counted today after increment : " + BirdWatcher.getToday());
        System.out.println("Is there any day without birds? : " + BirdWatcher.hasDayWithoutBirds());
        int n = 4;
        System.out.println("Birds counted in the first " + n + " days : " + BirdWatcher.getCountForFirstDays(n));
        System.out.println("Number of busy days (days with 5 or more birds) : " + BirdWatcher.getBusyDays());
    }
}
