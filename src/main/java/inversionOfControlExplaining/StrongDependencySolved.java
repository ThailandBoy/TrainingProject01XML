package inversionOfControlExplaining;

// Решением проблемы сильной зависимости является использование интерфейса
// Пример ниже
interface Music2 {
    // ... Код необходимый для доступа к любому жанру музыки ...
}

class ClassicalMusic2 implements Music2 {
}

class RockMusic2 implements Music2 {
}

// Объявив поле через интерфейс, можно создавать классы реализующие этот интерфейс
// что решает проблему сильной зависимости, теперь класс может воспроизволить
// не только классическую музыку но еще и рок музыку
// Пример: List<Integer> list = new ArrayList<>();
//         List<Integer> list = new LinkedList<>();
//         List<Integer> list = new Vector<>();
//           Тоесть использование одного общего интерфейса для инициализации реализующих классов.
// По воможости, всегда используйте интерфейс при инициализации объектов.
public class StrongDependencySolved {
    private Music2 music;
    public void playMusic() {
        music = new ClassicalMusic2();
        // или
        music = new RockMusic2();
        // ... код воспроизведения музыки
    }
}
