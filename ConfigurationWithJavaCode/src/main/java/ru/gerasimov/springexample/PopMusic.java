package ru.gerasimov.springexample;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

//@Component убрали для проверки вручную
public class PopMusic implements Music {

    @PostConstruct
    public void doMyInit() {
        System.out.println("Doing my initialization");
    }

    @PreDestroy
    public void doMyDestroy() {
        System.out.println("Doing my destroy");
    }

    @Override
    public String getMusic() {
        return "Remeber the time";
    }

    @Override
    public String getSingerName() {
        return "Michael Jackson";
    }
}