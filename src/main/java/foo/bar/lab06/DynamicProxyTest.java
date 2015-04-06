package foo.bar.lab06;

import foo.bar.lab05.RealSubject;
import foo.bar.lab05.Subject;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * Created by giylmi on 06.04.2015.
 */
public class DynamicProxyTest {

    public static void main(String[] args) throws InterruptedException {
        Subject subject = (Subject) Proxy.newProxyInstance(Subject.class.getClassLoader(), new Class[]{Subject.class}, new InvocationHandler() {
            private RealSubject subject = new RealSubject();
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                long start = System.currentTimeMillis();
                Object returnValue = method.invoke(subject, args);
                System.out.println("Time: " + (System.currentTimeMillis() - start) + " elapsed");
                return returnValue;
            }
        });
        subject.longMethod();
    }
}
