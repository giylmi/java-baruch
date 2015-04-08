package foo.bar.day1.lab01;

import java.lang.reflect.InvocationTargetException;

/**
 * Created by giylmi on 06.04.2015.
 */
public class ObjectFactoryTest {

    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InvocationTargetException, InstantiationException {
        Class clazz = Class.forName(args[0]);
        ObjectFactory objectFactory = new ObjectFactory();
        System.out.println(objectFactory.createObject(clazz).toString());
    }
}
