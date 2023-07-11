package inversionOfControlExplaining;

public class DependencyInjection {
    private Music3 music;

    // Внедрение зависимости извне (IoC)
    public DependencyInjection(Music3 music){
        this.music = music;
    }
    public void playMusic() {
//        music = new ClassicalMusic2();
//        // или
//        music = new RockMusic();
        // ... ТОЛЬКО код воспроизведения музыки
        System.out.println("playMusic activated!");
    }
}
