package fr.ensibs.TD1.dao;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Printer implements IPrinter{
    private String msg;
    public void setMsg(String msg) {
        this.msg = msg;
    }
    public void printHello(){
        System.out.println(this.msg);
    }
}
