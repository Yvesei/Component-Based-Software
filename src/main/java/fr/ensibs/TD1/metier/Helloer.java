package fr.ensibs.TD1.metier;

import fr.ensibs.TD1.dao.IPrinter;
import fr.ensibs.TD1.dao.Printer;

import java.awt.image.ImageProducer;

public class Helloer implements IHelloer{
    private IPrinter printer;
//    public Helloer(IPrinter printer){
//        this.printer =printer;
//    }

    public void setPrinter(IPrinter printer) {
        this.printer = printer;
    }

    @Override
    public void sayHello(){
        this.printer.printHello("Dependency Injection using XML & setter");
    }
}
