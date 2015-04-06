package foo.bar.lab03;

import foo.bar.lab01.RunThisMethod;
import foo.bar.lab02.Quoter;

import java.util.List;

/**
 * Created by giylmi on 06.04.2015.
 */
public class TalkingRobot implements Robot {

    private List<Quoter> quoters;

    public List<Quoter> getQuoters() {
        return quoters;
    }

    public void setQuoters(List<Quoter> quoters) {
        this.quoters = quoters;
    }

    @Override
    @RunThisMethod
    public void talk() {
        for (Quoter quoter: quoters)
            quoter.sayQuote();
    }
}
