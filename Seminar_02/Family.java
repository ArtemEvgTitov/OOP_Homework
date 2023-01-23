package Seminar_02;

public class Family implements InterfaceHuman {
    private String name;
    private int year;
    private Family prew;

    Family(Family x, Family prew){
        setName(x);
        setBirthday(x);
        setPrew(prew);
    }

    Family(String name, int year, Family prew){
        this.name = name;
        this.year = year;
        setPrew(prew);
    }

    Family(int year, Family prew){
        this.year = year;
        setPrew(prew);
    }

    Family(String name, Family prew){
        this.name = name;
        setPrew(prew);
    }

    Family(String name, int year){
        this.name = name;
        this.year = year;
    }

    Family(int year){
        this.year = year;
    }

    Family(String name){
        this.name = name;
    }

    Family(Family prew){
        super();
        setPrew(prew);
    }

    Family(){
        super();
    }

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
    public void setName(Family x){
        this.name = x.name;
    }

    public void setBirthday(Family x){
        this.year = x.year;
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
