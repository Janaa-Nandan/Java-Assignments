package Learnmaxxing.Assignment4;

public class Movie {
    void watch(){
        System.out.println("Watching a Movie!");
    }
}
class RomComMovie extends Movie{
    @Override
    void watch(){
        System.out.println("Watching a RomComMovie!");
    }
}
class ThrillerMovie extends Movie{
    @Override
    void watch(){
        System.out.println("Watching a ThrillerMovie!");
    }
}