package com.knoldus;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {

        ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");

        // retrieve the messagePrinter bean form ApplicationContext.
        MessagePrinter messagePrinter=(MessagePrinter) context.getBean("messagePrinter");

        // calling displayMessageService method to print the message.
        messagePrinter.displayMessageService();
    }
}