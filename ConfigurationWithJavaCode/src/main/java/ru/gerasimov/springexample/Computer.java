package ru.gerasimov.springexample;

//@Component //пометим его как бин //убрали для проверки вручную
public class Computer {
    private int id;
    private MusicPlayer musicPlayer; //зависимость

    // @Autowired убрали для проверки вручную
    public Computer(MusicPlayer musicPlayer) { //в качестве зависимости в наш компьютер будем передавать только musicPlayer
        this.id = 1;//те id не будет внедрятся Spring'ом
        this.musicPlayer = musicPlayer;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "id=" + id +
                ", musicPlayer=" + musicPlayer.playMusic() +
                '}';
    }
}