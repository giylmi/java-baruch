package foo.bar.day2.lab03;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.junit.Assert.*;

public class SpeakingRobotTest {

    @Test
    public void testRandomQuotes(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("day2/context03.xml");
        SpeakingRobot robot = context.getBean(SpeakingRobot.class);
        Assert.assertNotEquals(robot.speak(), robot.speak());
    }

}