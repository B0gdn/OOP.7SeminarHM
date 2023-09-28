package main.java.ru.geekbrains.lesson7.observer;

public class Worker implements Observer {

    private Vacancy searchVacancy;
    private String name;

    private String preferredVacancy;

    private int salary = 80000;

    public Worker(String name, Vacancy searchVacancy) {
        this.name = name;
        this.searchVacancy = searchVacancy;
    }

    @Override
    public void receiveOffer(String companyName, int salary, Vacancy searchVacancy) {
        if (this.salary <= salary){
            System.out.printf("Студент: %s: Мне нужна эта работа! (Компания: %s; Заработная плата: %d; Вакансия: %s)\n",
                    name, companyName, salary, searchVacancy);
            this.salary = salary;
        }
        else{
            System.out.printf("Студент: %s: Я найду работу получше! (Компания: %s; Заработная плата: %d; Вакансия: %s)\n",
                    name, companyName, salary, searchVacancy);
        }
    }
}
