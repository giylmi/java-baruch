package foo.bar.day1.lab01;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * Created by giylmi on 06.04.2015.
 */
public class ObjectFactory {

    public Object createObject(Class clazz) throws IllegalAccessException, InstantiationException, InvocationTargetException {
        Object o = clazz.newInstance();
        for (Method method: clazz.getMethods()){
            RunThisMethod annotation = method.getAnnotation(RunThisMethod.class);
            if (annotation != null){
                for (int i = 0; i < annotation.repeat(); i++){
                    method.invoke(o);
                }
            }
        }
        return o;
    }
}
