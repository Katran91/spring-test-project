package com.gmail.stratij.spring;

import com.gmail.stratij.spring.sequence.SequenceGenerator;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

        SequenceGenerator generator = (SequenceGenerator) context.getBean("sequenceGenerator");
    }
}
