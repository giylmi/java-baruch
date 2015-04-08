package foo.bar.day1.lab02;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by giylmi on 06.04.2015.
 */
public class QuoterTest {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("context02.xml");
        Quoter quoter = context.getBean(Quoter.class);
        quoter.sayQuote();
    }
}
