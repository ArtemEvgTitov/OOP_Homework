package Seminar_04;
/**
 * Интерфейс создания Human
 */
public interface HumanInterface<T> {
    T getName();
    void setName(T name);
    T getBirthday();
    void setBirthday(T year);
    String humanToString();
}
