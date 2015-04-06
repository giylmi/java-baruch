package foo.bar.lab05;

import foo.bar.lab07.Benchmark;
import foo.bar.lab08.Transaction;

/**
 * Created by giylmi on 06.04.2015.
 */
@Transaction
public class RealSubject implements Subject {
    @Override
    @Benchmark
    public int longMethod() throws InterruptedException {
        int count = 0;
        for (int i = 0; i < 5; i++) {
            Thread.sleep(1000);
            count++;
        }
        return count;
    }
}
