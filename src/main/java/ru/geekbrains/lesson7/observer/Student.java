package main.java.ru.geekbrains.lesson7.observer;

public class Student implements Observer {

    private String name;

    private Vacancy searchVacancy;

    private int salary = 2000;

    public Student(String name, Vacancy searchVacancy) {
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
