package Seminar_01;

public class Human {
    private String name;
    private int year;

    Human(String name, int year) {
        this.name = name;
        this.year = year;
    }

    Human(String name) {
        this.name = name;
        this.year = -1;
    }

    Human(int year) {
        this.name = "Неизвестно";
        this.year = year;
    }

    Human() {
        this.name = "Неизвестно";
        this.year = -1;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBirthday() {
        return year;
    }

    public void setBirthday(int year) {
        this.year = year;
    }

    public String toString() {
        return name + " " + year;
    }
}