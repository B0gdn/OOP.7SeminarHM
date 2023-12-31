package main.java.ru.geekbrains.lesson7.observer;

import java.util.ArrayList;
import java.util.List;

public class JobAgency implements Publisher{

    private List<Observer> observers = new ArrayList<>();


    @Override
    public void sendOffer(String companyName, int salary, Vacancy vacancy) {
        for (Observer observer: observers) {
            observer.receiveOffer(companyName, salary, vacancy);
        }
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }
}
