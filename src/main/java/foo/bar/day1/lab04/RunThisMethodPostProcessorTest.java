package foo.bar.day1.lab04;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by giylmi on 06.04.2015.
 */
public class RunThisMethodPostProcessorTest {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("context04.xml");
        RandomIntHolder randomIntHolder = context.getBean(RandomIntHolder.class);
        System.out.println("random int:" + randomIntHolder.getRandomInt());
    }
}
