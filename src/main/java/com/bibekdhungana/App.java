package com.bibekdhungana;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        System.out.println("--------------------Started-------------------");
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("laptop.xml");
        Laptop laptop = applicationContext.getBean("laptop", Laptop.class);
        System.out.println(laptop);
        ((AbstractApplicationContext) applicationContext).close();
        System.out.println("--------------------End------------------------");
    }
}
