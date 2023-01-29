package Seminar_04;
/**
 * Интерфейс создания Human
 */
public interface HumanInterface<T> {
    String getName();
    void setName(T name);
    int getBirthday();
    void setBirthday(T year);
    String humanToString();
}
