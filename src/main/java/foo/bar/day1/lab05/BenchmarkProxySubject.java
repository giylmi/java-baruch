package foo.bar.day1.lab05;

/**
 * Created by giylmi on 06.04.2015.
 */
public class BenchmarkProxySubject implements Subject {
    private RealSubject subject = new RealSubject();

    @Override
    public int longMethod() throws InterruptedException {
        Long now = System.currentTimeMillis();
        int count = subject.longMethod();
        System.out.println("Time: " + (System.currentTimeMillis() - now) + " elapsed");
        return count;
    }
}
