package inversionOfControlExplaining;


// Пример проблемы сильной зависимости:
// есть MusicPlayer который должен воспроизводить музыку
// но из-за "сильной зависимости" MusicPlayer способен воспроизводить только
// классическую музыку
public class StrongDependency {
    private ClassicMusic1 classicMusic;
    public void playMusic() {
        classicMusic = new ClassicMusic1();
        System.out.println(classicMusic.getClass()+" только классическая музыка");
        // ... код для воспроизведения музыки
    }
}
class ClassicMusic1 {
}
