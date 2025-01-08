package fr.ensibs.TD1.presentation;

import fr.ensibs.TD1.metier.IHelloer;
import org.springframework.beans.BeansException;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class presentation {
    public static void main(String[] args) {
        try (ConfigurableApplicationContext context =
                     new ClassPathXmlApplicationContext("config.xml")) {
            IHelloer helloer =(IHelloer)context.getBean ("helloer");
            helloer.sayHello();
        } catch (BeansException e) {
            e.printStackTrace();
        }
    }
}
