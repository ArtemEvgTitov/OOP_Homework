package Seminar_04;

public class Family<T,R> extends Human<T,R> {
    private Family<T,R> prew;

    Family(T name, R year, Family<T,R> prew){
        setName(name);
        setBirthday(year);
        setPrew(prew);
    }

    Family(T name, R year){
        setName(name);
        setBirthday(year);
    }

    Family(Family<T,R> prew){
        super();
        setPrew(prew);
    }

    Family(){
        super();
    }

    public void setPrew(Family<T,R> x) {
        this.prew = x;
    }

    public Family<T,R> getPrew() {
        return prew;
    }
}
