package com.grapefruit;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App {
    public static void doSome() {
        System.out.println( "Hello World!" );
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        Object context = applicationContext.getBean("cacheContext");
        System.out.println(context);

    }
}
