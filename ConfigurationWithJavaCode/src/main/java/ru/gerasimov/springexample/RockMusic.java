package ru.gerasimov.springexample;

//@Component убрали для проверки вручную
public class RockMusic implements Music {
    @Override
    public String getMusic() {
        return "This Love";
    }

    @Override
    public String getSingerName() {
        return "Maroon 5";
    }
}