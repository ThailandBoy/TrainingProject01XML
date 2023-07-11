package ru.alishev.springcourse;

import Entity.ClassicalMusic;
import Entity.Music;
import Service.CarService;
import Service.FactoryMethodExample;
import Service.InitDestroyExample;
import Service.MusicPlayer;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        // Из спринг-контекста импортируем класс ClassPathXmlApplicationContext
        // Этот класс обращается к файлу ApplicationContext.xml и считывает его
        // и помещает все бины которые там описаны в ApplicationContext
        // обязательно следите за совпадением имен файлов, и чтобы сам ресурсный файл находился
        // в папке который отмечен как "Resources root"
        // в ином случае ClassPathXmlApplicationContext не сможет найти этот файл
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");

        FactoryMethodExample factoryMethodExample = context.getBean("factoryMethodExample", FactoryMethodExample.class);
        factoryMethodExample.getCheckFactory();

        InitDestroyExample initDestroyExample = context.getBean("initDestroyExample", InitDestroyExample.class);
        System.out.println(initDestroyExample.getMyInit());

        MusicPlayer music = context.getBean("musicPlayer", MusicPlayer.class);
        //music.playMusic();
        music.playMusicList();
        System.out.println("Length "+music.getLength());
        System.out.println("Size "+music.getSize());

        CarService carService = context.getBean("carService", CarService.class);
        carService.printAuto();
        System.out.println("CarCount "+carService.getCarCount());
        System.out.println("available "+carService.isAvailable());
        context.close();
    }


}
