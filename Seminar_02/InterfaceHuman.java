package Seminar_02;

/**
 * Основа для создания Human. 
 * Содержит get, set и перевод информации в строку
 */
public interface InterfaceHuman {
    String getName();
    void setName(String name);
    int getBirthday();
    void setBirthday(int year);
    String humanToString();    
    void setPrew(Family x);
    Family getPrew();
    String prewToString();
}