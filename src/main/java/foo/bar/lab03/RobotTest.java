package foo.bar.lab03;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by giylmi on 06.04.2015.
 */
public class RobotTest {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
    }
}
