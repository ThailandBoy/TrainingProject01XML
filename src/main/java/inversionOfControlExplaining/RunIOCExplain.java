package inversionOfControlExplaining;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import ru.alishev.springcourse.TestBean;

public class RunIOCExplain {

    // Класс для запуска первого тестового бина и musicPlayer (это пример dependency injection)
    public static void musicPlayer() {
        // По правильному, вместо кода ниже, нужно вызвать контекст и получить из него бин
        DependencyInjection musicPlayer = new DependencyInjection(new ClassicalMusic3());
        musicPlayer.playMusic();
    }

    public static void testBean(ClassPathXmlApplicationContext context){
        // Это первый тестовы бин.
        // Теперь когда мы создали ApplicationContext, когда спринг прочитал конфигурационный файл
        // из ApplicationContext, мы можем достать бин который был создан спрингом
        // в метод .getBean() в качестве аргумента, передаем id того бина, который создан спрингом
        // вторым аргументом передаем, название класса-бина которого хотим получить
        // сохраняем полученный результат метода .getBean(), в объект класса TestBean
        TestBean testBean = context.getBean("testBean", TestBean.class);

        // благодаря тому что ранее, в конфигурационном файле был

        // выводим значение хранящееся в объекте
        System.out.println(testBean.getName());

        // после работы с спрингом
        // после работы с ApplicationContext
        // контекст нужно обязательно закрыть
        context.close();
        StrongDependency musicPlayer = new StrongDependency();
        musicPlayer.playMusic();
    }
}
