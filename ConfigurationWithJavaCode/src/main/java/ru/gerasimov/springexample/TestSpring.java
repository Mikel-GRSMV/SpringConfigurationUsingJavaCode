package ru.gerasimov.springexample;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);

        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);

        System.out.println(musicPlayer.getName());
        System.out.println(musicPlayer.getVolume());

        PopMusic popMusic = context.getBean("popMusic", PopMusic.class);
        PopMusic popMusic1 = context.getBean("popMusic", PopMusic.class);

        System.out.println(popMusic == popMusic1);

        context.close();
    }
}