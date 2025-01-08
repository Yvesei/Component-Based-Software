package fr.ensibs.TD1.dao;

import org.springframework.stereotype.Component;

@Component
public class Printer implements IPrinter{
    public void printHello(String msg){
        System.out.println(msg);
    }
}
