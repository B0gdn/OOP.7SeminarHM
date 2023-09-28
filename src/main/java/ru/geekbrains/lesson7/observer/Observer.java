package main.java.ru.geekbrains.lesson7.observer;

public interface Observer {

    void receiveOffer(String companyName, int salary, Vacancy vacancy);

}
