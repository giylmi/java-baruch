package foo.bar.lab02;

import foo.bar.lab03.Robot;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by giylmi on 06.04.2015.
 */
public class QuoterTest {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
        Quoter quoter = context.getBean(Quoter.class);
        quoter.sayQuote();
    }
}
