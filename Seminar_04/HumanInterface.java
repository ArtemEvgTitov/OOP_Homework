package Seminar_04;

/**
 * Интерфейс создания Human
 */
public interface HumanInterface<T, R> {
    T getName();

    void setName(T name);

    R getBirthday();

    void setBirthday(R year);

    String humanToString();
}
