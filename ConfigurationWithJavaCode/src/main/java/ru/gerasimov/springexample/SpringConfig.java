package ru.gerasimov.springexample;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
//@ComponentScan("ru.gerasimov.springexample") посмотрим как все это делается вручную и уберем все @Autowired
@PropertySource("classpath:musicPlayer.properties")
public class SpringConfig {
    //убрали все @Component & @Autowired Spring болеше не будет автоматически создавать бины из классов и не будет
    //автоматически внедрять зависимости

    //Реализуем в ручную:
    @Bean
    public PopMusic popMusic() {
        return new PopMusic();
    }

    @Bean
    public RockMusic rockMusic() {
        return new RockMusic();
    }

    @Bean
    public MusicPlayer musicPlayer() {
        return new MusicPlayer(popMusic(), rockMusic());
    }

    @Bean
    public Computer computer() {
        return new Computer(musicPlayer());
    }
}
