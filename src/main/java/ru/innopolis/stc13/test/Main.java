package ru.innopolis.stc13.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import ru.innopolis.stc13.test.IO.ConfigurationContext;
import ru.innopolis.stc13.test.IO.DataHandler;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(ConfigurationContext.class);
        DataHandler handler = (DataHandler) context.getBean("dataHandler");
        handler.handleData("SomeSrcPath", "SomeDescPath");
        DataHandler handler2 = (DataHandler) context.getBean("dataHandler");
        handler2.handleData("SomeSrcPath2", "SomeDescPath2");
    }
}