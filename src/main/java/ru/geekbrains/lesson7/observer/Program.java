package main.java.ru.geekbrains.lesson7.observer;

import static main.java.ru.geekbrains.lesson7.observer.Vacancy.*;

public class Program {

    /**
     * TODO: Доработать приложение, которое разрабатывалось на семинаре, поработать с шаблоном проектирования Observer,
     *  добавить новый тип соискателя.
     *  Добавить новую сущность "Вакансия", компания должна рассылать вакансии.
     *  Только после этого вы можете усложнить ваше приложение (при желании),
     *  например, добавить тип вакансии (enum), учитывать тип вакансии при отправке предложения соискателю.
     * @param args
     */
    public static void main(String[] args) {
        Publisher jobAgency = new JobAgency();
        Company google = new Company("Google",  jobAgency,120000, IT);
        Company yandex = new Company("Yandex",  jobAgency,90000, Manager);
        Company geekBrains = new Company("GeekBrains",  jobAgency,95000, HR);

        Student student1 = new Student("Student1", IT);
        Worker worker1 = new Worker("Worker1", HR);
        Worker worker2 = new Worker("Worker2", Manager);
        ITWorker itWorker1 = new ITWorker("ITWorker1", IT);
        ITWorker itWorker2 = new ITWorker("ITWorker2", IT);

        jobAgency.registerObserver(student1);
        jobAgency.registerObserver(worker1);
        jobAgency.registerObserver(worker2);
        jobAgency.registerObserver(itWorker1);
        jobAgency.registerObserver(itWorker2);


        for (int i = 0; i < 3; i++){
            google.needEmployee();
            yandex.needEmployee();
            geekBrains.needEmployee();
        }


    }

}
