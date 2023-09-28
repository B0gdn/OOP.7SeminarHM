package main.java.ru.geekbrains.lesson7.observer;

import java.util.Random;

public class Company {

    private Random random = new Random();

    private String name;
    private Publisher jobAgency;
    private int maxSalary;

    private Vacancy vacancy;

    public Company(String name, Publisher jobAgency, int maxSalary, Vacancy vacancy) {
        this.name = name;
        this.jobAgency = jobAgency;
        this.maxSalary = maxSalary;
        this.vacancy = vacancy;
    }

    public void needEmployee(){
        int salary = random.nextInt(maxSalary);
        jobAgency.sendOffer(name, salary, vacancy);
    }

    public static class Program {

        public static void main(String[] args) {

        }

    }
}
