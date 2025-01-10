package fr.ensibs.TD1.metier;

import fr.ensibs.TD1.dao.IPrinter;
import fr.ensibs.TD1.dao.Printer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.awt.image.ImageProducer;
@Component("Helloer")
public class Helloer implements IHelloer{
    @Autowired
    @Qualifier("hello2")
    private IPrinter printer;
    @Override
    public void sayHello(){
        this.printer.printHello();
    }
}
