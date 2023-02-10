package Seminar_01;

public class Family extends Human {
    private Family prew;

    Family(Human x) {
        super(x.getName(), x.getBirthday());
    }

    Family(String name, int year, Family prew) {
        super(name, year);
        setPrew(prew);
    }

    Family(int year, Family prew) {
        super(year);
        setPrew(prew);
    }

    Family(String name, Family prew) {
        super(name);
        setPrew(prew);
    }

    Family(String name, int year) {
        super(name, year);
    }

    Family(int year) {
        super(year);
    }

    Family(String name) {
        super(name);
    }

    Family(Family prew) {
        super();
        setPrew(prew);
    }

    Family() {
        super();
    }

    public void setPrew(Family x) {
        this.prew = x;
    }

    public Family getPrew() {
        return prew;
    }

    public String prewToString() {
        if (prew == null) {
            return "Родственник неизвестен";
        } else {
            return prew.humanToString();
        }
    }
}
