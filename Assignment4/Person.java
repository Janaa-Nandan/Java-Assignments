package Learnmaxxing.Assignment3;

public class Person {
    String name;
    int age;
    String address;
    Person(String name){
        this.name = name;
    }
    Person(String name,int age){
        this.name = name;
        this.age = age;
    }
    Person(String name,int age, String address){
        this.name = name;
        this.age = age;
        this.address = address;
    }
}
