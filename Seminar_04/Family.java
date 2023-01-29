package Seminar_04;

public class Family<T, R> extends Human<T, R> {
    private Family<T, R> prew;

    Family(T name, R year, Family<T, R> prew) {
        setName(name);
        setBirthday(year);
        setPrew(prew);
    }

    // Family(T name, R year) {
    //     setName(name);
    //     setBirthday(year);
    // }

    // Family(T x, Family<T, R> prew) {
    //     setName(x);
    //     setBirthday(null);
    //     setPrew(prew);
    // }

    // Family(R x, Family<T, R> prew) {
    //     setName(null);
    //     setBirthday(x);
    //     setPrew(prew);
    // }

    // Family(Family<T, R> prew) {
    //     super();
    //     setPrew(prew);
    // }

    // Family() {
    //     super();
    //     setPrew(null);
    // }

    public void setPrew(Family<T, R> x) {
        this.prew = x;
    }

    public Family<T, R> getPrew() {
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
