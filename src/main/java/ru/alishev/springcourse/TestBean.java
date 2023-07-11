package ru.alishev.springcourse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

// Объект который создается из класса, в спринге называется бин
// когда мы передадим спрингу этот класс, он из этого класса создаст бин
// бин штука очень похожая на объект
@Component
public class TestBean {
    private String name;

    public TestBean(String s) {
        name = s;
    }

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
}
