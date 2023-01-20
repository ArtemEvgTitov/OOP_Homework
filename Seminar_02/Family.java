package Seminar_02;

public class Family implements InterfaceHuman {
    private String name;
    private int year;
    private Family prew;

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int getBirthday() {
        return year;
    }

    @Override
    public void setBirthday(int year) {
        this.year = year;
    }

    @Override
    public String humanToString() {
        return name + " " + year;
    }

    @Override
    public void setPrew(Family x) {
        this.prew = x;
    }

    @Override
    public Family getPrew() {
        return prew;
    }

    @Override
    public String prewToString() {
        if (prew == null) {
            return "Родственник неизвестен";
        } else {
            return prew.humanToString();
        }
    }

}
